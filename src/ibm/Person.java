package ibm;

public class Person {
    private double gewicht;
    private double groesse;
    private boolean isMale;
    private String sex;

    public double getGewicht(){return gewicht;}
    public void setGewicht(double gewicht) {
        if(gewicht > 0)this.gewicht = gewicht;
        else this.gewicht = 0;
    }

    public boolean isMale(){return isMale;}
    public void setMale(boolean isMane) {
        this.isMale = isMane;
        addSex();
    }

    public double getGroesse(){return groesse;}
    public void setGroesse( double groesse ){
        if (groesse > 0) this.groesse = groesse;
        else this.groesse = 0;
    }

    public void addSex(){
        this.sex = (isMale) ? "Male" : "Female";
    }
    public String getSex(){return sex;}
}
