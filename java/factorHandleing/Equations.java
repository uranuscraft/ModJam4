package obesityFactor.factorHandleing;
/**
 * 
 * @author UranusCraft
 *
 */
public class Equations {
 
	/**
	 * A mathematical equation for weight to speed
	 * @param par1 the person's weight
	 * @return the answer
	 */
	public static double Speed(double par1) {
	double sine = Math.sin(par1);
	double r = .5 * par1;
	double ad = r + sine;
	
	 
	 return 1 / ad;
	 
 }
	/**
	 * A mathematical equation for food points to weight
	 * @param par1 the person's weight
	 * @param par2 the food points
	 * @return the answer
	 */
	public static double weight(double par1, double par2) {
	double sine = Math.sin(par2);
	double r = .5 * par2;
	double ad = r + sine;
	double re = 1 / ad;
	 
	 return re + par1;
	 
 }
}
