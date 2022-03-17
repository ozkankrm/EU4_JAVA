package repl.repl_it.repl2;

public class MethodWithReturn4_profitOrLoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		c_profits gets the buyPrice(int) and sellPrice(int) and determines
//		if there was a profit or loss.
//		it returns a string value that can be "profit","loss","no loss"
		
		String i =  c_profits(100, 200);
	    System.out.println(i);
		
	}
	
	public static String c_profits (int buyPrice,int sellPrice){
	   
	   if(sellPrice>buyPrice){
	     return "profit";
	   }else if(sellPrice<buyPrice){
	     return "loss";
	   }else if(sellPrice==buyPrice){
	     return "no loss";
	   }
	return null;
	   
	   
	  }

}
