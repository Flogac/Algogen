package pobj.algogen;
import java.util.Random;
 
/**
 * 
 * Creates an object Individu with properties double valeurPropre and fitness
 */
 
public class Individu {
    private double valeurPropre;
    private double fitness = 0.0;
     
    /**
     * Creates the Individu by give it a random value between 0 and 1 as valeurPropre
     */
     
    public Individu(){
        Random r = new Random();
        valeurPropre = r.nextDouble();
    }
     
    /**
     * Creates the Individu by set parameters 
     * @param vp double, valeur propre of the object
     * @param f double, fitness of the object
     */
     
    public Individu(double vp, double f){
        valeurPropre = vp;
        fitness = setFitness(f);
//      System.out.println(toString());
    }
     
    /**
     * 
     * @param double newFit, the new fitness newFit
     * @return double fitness
     */
     
    public double setFitness(double newFit){
        fitness = newFit;
        return fitness;
    }
     
    /**
     * Creates string with the properties of the Individu
     */
     
    @Override public String toString(){
        return "Fitness = " + getFitness() + ", valeurPropre = " + getValeurPropre();       
    }
    /**
     * 
     * @return double valeurPropre
     */
     
    public double getValeurPropre(){
        return valeurPropre;    
    }
     
    /**
     * 
     * @return double fitness
     */
    public double getFitness(){
        return fitness; 
    }
    
    public void muter(){
    	Random r = new Random();
    	fitness = fitness * ( 0.9 + ( r.nextDouble() % 2000 ) / 1);
    }
    
    public Individu croiser( Individu autre ){
    	Random r = new Random();
    	return new Individu( r.nextDouble() , (fitness + autre.getFitness()) / 2 );
    }
    
}
