public class Database {

    //Array til superhelte objekter
    private Superhero[] superheroes = new Superhero[5];
    private int count = 0;

    public void addHeroes(String superHeroName, String superPower, int creationYear, double height, boolean humanOrNot) {
        Superhero superhero = new Superhero(superHeroName, superPower, creationYear, height, humanOrNot);
        superheroes[count] = superhero;
        count++;
    }
}