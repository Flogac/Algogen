package pobj.algogen;

import pobj.arith.Expression;
import pobj.arith.ExpressionFactory;

public abstract class AbstractIndividu implements IIndividu{

	private double fitness;
	private Object valeurPropre;
	
	public AbstractIndividu(Object vp, double fit) {		
		fitness = fit;
		valeurPropre = vp;
	}
	
	public int compareTo(IIndividu o) {
		return Double.compare((double) fitness, o.getFitness() );

	}

	public void muter() {
		
		if (valeurPropre instanceof Double) {
			
			double vp = (double) getValeurPropre();  		      
       		vp = 0.9*vp;
			
		}
		else if (valeurPropre instanceof Expression) { 
		Expression newExpr = ExpressionFactory.createRandomExpression();
    	valeurPropre = newExpr;
		}
		
	}
	
    public void setFitness(double newFit){
        fitness = newFit;
    }

	public double getFitness() {
		return fitness;
	}

	public abstract IIndividu Clone();

}