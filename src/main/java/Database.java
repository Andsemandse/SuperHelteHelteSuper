import java.util.ArrayList;

public class Database {
    //private Superhero[] database = new Superhero[6];
    private ArrayList<Superhero> database = new ArrayList();
    //private int count = 0;

    public void addSuperhelt(String navn, String superkraft, int fødselsdag, String SandeNavn, double højde, int vægt){
        Superhero superhelt = new Superhero(navn, superkraft, fødselsdag, SandeNavn, højde, vægt);

    }
}
