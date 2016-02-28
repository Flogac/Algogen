package pobj.algogen.doubles;
import java.math.*;

import pobj.algogen.Environnement;
import pobj.algogen.IIndividu;

public class ValeurCible  implements Environnement{
	private double valeur;

	public ValeurCible(){

	}

	public ValeurCible(double val){
		valeur = val;
	}

	public double getValue(){
		return valeur;    
	}

	public String toString(){
		return "valeur :" + valeur;
	}

	public double eval( IIndividu i){
		double vp = (double) i.getValeurPropre();
		return Math.pow( this.getValue() - vp , -2 );
	}


}
