
import java.util.Date;

public class Ligne_Commande {
    private int IDCommande;
    private int IDArticle;
    private int QteArticle;
    private Date DateCommande;
    private static int L_Commande=0;
    public Ligne_Commande(){

    }
    public Ligne_Commande(int IDCommande, int IDArticle, int qteArticle, Date dateCommande) {
        L_Commande++;
        this.IDCommande = IDCommande;
        this.IDArticle = IDArticle;
        QteArticle = qteArticle;
        DateCommande = dateCommande;
    }

    public int getIDCommande() {
        return IDCommande;
    }

    public void setIDCommande(int IDCommande) {
        this.IDCommande = IDCommande;
    }

    public int getIDArticle() {
        return IDArticle;
    }

    public void setIDArticle(int IDArticle) {
        this.IDArticle = IDArticle;
    }

    public int getQteArticle() {
        return QteArticle;
    }

    public void setQteArticle(int qteArticle) {
        QteArticle = qteArticle;
    }

    public Date getDateCommande() {
        return DateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        DateCommande = dateCommande;
    }

    @Override
    public String toString() {
        return "Ligne_Commande{" +
                "IDCommande='" + IDCommande + '\'' +
                ", IDArticle='" + IDArticle + '\'' +
                ", QteArticle=" + QteArticle +
                ", DateCommande=" + DateCommande +
                '}';
    }

    public void afficheLigne()
    {
        System.out.println(toString());
    }
}
