import java.util.ArrayList;

public class Database {

    //Instansieres (Superhelte)
    Superhero hero1 = new Superhero("Batman", "Rich & Strong", 1989, 1.88, true);
    Superhero hero2 = new Superhero("Iron Man","Rich", 1987,1.80,true);
    Superhero hero3 = new Superhero("Hulk", "Giant & Strong", 1990, 2.30,false);
    Superhero hero4 = new Superhero("Thor", "God", 1992, 1.97,false);
    Superhero hero5 = new Superhero("Spiderman", "Spider", 1980, 1.81,false);

    //Array til superhelte objekter
    private ArrayList<Superhero> superheroes = new ArrayList<>();

    public void addHeroes1(String superHeroName, String superPower, int creationYear, double height, boolean humanOrNot) {
        Superhero superhero = new Superhero(superHeroName, superPower, creationYear, height, humanOrNot);
        //superheroes[count] = superhero;
        //count++;
    }

    public void addHeroes(Superhero hero){
        superheroes.add(hero);
    }

    public void searchForSuperHeroes (String searchHero){
        for (Superhero superhero : superheroes){
            System.out.println(get.);
        }

    }
    }