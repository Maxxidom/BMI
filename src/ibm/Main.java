package ibm;

public class Main {
    public static void main( String[] args ){
        Person person = new Person();
        person.setGewicht(56);
        person.setGroesse(173);
        person.setMale(true);
        String sex = person.getSex();

        Calc calc = new Calc();
        calc.setBmi(person.getGewicht(),person.getGroesse());

        System.out.println("\n");
        System.out.println("Ihr  Gewicht: " + person.getGewicht() + " Kilogramm");
        System.out.println("Ihre Größe:   "  + (int)person.getGroesse() + " Zentimeter");
        System.out.println("-----------------------------");
        System.out.println("Ihr  BMI ist: [ " + (int)calc.getErgebnis() + " ] " + calc.getErg());
        System.out.println("__________________________________________");
    }
}
