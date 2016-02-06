package pobj.algogen;
 
//public class PopulationFactory {
//  
//  static PopulationArray individus;
//  
//  public static PopulationArray createRandomPopulation(int size){
//      individus = new PopulationArray(size);
//      return individus;
//  }
//  public static String getString(PopulationArray indArr){
//
//      return individus.toString();        
//  }

/**
 * Creates a population by calling the class Population
 * 
 */
public class PopulationFactory {
     
    static Population individus;

/**
 * Calls class Population with the population size as argument
 * @param size int, size of population
 * @return Population individus
*/
     
    public static Population createRandomPopulation(int size){
        individus = new Population(size);
        return individus;
    }
/**
 * Calls class Population.getString 
 * @param indArr Population, Population dynamic array
 * @return String
*/

    public static String getString(Population indArr){
 
        return individus.getString();       
    }
 
}
