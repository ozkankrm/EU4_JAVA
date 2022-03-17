package review.week13_inheritance2;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

	public String BA, PO, SM;
	
	public ArrayList<Tester> testers;
	public ArrayList<Developer> developers;
	
	public ScrumTeam(String BA, String PO, String SM) {

		
		this.BA = BA;
		this.PO = PO;
		this.SM = SM;
		testers = new ArrayList<>();
		developers = new ArrayList<>();
	}
	
	
	public void hireTester(Tester tester) {// add one tester to the arraylist of testers
		testers.add(tester);
		
	}
	
	public void hireTester(Tester[] testers) {  // add array of Testers to the arraylist of testers
		this.testers.addAll(Arrays.asList(testers));
		
	/*	
		for( Tester eachTester : testers ) {
			hireTester(eachTester);
		}
		*/	
		
	}

	
	public void hireDeveloper(Developer developer) {//add developer to the arraylist of developer
		developers.add(developer);
		
	}

	public void hireDeveloper(Developer[] developer) {//add array of Developer to the arraylist of Developers
		
		this.developers.addAll(Arrays.asList(developer));
		
		/*
		for(Developer eachDeveloper : developers) {
			hireDeveloper(eachDeveloper);
		}
		*/
	}

	//how can remove tester
	public void terminateTester(String ID) {//remove tester by ID
		testers.removeIf( p -> p.ID.equals(ID));
	
	Tester tester = null;
	for(Tester each : testers) {
		if(each.ID.equals(ID)) {
			tester = each; 
		}
	}
	
	testers.remove(tester);
	}
	
	//how can emove developer
	public void terminateDeveloper(String ID) {//remove developer by ID
		developers.removeIf(p -> p.ID.equals(ID));
		
		Developer developer = null;
		
		for( Developer each : developers ) {
			if(each.ID.equals(ID)) {
				developer = each;
				
			}
		}
		developers.remove(developer);
	}


	
	public void dailyStandUp() {
		System.out.println(SM + " is doing daily stand up meeting");
	}
	
	@Override
	public String toString() {
		return "ScrumTeam [BA=" + BA + ", PO=" + PO + ", SM=" + SM + ", testers=" + testers.size() + ", developers="
				+ developers.size() + "]";
	}

	

}
