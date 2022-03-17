package repl.repl_8_OOP;

public class _220_OOP3_Getter_Setter_Test {

	public static void main(String[] args) {
		
		 
		   Db db = new Db();
		   db.insertData("aaa",123);
		   
		   
		    System.out.println(db.getData());//aaa
		    System.out.println(db.getYint());//123
		  
		  db.setData("zzz");
		  db.setYint(200);
		  
		  System.out.println(db.getData());//zzz
		    System.out.println(db.getYint());//200
	}

}
