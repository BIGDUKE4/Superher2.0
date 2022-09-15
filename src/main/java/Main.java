import java.util.Scanner;

public class Main {
    private Database db;
    public static void main(String[] args) {
        int user;
        Main m = new Main();
        m.db = new Database();
        Scanner sc = new Scanner(System.in);

        Userinterface ui = new Userinterface();

        Database data = new Database(); //Objekt
        //BrugerInput
        do {
            System.out.println("""
                    Velkommen til SUPER HERO UNIVERSE.
                    1. Opret Superhelt
                    2. Tilgå Superhelt database
                    3. Søg efter Superhelte 
                    9. Afslut
                    """);

            user = sc.nextInt();
            if (user == 1) {
                System.out.println("Hvad hedder din superhelt?");
                String superHeroName = sc.next();
                System.out.println("Hvad er din superhelts superkræfter?");
                String Superpower = sc.next();
                System.out.println("Hvilket årstal blev din superhelt oprettet i?");
                int creationYear = sc.nextInt();
                System.out.println("Hvor høj er din superhelt?");
                double height = sc.nextDouble();
                System.out.println("Er din superhelt et menneske (Ja/Nej");
                String isHumanOrNotString = sc.next();
                boolean HumanOrNot = false;
                if (isHumanOrNotString.equalsIgnoreCase("Ja")) {
                    HumanOrNot = true;
                }

                //Kalder på metoden fra klassen "Database"
                data.addHeroes1(superHeroName, Superpower, creationYear, height, HumanOrNot);

            }else if (user == 2) {
                data.printData();
            }else if (user == 3) {
                System.out.println();
            }
        } while (user != 9);
    }
}