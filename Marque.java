/**
 * 
 */

/**
 * @author david
 *
 */

import java.util.ArrayList;
import java.util.List;




public class Marque {
static int ID_Marque=0;
private String libelleMarque;
private List <Article> mesArticles;
public Marque(){
	ID_Marque++;
}
public Marque(String libelleMarque) 
{
	ID_Marque++;
	this.libelleMarque = libelleMarque;
	ArrayList<Article> mesArticles;
}
public int getID_Marque()
{
	return ID_Marque;
}

public String getLibelleMarque() {
	return libelleMarque;
}
public void setLibelleMarque(String libelleMarque)
{
	this.libelleMarque = libelleMarque;
}
public boolean aPourArticle(Article Ar)
{
	return (this.mesArticles.contains(Ar));
	
}
public void creerArticle(Article Ar) throws ArticleException 
{
	if(this.aPourArticle(Ar) == true)
	{
		throw new ArticleException("L'article a deja ete cree par la marque");
	}
	Marque Mr = Ar.getMaMarque();
	
	if(Mr == null)
	{
		this.mesArticles.add(Ar);
		Ar.setMarque(this);
	}
	else
	{
		Mr.mesArticles.remove(Ar);
		this.mesArticles.add(Ar);
		Ar.setMarque(this);
		
	}
}
public void RetirerDe(Article Ar) throws ArticleException
{
	if(!this.mesArticles.remove(Ar))//Vu que le remove indique si l'article appartienne, alors s'il 
	{
		throw new ArticleException("L'employe n'appartient pas a� l'entreprise");
	}
	
}
@Override
public String toString() {
	return "Marque [libelleMarque=" + libelleMarque + ", mesArticles=" + mesArticles + "]";
}

}
