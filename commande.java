import java.sql.Date;
public class commande {
    private static int IdCommande;
    private String DateCommande;
    private String DateLivraison;
    private double MntCommande;
    private String LieuLivrCommande;
    private String ModePayCommande;
    private boolean ValidationCommande;

    public commande(){
        this.IdCommande=0;
        this.DateCommande="";
        this.DateLivraison="";
        this.MntCommande=0;
        this.LieuLivrCommande="";
        this.ModePayCommande="";
        this.ValidationCommande=false;
    }
    public commande( String DateC, String DateL, double MntCom, String LieuLivrC, String ModePCom,boolean ValidCom){
        this.IdCommande++;
        this.DateCommande=DateC;
        this.DateLivraison=DateL;
        this.MntCommande=MntCom;
        this.LieuLivrCommande=LieuLivrC;
        this.ModePayCommande=ModePCom;
        this.ValidationCommande=ValidCom;

    }
    public int GetIdCommande(){
        return IdCommande;
    }
    public String GetDateCom(){
        return DateCommande;
    }
    public String GetDateLivrCom(){
        return DateLivraison;
    }
    public double GetMntCom(){
        return MntCommande;
    }
    public String GetLieuLivrCom(){
        return LieuLivrCommande;
    }
    public String GetModePayCom(){
        return ModePayCommande;
    }
    public boolean GetValidCom(){
        return ValidationCommande;
    }

    public void setId(int id){
        this.IdCommande=id;
    }
    public void setDateCom(String DateC){
        this.DateCommande=DateC;
    }
    public void setDateLiv(String DateL){
        this.DateLivraison=DateL;
    }
    public void setMntCom(double Mnt){
        this.MntCommande=Mnt;
    }
    public void setLieuLivr(String LieuLivr){
        this.LieuLivrCommande=LieuLivr;
    }
    public void setModePay(String ModePay){
        this.ModePayCommande=ModePay;
    }
    public void setValidCom(boolean Valid){
        this.ValidationCommande=Valid;
    }
    public String toString(){
        String etat="";
        if(this.GetValidCom()==false){
            etat="en attente";
        }else{
            etat="confirmé";
        }
        return "MONTANT = "+this.GetMntCom()+" LIEU= "+this.GetLieuLivrCom()+" MODE DE PAIEMENT= "+this.GetModePayCom()+"   "+etat;
    }
    
    
    

}
