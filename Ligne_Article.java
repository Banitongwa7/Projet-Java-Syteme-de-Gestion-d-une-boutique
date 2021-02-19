
import java.util.Date;

public class Ligne_Article {
	private int IDfourn;
	private int IDArticle;
	private double QteFourn;
	private Date Datefourn;
	
	public Ligne_Article (int iDfourn, int iDArticle, double qteFourn,
			Date datefourn) 
	{
		IDfourn = iDfourn;
		IDArticle = iDArticle;
		QteFourn = qteFourn;
		Datefourn = datefourn;
	}

	public int getIDfourn() {
		return IDfourn;
	}

	public int getIDArticle() {
		return IDArticle;
	}

	public double getQteFourn() {
		return QteFourn;
	}

	public Date getDatefourn() {
		return Datefourn;
	}

	public void setIDfourn(int iDfourn) {
		IDfourn = iDfourn;
	}

	public void setIDArticle(int iDArticle) {
		IDArticle = iDArticle;
	}

	public void setQteFourn(double qteFourn) {
		QteFourn = qteFourn;
	}

	public void setDatefourn(Date datefourn) {
		Datefourn = datefourn;
	}
	
	@Override
	public String toString() {
		return "Ligne_Article [IDArticle=" + IDArticle + ", QteFourn="
				+ QteFourn + ", Datefourn=" + Datefourn + "]";
	}

	
	
	
	
	
}
