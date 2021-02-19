public class Facture {
    private static int Id_facture=1;
    private double prixTotal;
    public Facture(){

    }
    public Facture(double prixT){
        Id_facture++;
        this.prixTotal=prixT;
    }
    public double GetPrixTotal(){
        return this.prixTotal;
    }
    public  int GetId_Facture(){
        return Id_facture;
    }
    public void setPrixTotal(double Prix){
        this.prixTotal=Prix;
    }

}
