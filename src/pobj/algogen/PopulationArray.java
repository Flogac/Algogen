package pobj.algogen;
import java.util.Arrays;

import pobj.algogen.doubles.IndividuDouble;
public class PopulationArray {
     
    /**
     * Given population size, creates population and saves in array
     */
 
    private static final int POP_SIZE = 20;
    private IIndividu[] individus;
    private int size = 0;
     
    /**
     * Calls the class Individu to creates new individuals of the population
     */
 
    public PopulationArray() {
        individus = new IIndividu [POP_SIZE];
    }
     
    /**
     * Calls the class Individu to creates new individuals of the population.
     * @param number of Individu to create
     */
     
    public PopulationArray(int POP_SIZE) {
        individus = new IIndividu [POP_SIZE];
        for (int i = 0; i < POP_SIZE; i++){
            IIndividu I = new IndividuDouble();
            add(I);
//          System.out.println(I);
        }
    }
     
    /**
     * @return the current size of the population
     */
     
    public int getSize() {
        return size;
    }
     
    /**
     * FOr as long as there is room in the array, add the individual
     * @param individu to add
     */
     
    public void add(IIndividu individu) {
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