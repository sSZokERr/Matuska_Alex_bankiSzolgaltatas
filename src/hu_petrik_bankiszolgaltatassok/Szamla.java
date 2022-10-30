package hu_petrik_bankiszolgaltatassok;

public abstract class Szamla extends BankiSzolgaltatas{
    protected int aktualisEgyenleg;
    public Szamla(Tulajdonos tulajdonos){
        super(tulajdonos);
    }
    public int getAktualisEgyenleg(){
        return aktualisEgyenleg;
    }
    public void befizet(int osszeg){
        this.aktualisEgyenleg += osszeg;
    }
    public boolean kivesz(int osszeg){
        if (this.aktualisEgyenleg - osszeg > 0){
            this.aktualisEgyenleg = this.aktualisEgyenleg - osszeg;
            return true;
        }else {
            return false;
        }
    }
    public Kartya ujKartya(String kartyaSzam){
        return new Kartya(this.getTulajdonos(), this, kartyaSzam);
    }
}
