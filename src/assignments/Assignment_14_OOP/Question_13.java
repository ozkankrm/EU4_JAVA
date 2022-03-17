package assignments.Assignment_14_OOP;
import java.util.*;
public class Question_13 {
	public static void main(String[] args) {
		
		Color color = new Color();
		System.out.println(color.toString() ) ; // prints "white"

		Color color2 = new Color(255, 0, 0);
		System.out.println(color2.toString() ) ; // prints "red"

		Color color3 = new Color(255, 44, 88);
		System.out.println(color3.toString() ) ; // prints "n/a"

		Color color4 = new Color(192, 192, 192);
		System.out.println(color4 ) ; // prints "light gray"
		
	}
}

class Color{
//rgb array with 3 ints is used to hold r,g,b values   

private int[] rgb = new int[3];  

/**     * Available colors - ready with rgb code    
 *  */

	public final static int[] WHITE     = new int[]{255, 255, 255};    
	public final static int[] LIGHT_GRAY = new int[]{192, 192, 192};    
	public final static int[] GRAY      = new int[]{128, 128, 128};    
	public final static int[] DARK_GRAY  = new int[]{64, 64, 64};    
	public final static int[] BLACK     = new int[]{0, 0, 0};    
	public final static int[] RED       = new int[]{255, 0, 0};    
	public final static int[] PINK      = new int[]{255, 175, 175};    
	public final static int[] ORANGE    = new int[]{255, 200, 0};    
	public final static int[] YELLOW    = new int[]{255, 255, 0};    
	public final static int[] GREEN     = new int[]{0, 255, 0};    
	public final static int[] MAGENTA   = new int[]{255, 0, 255};    
	public final static int[] CYAN      = new int[]{0, 255, 255};    
	public final static int[] BLUE      = new int[]{0, 0, 255};

//	public Color(int[] rgb) {
//		this.rgb = rgb;
//	}
	public Color(int r, int g, int b ) {
		rgb[0] = r;
		rgb[1] = g;
		rgb[2] = b;
	}
	
	/**     
	 * * Public no- args constructor: sets default color as "white" (255,255,255)     
	 * * try to use this() keyword to call above constructor to set white color    
	 *  */   
	
	public Color() {
		this(255, 255, 255);
	}

	/**     
	 * * Override toString(from Object class).     
	 * * Provides string description of the color like "red" ,"blue" based on     
	 * * rgb value.     
	 * * Compare value of rgb array with static color code arrays     
	 * * and find out what color it is. Arrays.equals(arr1,arr2) is easiest way     
	 * * to compare 2 int arrays     
	 * * @returns a String color name like     
	 * * "white" or "blue"     
	 * * If rgb values does not match any available combinations, return "n/a"    
	 *  *     
	 *  * Ex:
	 */
	@Override
	public String toString() {
		return "Color [rgb=" + Arrays.toString(rgb) + "]";
	}
	
	  public static String defineColor(int[] array) {

	    	if(Arrays.equals(WHITE,array)) {		return "white"; }
	    	else if(Arrays.equals(LIGHT_GRAY,array)) {		return "light gray"; }
	    	else if(Arrays.equals(GRAY,array)) {		return "gray"; }
	    	else if(Arrays.equals(DARK_GRAY,array)) {		return "dark gray"; }
	    	else if(Arrays.equals(BLACK,array)) {		return "black"; }
	    	else if(Arrays.equals(RED,array)) {		return "red"; }
	    	else if(Arrays.equals(PINK,array)) {		return "pink"; }
	    	else if(Arrays.equals(ORANGE,array)) {		return "orange"; }
	    	else if(Arrays.equals(YELLOW,array)) {		return "yellow"; }
	    	else if(Arrays.equals(GREEN,array)) {		return "green"; }
	    	else if(Arrays.equals(CYAN,array)) {		return "cyan"; }
	    	else if(Arrays.equals(BLUE,array)) {		return "blue"; }
	    	else return "n/a";

	    }
	    public String toString1() {

	        return defineColor(rgb); //change this to return colors
	    }
	
}
