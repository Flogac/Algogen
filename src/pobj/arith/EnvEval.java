package pobj.arith;

public final class EnvEval{
	
	private double[] variables;
	private int tailleMax;
	private int taille;
	
	public EnvEval(int taillemax){
		tailleMax = taillemax;
		variables = new double[tailleMax];
		taille = 0;
	}
	
	public void setVariable(int indexVariable, double val){
		variables[indexVariable] = val;
	}
	
	public double getValue(int indexVariable){
		return variables[indexVariable];
		
	}
	
	public String toString(){
		StringBuilder retour = new StringBuilder(); 
		retour.append("Les variables sont:\n");
	for( int i = 0 ; i < taille ; i++ ) retour.append( i + " : " + variables[i]);
	return retour.toString();
	}
}
