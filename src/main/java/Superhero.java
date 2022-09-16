public class Superhero {
    private String superHeroName;
    private String superpower;
    private int creationyear;
    private double height;
    private boolean humanOrNot;

    //Konstruktør
    public Superhero (String superheroname, String superpower, int creationyear, double height, boolean humanOrNot){
        this.superHeroName = superheroname;
        this.superpower = superpower;
        this.creationyear = creationyear;
        this.height = height;
        this.humanOrNot = humanOrNot;
    }

    //Get - metoder
    public String getSuperheroname() {
        return superHeroName;
    }

    public String getSuperpower() {
        return superpower;
    }

    public int getCreationyear() {
        return creationyear;
    }

    public boolean getIsHumanOrNot() {
        return humanOrNot;
    }

    public double getHeight() {
        return height;
    }

    //Set metoder
    public void setSuperheroname(String superheroname) {
        superHeroName = superheroname;
    }

    public void setSuperpower(String superpower) {
        superpower = superpower;
    }

    public void setCreationyear(int creationyear) {
        creationyear = creationyear;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setHumanOrNot(boolean humanOrNot) {
        humanOrNot = humanOrNot;
    }

   public String toString (){
        return "SuperheroName:" + " " + superHeroName + ", " + "Superpower:" + " "+ superpower + ", " + "CreationYear:" + " " + creationyear
                + ", " + "Height:" + " " + height + ", " + "HumanOrNot:" + " " + humanOrNot + ". ";
    }
}
