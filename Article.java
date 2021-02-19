import java.util.Date;
public class Article {
private int ID_Article;
private String LibelleArticle;
private String categorieinit;
private String DescriptionArticle;
private Date DateAjoutArticle;
private Date DateExpirationArticle;
private double TaxeArticle;
private double PrixArticle;
private int QuantiteDisponibleArticle;
private Marque maMarque;
    public Article(){
    }
    public Article(int id,String LibArt, String DescArt,Date DateA,String categorieinit, Date DateE, double TaxeA, double PrixA, int QuantD){
        this.ID_Article = id;
        this.LibelleArticle=LibArt;
        this.categorieinit = categorieinit;
        this.DescriptionArticle=DescArt;
        this.DateAjoutArticle=DateA;
        this.DateExpirationArticle=DateE;
        this.TaxeArticle=TaxeA;
        this.PrixArticle=PrixA;
        this.QuantiteDisponibleArticle=QuantD;
        Categorie cat =new Categorie();
    }
    
    
    
      //Methode affichage Marque
        public void setMarque(Marque Mr){
    		if((maMarque!= null)&&(! maMarque.aPourArticle(this))||(this.maMarque!=null)&&(this.maMarque.aPourArticle(this)))
    		{
    			throw new UnsupportedOperationException("Set Marque ne peut pas etre appeler directement");
    		}
    		
    		this.maMarque = Mr;		
    }
     
    public String toString() {
        	return "- Article [ID_Article=" + ID_Article + " LibelleArticle="
                + LibelleArticle + ", DescriptionArticle=" + DescriptionArticle
        		+ ", DateAjoutArticle=" + DateAjoutArticle
        		+ ", DateExpirationArticle=" + DateExpirationArticle
        		+ ", TaxeArticle=" + TaxeArticle + ", PrixArticle=" + PrixArticle
        		+ ", QuantiteDisponibleArticle=" + QuantiteDisponibleArticle + "]";
        }
        
        
	public void Affichage()
	{
		System.out.println(toString());
	}
	public int getID_Article() {
		return ID_Article;
	}
	public void setID_Article(int iD_Article) {
		ID_Article = iD_Article;
	}
	public String getLibelleArticle() {
		return LibelleArticle;
	}
	public void setLibelleArticle(String libelleArticle) {
		LibelleArticle = libelleArticle;
	}
	public String getCategorieinit() {
		return categorieinit;
	}
	public void setCategorieinit(String categorieinit) {
		this.categorieinit = categorieinit;
	}
	public String getDescriptionArticle() {
		return DescriptionArticle;
	}
	public void setDescriptionArticle(String descriptionArticle) {
		DescriptionArticle = descriptionArticle;
	}
	public Date getDateAjoutArticle() {
		return DateAjoutArticle;
	}
	public void setDateAjoutArticle(Date dateAjoutArticle) {
		DateAjoutArticle = dateAjoutArticle;
	}
	public Date getDateExpirationArticle() {
		return DateExpirationArticle;
	}
	public void setDateExpirationArticle(Date dateExpirationArticle) {
		DateExpirationArticle = dateExpirationArticle;
	}
	public double getTaxeArticle() {
		return TaxeArticle;
	}
	public void setTaxeArticle(double taxeArticle) {
		TaxeArticle = taxeArticle;
	}
	public double getPrixArticle() {
		return PrixArticle;
	}
	public void setPrixArticle(double prixArticle) {
		PrixArticle = prixArticle;
	}
	public int getQuantiteDisponibleArticle() {
		return QuantiteDisponibleArticle;
	}
	public void setQuantiteDisponibleArticle(int quantiteDisponibleArticle) {
		QuantiteDisponibleArticle = quantiteDisponibleArticle;
	}
	public void decrementerArticle(int i){
		this.QuantiteDisponibleArticle-=i;
	}
	public Marque getMaMarque() {
		return maMarque;
	}
	public void setMaMarque(Marque maMarque) {
		this.maMarque = maMarque;
	}
	
	



}
