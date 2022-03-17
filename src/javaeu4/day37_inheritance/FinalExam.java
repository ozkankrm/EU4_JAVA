package javaeu4.day37_inheritance;

public class FinalExam extends GradeActivity{
	
	private int numQuestions;
	private double pointEach;
	private int numMissed;
	
	
	
	public FinalExam(int numQuestions, int numMissed) {
		
		double numericScore;
		this.numQuestions = numQuestions;
		this.numMissed = numMissed;
		
		pointEach = 100.0/numQuestions;
		numericScore = 100.0-(numMissed*pointEach);
		
		// my goal is to receive the letter based on my numreciScore
		
		// score GradeActivity class�nda private oldu�u i�in
		// nu do�rudan burda atama yapam�yoruz
		// setter ile ona ulburda atama yapm�� olduk.
		// e�er score public olsayd� do�rudan uburda atama yapabilirdik
		setScore(numericScore); 
	
	}
	

}
