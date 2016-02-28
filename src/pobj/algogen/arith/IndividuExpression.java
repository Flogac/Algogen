package pobj.algogen.arith;

import pobj.algogen.*;
import pobj.arith.*;

public class IndividuExpression extends AbstractIndividu{

	Expression valeurPropre;
	double fitness;

	public IndividuExpression(Object vp, double fit) {
		super(vp, fit);
		valeurPropre = (Expression) vp;
		fitness = fit;
		
	}
    
    public Object getValeurPropre(){
        return valeurPropre;    
    }

	@Override
	public IIndividu Clone() {
		return null;
	}

	public IIndividu croiser(IIndividu autre) {
		Expression e1 = (Expression) getValeurPropre();
		Expression e2 = (Expression) autre.getValeurPropre();
    	Expression e = new OperateurBinaire( Operator.PLUS , e1 , e2 );
    	Expression e3 = new OperateurBinaire( Operator.DIV, e , new Constante(2) );
    	return new IndividuExpression(e3,getFitness());
	}

}