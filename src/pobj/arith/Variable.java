package pobj.arith;
import pobj.arith.Expression;

public final class Variable implements Expression{

	final int rang;
	
	public Variable(int myRang){
		
		rang = myRang;
		
	}
	
	public double eval( EnvEval e){
		
		return e.getValue(rang);
		
	}
	
	public String toString(){

		return ( "x" + rang + "\n" );
		
	}
	
}
