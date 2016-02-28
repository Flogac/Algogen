package pobj.algogen;

import java.util.Arrays;

import pobj.algogen.doubles.IndividuDouble;
import pobj.algogen.doubles.ValeurCible;

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

		ValeurCible environnement = new ValeurCible(0.6);

		popArr.evaluer( environnement );

		//System.out.println(Population.getString());
		
        //Testing the method muter() and croiser(Individu autre)
        
        IIndividu I = new IndividuDouble();
        System.out.println(I.toString());
        I.muter();
        System.out.println("Mutated: " + I.toString());
         
        IIndividu autre = new IndividuDouble();
        IIndividu newIndv = I.croiser(autre);
        System.out.println("Parent 1: " + I.toString());
        System.out.println("Parent 2: " + autre.toString());
        System.out.println("Child: " + newIndv.toString());
	}


}