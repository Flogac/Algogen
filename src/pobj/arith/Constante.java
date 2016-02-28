package pobj.arith;
import pobj.arith.Expression;

public final class Constante implements Expression{

	final double value;
	
	public Constante(double valeur){
		value = valeur;
	}
	
	public double eval( EnvEval e){
		return value;
	}
	
	public double getValue( ) {
		return value;
	}
	
	public String toString(){
		return (value + "\n" );
	}
	
}
