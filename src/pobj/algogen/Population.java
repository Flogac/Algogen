package pobj.algogen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import pobj.algogen.doubles.IndividuDouble;

/**
 * Modification of class PopulationArray using dynamic arrays
 */

public class Population{
	private static ArrayList<IIndividu> individus;
	private static int size = 0;

	/**
	 * Creates population of given size and add to dynamic array
	 * @param POP_SIZE int, size of population
	 */

	public Population(int POP_SIZE) {
		setIndividus(new ArrayList<IIndividu>());
		for (int i = 0; i < POP_SIZE; i++){
			IIndividu I = new IndividuDouble();
			add(I);
		}
		size = POP_SIZE;
		//      System.out.println(individus.toString());
	}
	
	public Population() {
		setIndividus(new ArrayList<IIndividu>());
		
		//      System.out.println(individus.toString());
	}

	public int getSize() {
		return getIndividus().size();
	}
	/**
	 * Add the individu to the array
	 * @param iIndividu Individu
	 */
	public static void add(IIndividu i) {
		getIndividus().add(i);
		size++;
	}

	public String getString(ArrayList<IIndividu> individuList) {
		String individuString = " ";
		for (IIndividu s : individuList)
			individuString += s + "\n";
		return individuString;
	}

	public String getString() { 
		String individuString = " ";
		for (IIndividu s : getIndividus())
			individuString += s + "\n";
		return individuString;
	}

	public void evaluer(Environnement cible){
		System.out.println("evaluer");
		Population oldPop = this;
		for (int i=0; i < oldPop.getIndividus().size(); i++){
			double newFit = cible.eval(oldPop.getIndividus().get(i));
			oldPop.getIndividus().get(i).setFitness(newFit);
		}
		Collections.sort(oldPop.getIndividus());
		//Population.setIndividus(individus);
		Population newPop = oldPop.reproduire();
		setIndividus(newPop.getIndividus());
		this.muter( 0.1 );
	}

	public void muter(double prob){
		Random r = new Random();
		for (int i=1; i < getIndividus().size(); i++){
			double rand = r.nextDouble();
			if( rand < prob ){ getIndividus().get(i).muter();
			}
		}
	}
	
	private Population reproduire(){
		System.out.println("reproduire");
		int max = getIndividus().size();
		int best = (int) (getIndividus().size()*0.2);
		int rest =  getIndividus().size() - best;
		System.out.println(best + " " + rest);
		ArrayList<IIndividu> oldList = Population.getIndividus();
		Population retour = new Population();
		for (int i = max-1; i >= 0; i--){
			
			if (i < best){
			retour.add(oldList.get(max - 1 -i).Clone());
			}
			else{
			Random rand = new Random();
			IIndividu i1 = oldList.get(max-1-rand.nextInt(best));
			IIndividu i2 = oldList.get(max-1-rand.nextInt(best));
			retour.add(i1.croiser(i2).Clone());
			}
		}
		return retour;
	}

	public static ArrayList<IIndividu> getIndividus() {
		return individus;
	}

	public static void setIndividus(ArrayList<IIndividu> individus) {
		Population.individus = individus;
	}


	
}