import java.util.ArrayList;

public class Database {

    //Array til superhelte objekter
    private ArrayList<Superhero> superheroes = new ArrayList<>();

    public void addHeroes1(String superHeroName, String superPower, int creationYear, double height, boolean humanOrNot) {
        Superhero superhero = new Superhero(superHeroName, superPower, creationYear, height, humanOrNot);
       superheroes.add(superhero);
    }

    public void printData(){
        for (Superhero hero: superheroes){
            System.out.println(hero);
        }
    }

    }