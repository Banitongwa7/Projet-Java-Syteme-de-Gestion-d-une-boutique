import java.util.*;
public class Fournisseur {
    static int IdFourn=0;
    private String NomFourn;
    private String AddresseFourn;
    private int Numerodetelephone;
    private String PaysFourn;
    private String VilleFourn;
    private List<Article>lesArticles;
    public Fournisseur(){
        this.IdFourn=0;
        this.NomFourn="";
        this.AddresseFourn="";
        this.Numerodetelephone=0;
        this.PaysFourn="";
        this.VilleFourn="";
        lesArticles=new ArrayList<Article>();
    }
    public Fournisseur(String Nom, String AddresseF, String PaysF, String VilleF){
        IdFourn++;
        this.NomFourn=Nom;
        this.AddresseFourn=AddresseF;
        this.PaysFourn=PaysF;
        this.VilleFourn=VilleF;
    }
    public String GetNomFourn(){
        return NomFourn;
    }
    public String GetAddrFourn(){
        return AddresseFourn;
    }
    public int GetNumero(){
        return Numerodetelephone;
    }
    public String GetPaysourn(){
        return PaysFourn;
    }
    public String GetVilleFourn(){
        return VilleFourn;
    }

    public void setId(int id){
        this.IdFourn=id;
    }
    public void setNomF(String NomF){
        this.NomFourn=NomF;
    }
    public void setAdFourn(String Addresse){
        this.AddresseFourn=Addresse;
    }
    public void setNumber(int Num){
        this.Numerodetelephone=Num;
    }
    public void setPaysF(String PaysF){
        this.PaysFourn=PaysF;
    }
    public void setVilleF(String Ville){
        this.VilleFourn=Ville;
    }
    public void AjouterArticle(Article Ar){
        lesArticles.add(Ar);
    }
    public void SupprimerArticle(Article art){
        if(lesArticles.contains(art))
		{
			lesArticles.remove(art);
			System.out.println("L'article a bien été supprimer !");
		}else{
            System.out.println("L'article n'existe pas");
        }
    }

}
