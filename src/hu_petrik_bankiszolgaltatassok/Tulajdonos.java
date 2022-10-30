package hu_petrik_bankiszolgaltatassok;

public final class Tulajdonos {
    private String nev;

    public Tulajdonos(String nev){
        this.nev = nev;
    }
    public String getNev(){
        return this.nev;
    }
    public void setNev(String nev){
        this.nev = nev;
    }
}
