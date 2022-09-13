import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        String superpower;
        int creationyea;
        double heights;
        boolean humanornot;
        int user;
        Scanner sc = new Scanner(System.in);

        //BrugerInput
        do {
            System.out.println("""
                    Velkommen til SUPER HERO UNIVERSE.
                    1. Opret superhelt
                    9. Afslut
                    """);

            user = sc.nextInt();
            if (user == 1) {
                System.out.println("Hvad hedder din superhelt?");
                name = sc.next();
                System.out.println("Hvad er din superhelts superkræfter?");
                superpower = sc.next();
                System.out.println("Hvilket årstal blev din superhelt oprettet i?");
                creationyea = sc.nextInt();
                System.out.println("Hvor høj er din superhelt?");
                heights = sc.nextDouble();
                System.out.println("Er din superhelt et menneske (Ja/Nej");
                String isHumanOrNotString = sc.next();
                boolean HumanNot = false;
                boolean HumanYes = true;
                if (isHumanOrNotString.equalsIgnoreCase("Ja")) {
                }
                Database data = new Database();
                Superhero superhero = new Superhero();
                data.addHeroes();

            } else {
                System.exit(0);
            }
        } while (user != 9);
    }
}