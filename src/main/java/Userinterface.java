import java.util.ArrayList;
import java.util.Scanner;

public class Userinterface {
    int user;

    public void startProgram() {
        Database data = new Database(); //Objekt

        Userinterface ui = new Userinterface();

            Scanner sc = new Scanner(System.in);
            //Do-While Loop
            do {
                System.out.println("""
                        Velkommen til SUPER HERO UNIVERSE.
                        1. Opret Superhelt
                        2. Tilgå Superhelt database
                        3. Søg efter Superhelte 
                        4. Ønsker du at redigere din Superhelt?
                        9. Afslut
                        """);

                //BrugerInput
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
                    System.out.println("Indtast nr på den Superhelt du ønsker at redigere:");
                    int nr = sc.nextInt();
                    sc.nextLine();

                    Superhero editSuperhero = data.søgeresultat.get(nr - 1);
                    System.out.println("Edit superhero" + editSuperhero);

                    System.out.println("Rediger din superhelt og, tast ENTER" +
                            "Hvis du ikke ønsker at redigere, tast ENTER");
                    System.out.println("Superheroname:" + editSuperhero.getSuperheroname());
                    String newName = sc.nextLine();
                    if (!newName.isEmpty())
                        editSuperhero.setSuperheroname(newName);

                    System.out.println("Superpower:" + editSuperhero.getSuperpower());
                    String newPower = sc.nextLine();
                    if (!newPower.isEmpty())
                        editSuperhero.setSuperpower(newPower);

                System.out.println("CreationYear:" + editSuperhero.getCreationyear());
                String newYear = sc.nextLine();
                if (!newYear.isEmpty())
                    editSuperhero.setCreationyear(Integer.parseInt(newYear));

                System.out.println("Height:" + editSuperhero.getHeight());
                String newHeight = sc.nextLine();
                if (!newHeight.isEmpty())
                    editSuperhero.setHeight(Double.parseDouble(newHeight));

                System.out.println("HumanOrNot:" + editSuperhero.getIsHumanOrNot());
                String newHuman = sc.nextLine();
                if (!newHuman.isEmpty())
                    editSuperhero.setHumanOrNot(Boolean.logicalOr(true, false));


                //Kalder på metoden fra klassen "Database"
                    data.addHeroes1(superHeroName, Superpower, creationYear, height, HumanOrNot);

                } else if (user == 2) {
                    data.printData(); //Kalder på metoden fra database klasse
                } else if (user == 3) {
                    System.out.println("Søg efter din superhelt:");
                    String hero = sc.next();
                    Superhero herox = data.findSuperhero(hero); //Kalder på metoden fra Database klassen
                    if (herox == null) { //Hvis herox er lig med null så print:
                        System.out.println("Ingen superhelte fundet");
                    }
                    if (herox != null) { //Hvis herox ikke er lig med null så print:
                        System.out.println(herox);
                    } else if (user == 4) {


                    }
                }
            } while (user != 9);
        }
    }



