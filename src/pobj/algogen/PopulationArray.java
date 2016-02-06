package pobj.algogen;
import java.util.Arrays;
public class PopulationArray {
     
    /**
     * Given population size, creates population and saves in array
     */
 
    private static final int POP_SIZE = 20;
    private Individu[] individus;
    private int size = 0;
     
    /**
     * Calls the class Individu to creates new individuals of the population
     */
 
    public PopulationArray() {
        individus = new Individu [POP_SIZE];
    }
     
    /**
     * Calls the class Individu to creates new individuals of the population.
     * @param number of Individu to create
     */
     
    public PopulationArray(int POP_SIZE) {
        individus = new Individu [POP_SIZE];
        for (int i = 0; i < POP_SIZE; i++){
            Individu I = new Individu();
            add(I);
//          System.out.println(I);
        }
    }
     
    /**
     * @return the current size of the population
     */
     
    public int size() {
        return size;
    }
     
    /**
     * FOr as long as there is room in the array, add the individual
     * @param individu to add
     */
     
    public void add(Individu individu) {
        if (size < individus.length) {
            individus[size] = individu;
            size ++;
        } else {
            throw new ArrayIndexOutOfBoundsException("Plus de place !");
        }
    }
    /**
     * Translates the array to a string
     */
     
    @Override public String toString() {
        return Arrays.toString(individus);
    }
}
