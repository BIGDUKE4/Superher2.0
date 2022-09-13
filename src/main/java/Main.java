import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        String superpower;
        int creationyea;
        double height;
        boolean humanOrNot;
        Scanner sc = new Scanner(System.in);

        //BrugerInput
       do {
           System.out.println("""
        Velkommen til SUPER HERO UNIVERSE.
        1. Opret superhelt
        9. Afslut
        """);


        System.out.println("Hvad hedder din superhelt?");
        name = sc.next();
        System.out.println("Hvad er din superhelts superkræfter?");
        superpower = sc.next();
        System.out.println("Hvilket årstal blev din superhelt oprettet i?");
        creationyea = sc.nextInt();
        System.out.println("Hvor høj er din superhelt?");
        height = sc.nextDouble();
        System.out.println("Er din superhelt et menneske (Ja/Nej");
        String HumanOrNot = sc.next();
        boolean HumanNot = false;
        boolean HumanYes = true;



    }
}
