package pobj.algogen;
 
import java.util.Arrays;
 
/**
 * 
 * @author Tilde
 *
 *The main class which takes the size of the population as argument.
 *Calls PopulationFactory
 *
 */
 
public class PopulationMain {
    static int taille;
    static Population popArr;
    public static void main(String[] args) {
        //taille = Integer.parseInt(args[0]);
        taille = 8;
        PopulationFactory popFact = new PopulationFactory();
        popArr = popFact.createRandomPopulation(taille);
        System.out.println(Population.getString());
    }
 
}
