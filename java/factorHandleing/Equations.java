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
}
