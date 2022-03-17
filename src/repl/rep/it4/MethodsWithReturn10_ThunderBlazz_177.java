package repl.rep.it4;

public class MethodsWithReturn10_ThunderBlazz_177 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
	}
	
	public boolean getThunderBlazz(boolean available,boolean gift, int ingredient1 
			  , int ingredient2, int ingredient3)
			  {
			    
		if(available==true || gift==true ) {
			return true;
		}else if((ingredient1==1 && ingredient2==2 && ingredient3==3) || 
				(ingredient1==3 && ingredient2==1 && ingredient3==2) ) {
			return true;
		}else {
			return false;
		}
			
		
			    
			  }
	

}
