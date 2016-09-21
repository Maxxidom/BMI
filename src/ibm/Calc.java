package ibm;

/*
BMI = (Gewicht / (Groesse * Groesse))* 10000

Gewicht in kg und Körpergröße in cm.

BMI-Index                Frauen / Männer
-----------------------------------------
Untergewicht                <19 / <20
Normalgewicht          19 - <25 / 20 - <26
Übergewicht             25 - 30 / 26 - 30
Starkes Übergewicht        > 30 / >30
*/

public class Calc {
    double ergebnis;
    String erg;

    public double getErgebnis(){return ergebnis;}
    public void setErg( String erg ){this.erg = erg;}
    public String getErg(){return erg;}

    public void setBmi( double gewicht, double groesse ){
        this.ergebnis = (gewicht / (groesse * groesse)) * 10000;
    }

    public void setCalc(String sex){
        if (ergebnis < 19 || (ergebnis < 20 && sex == "Male")){
            this.erg = "Du hast leichtes Untergewicht!" ;
        }else if (ergebnis < 25 || (ergebnis < 26 && sex == "Male")) {
            this.erg = "Du hast Normalgewicht!";
        }else if (ergebnis <= 30) {
            this.erg = "Du hast deutliches Übergewicht!";
        }else{
            this.erg = "Du hast starkes Uebergewicht!";
        }


    }
}
