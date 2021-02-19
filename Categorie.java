import java.util.ArrayList;
import java.util.List;

public class Categorie{
	public static int ID_Categorie=0;
	private String LibelleCategorie;
	private List<Article> lesarticles;
	
	public Categorie()
	{
		ID_Categorie++;
		lesarticles = new ArrayList<Article>();
	}
	
	public Categorie(String libelleCategorie) {
		ID_Categorie++;
		LibelleCategorie = libelleCategorie;
		lesarticles = new ArrayList<Article>();
	}

	
	public void ajouterArticle(Article art)
	{
		lesarticles.add(art);
	}
	
	public void supprimerArticle(Article art)
	{
		if(lesarticles.contains(art))
		{
			lesarticles.remove(art);
			System.out.println("L'article a bien �t� supprimer !");
		}
	}
	
	public void Affichage()
	{
		System.out.println(toString());
	}
	
	public int getID_Categorie() {
		return ID_Categorie;
	}	
	public String getLibelleCategorie() {
		return LibelleCategorie;
	}
	public void setLibelleCategorie(String libelleCategorie) {
		LibelleCategorie = libelleCategorie;
	}

	public List<Article> getLesarticles() {
		return lesarticles;
	}

	public void setLesarticles(List<Article> lesarticles) {
		this.lesarticles = lesarticles;
	}

	@Override
	public String toString() {
		return "- Categorie (" + this.LibelleCategorie + ") : \n les articles : " + lesarticles + " ";
	}
	

}
