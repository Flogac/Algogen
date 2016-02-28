package pobj.arith;

import pobj.arith.Expression;

public final class OperateurBinaire implements Expression{
	final Operator operateur;
	final Expression e1;
	final Expression e2;
	
	public OperateurBinaire(Operator o, Expression exp1, Expression exp2){
		operateur = o;
		e1 = exp1;
		e2 = exp2;
	}
	
	public double eval(EnvEval e){
		switch (operateur) {
		case PLUS : 
			return e1.eval(e) + e2.eval(e);

		case DIV : 
			return e1.eval(e) / e2.eval(e);
			
		case MINUS : 
			return e1.eval(e) - e2.eval(e);
			
		case MULT : 
			return e1.eval(e) * e2.eval(e);

		default:
			return 0;
			
		}
		
	}
	
	public Expression getLeft(){
		return e1;
		
	}
	
	public Expression getRigth(){
		return e2;
		
	}
	
	public String toString(){
		switch (operateur) {
		case PLUS : 
			return (e1.toString() +"+\n"+ e2.toString());

		case DIV : 
			return (e1.toString() +"/\n"+ e2.toString());
			
		case MINUS : 
			return (e1.toString() +"-\n"+ e2.toString());
			
		case MULT : 
			return (e1.toString() +"*\n"+ e2.toString());

		default:
			return "";
		}
		}

}
