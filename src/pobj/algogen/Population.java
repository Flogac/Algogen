package pobj.algogen;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
/**
 * Modification of class PopulationArray using dynamic arrays
 */
 
public class Population {
    private static ArrayList<Individu> individus;
    private int size = 0;
     
    /**
     * Creates population of given size and add to dynamic array
     * @param POP_SIZE int, size of population
     */
 
    public Population(int POP_SIZE) {
        individus = new ArrayList<Individu>();
        for (int i = 0; i < POP_SIZE; i++){
            Individu I = new Individu();
            add(I);
        }
//      System.out.println(individus.toString());
    }
    /**
     * 
     * @return int size, size of population
     */
    public int size() {
        return size;
    }
    /**
     * Add the individu to the array
     * @param individu Individu
     */
    public static void add(Individu individu) {
            individus.add(individu);
        }
    /**
     * Make the content of the dynamic array to string
     * @param individuList ArrayList
     * @return String individuString
     */
    public String getString(ArrayList<Individu> individuList) {
        String individuString = " ";
        for (Individu s : individuList)
            individuString += s + "\n";
        return individuString;
    }
        /**
         * Translates the content of dynamic array to a string 
         * @return String
         */
        public static String getString() {
            String individuString = " ";
            for (Individu s : individus)
                individuString += s + "\n";
            return individuString;
    }
     
}
