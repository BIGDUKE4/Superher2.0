import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Initialiseres
        Superhero hero = new Superhero("Batman", "Strong", 1989, 1.89,true);
        Superhero hero1 = new Superhero("Batman", "Strong", 1989, 1.89,true);
        Superhero hero2 = new Superhero("Batman", "Strong", 1989, 1.89,true);
        Superhero hero3 = new Superhero("Superman", "Strong", 1989, 1.89,true);
        Superhero hero4 = new Superhero("Superman", "Strong", 1989, 1.89,true);


        Database data1 = new Database();
        data1.addSuperheroes(hero, 0);
        data1.addSuperheroes(hero1, 1);
        data1.addSuperheroes(hero2, 2);
        data1.addSuperheroes(hero3, 3);
        data1.addSuperheroes(hero4, 4);

        System.out.println("Velkommen til Superhero Universet");
        Scanner sc = new Scanner(System.in);
        System.out.println("Opret en Superhelt");
        String name;
        name = sc.next();







    }
}
