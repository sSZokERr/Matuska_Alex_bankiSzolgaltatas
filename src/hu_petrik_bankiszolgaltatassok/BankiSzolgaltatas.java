package hu_petrik_bankiszolgaltatassok;

public abstract class BankiSzolgaltatas {
    private Tulajdonos tulajdonos;
    public BankiSzolgaltatas(Tulajdonos tulajdonos){
        this.tulajdonos = tulajdonos;
    }
    public Tulajdonos getTulajdonos(){
        return this.tulajdonos;
    }
}
