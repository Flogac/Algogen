package pobj.arith;
import java.util.Random;

import pobj.arith.Expression;
import pobj.arith.Operator;

public class ExpressionFactory {
	private static int MAXVARIABLE = 2; 
	private  static Random generateur = new Random();
	
	public static Expression createOperateurBinaire(Operator o, Expression left, Expression right){
			OperateurBinaire op = new OperateurBinaire(o, left, right);
			return op;
	}
	
	public static Expression createConstante(double constant){
		Constante constante = new Constante(constant);
		return constante;
	}
	
	public static Expression createVariable(int id){
		if (id > MAXVARIABLE){
			MAXVARIABLE = id;
		}
		Variable var = new Variable(id);
		return var;
	}
	
	public static Expression createRandomExpression( int profondeur ){
		int variableOuConstante;
		Operator o;
		if( profondeur == 0){
			variableOuConstante = generateur.nextInt(2);
			
			if( variableOuConstante != 0) return createConstante( generateur.nextDouble());
			return createVariable( generateur.nextInt());
		}
		variableOuConstante = generateur.nextInt()%3;
		switch (variableOuConstante) {
		case 1 : 
			o = Operator.MINUS;
			break;

		case 2 : 
			o = Operator.PLUS;
			break;
			
		default :  
			o = Operator.MULT;	
			break;
		}
		return createOperateurBinaire( o , createRandomExpression( profondeur -1 ) , createRandomExpression( profondeur -1 ) );
	}
	
	public static Expression createRandomExpression(){
		return createRandomExpression( 3 );
	}
	
	public static EnvEval createRandomEnvironment(int taille){
		EnvEval envEval = new EnvEval(taille);
		
		for (int i = 0; i < taille; i++){
			double rDouble = generateur.nextDouble();
			envEval.setVariable(i, rDouble);			
		}
		return envEval;
		
	}

}
