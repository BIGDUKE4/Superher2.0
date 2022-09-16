import java.util.ArrayList;

public class Database {
    //Arraylist til superhelte objekter
    private ArrayList<Superhero> superheroes = new ArrayList<>();
    ArrayList<Superhero> søgeresultat = new ArrayList<>();

    public ArrayList<Superhero> acessSuperheroes() {
        return superheroes;
    }

    public void addHeroes1(String superHeroName, String superPower, int creationYear, double height, boolean humanOrNot) {
        Superhero superhero = new Superhero(superHeroName, superPower, creationYear, height, humanOrNot);
        superheroes.add(superhero);
    }

    public Superhero findSuperhero(String hero) {
        for (Superhero superhero : superheroes) {
            if (superhero.getSuperheroname().equalsIgnoreCase(hero)) ;
            return superhero;
        }
        return null;
    }

    public void printData() {
        for (Superhero hero : superheroes) {
            System.out.println(hero);
        }
    }

    public void editSuperhero() {
        for (int i = 0; i < søgeresultat.size(); i++) {
            System.out.println(i++ + ":" + søgeresultat.get(i));
        }

    }
}
