public class Superhero {
    private String superHeroName;
    private String Superpower;
    private int Creationyear;
    private double height;
    private boolean HumanOrNot;

    public Superhero (String Superheroname, String Superpower, int Creationyear, double height, boolean HumanOrNot){
        this.superHeroName = Superheroname;
        this.Superpower = Superpower;
        this.Creationyear = Creationyear;
        this.height = height;
        this.HumanOrNot = HumanOrNot;
    }

    public String getSuperheroname() {
        return superHeroName;
    }

    public String getSuperpower() {
        return Superpower;
    }

    public int getCreationyear() {
        return Creationyear;
    }

    public boolean isHumanOrNot() {
        return HumanOrNot;
    }

    public double getHeight() {
        return height;
    }

    public void setSuperheroname(String superheroname) {
        superHeroName = superheroname;
    }

    public void setSuperpower(String superpower) {
        Superpower = superpower;
    }

    public void setCreationyear(int creationyear) {
        Creationyear = creationyear;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setHumanOrNot(boolean humanOrNot) {
        HumanOrNot = humanOrNot;
    }
}
