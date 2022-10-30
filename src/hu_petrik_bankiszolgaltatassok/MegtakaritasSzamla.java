package hu_petrik_bankiszolgaltatassok;

public class MegtakaritasSzamla extends Szamla{
    private double kamat;
    public static double alapKamat = 7;

    public MegtakaritasSzamla(Tulajdonos tulajdonos){
        super(tulajdonos);
        this.kamat = alapKamat;
    }
    public double getKamat(){
        return kamat;
    }
    public void setKamat(double kamat){
        this.kamat = kamat;
    }
    @Override
    public boolean kivesz(int osszeg){
        int kivett = super.getAktualisEgyenleg() - osszeg;
        if (kivett >= 0){
            return true;
        }else {
            return false;
        }
    }
    public void kamatJovairas(){
        super.aktualisEgyenleg = (int) (super.aktualisEgyenleg * (1 + (this.kamat / 100)));
    }
}
