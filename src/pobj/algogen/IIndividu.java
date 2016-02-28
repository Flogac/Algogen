package pobj.algogen;

public interface IIndividu extends Comparable<IIndividu>{

	void muter();

	double getFitness();

	IIndividu Clone();

	void setFitness(double newFit);

	Object getValeurPropre();

	IIndividu croiser(IIndividu autre);


}