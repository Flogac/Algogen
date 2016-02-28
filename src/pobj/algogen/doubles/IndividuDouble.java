package pobj.algogen.doubles;
import java.util.Random;

import pobj.algogen.IIndividu;

import java.lang.*;
 
/**
 * 
 * Creates an object Individu with properties double valeurPropre and fitness
 */
 
public class IndividuDouble implements IIndividu{
    private double valeurPropre;
    private double fitness = 0.0;
    
     
    /**
     * Creates the Individu by give it a random value as valeurPropre
     */
     
    public IndividuDouble(){
        Random r = new Random();
        valeurPropre = r.nextDouble();
    }
     
    /**
     * Creates the Individu by set parameters 
     * @param vp double, valeur propre of the object
     * @param f double, fitness of the object
     */
     
    public IndividuDouble(double vp, double f){
        valeurPropre = vp;
        setFitness(f);
//      System.out.println(toString());
    }
     
    /**
     * 
     * @param double newFit, the new fitness newFit
     * @return double fitness
     */
     
    public void setFitness(double newFit){
        fitness = newFit;
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
     
    public Object getValeurPropre(){

    	
        return valeurPropre;    
    }
     
    /**
     * 
     * @return double fitness
     */
    public double getFitness(){
        return fitness; 
    }
    
    public int compareTo( IIndividu o){
    	return Double.compare(fitness, o.getFitness() );
    }
    
    public IIndividu Clone(){
    	return new IndividuDouble( valeurPropre , fitness );
    }
    
    public void muter(){
    	
    	double vp = (double) getValeurPropre();  	
      
       		valeurPropre = 0.9*vp;
    		
    }
     
    public IIndividu croiser(IIndividu autre){
    	double vp = (double) autre.getValeurPropre();
        double newVP = (valeurPropre + vp)/2;
    	
        IIndividu newIndividu = new IndividuDouble(newVP, fitness);
        return newIndividu;
    }

    
}