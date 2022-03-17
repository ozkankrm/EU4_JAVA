package javaeu4.day11_controlFlowStatementPart5_ForLoop.Assesment_3;

public class Question_24 {

	public static void main(String[] args) {
		
		int counter = 4;
		outer:
			for(int i=0;i<4; i++) {
				middle:
					for(int j=0; j<4; j++) {
						inner:
							for(int k=0; k<4; k++) {
								if(k-j>0) {      // bu ko�ulu sa�lad���nda 
									break middle; // break burda kesiyor ve middle ko�uluna geri d�n�yor
								}
								counter++;
							}
					}
			}
		System.out.println(counter); // 8
	}

}
