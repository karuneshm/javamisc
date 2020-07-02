package com.karunesh.design.pattern.desingprinciple.singleton;


class Captain {
	
	private static class CricketHelper {
		private static final Captain captain = new Captain();
	}
	
	private Captain() {
		
	}
	
	public static Captain getCaptain() {
		return CricketHelper.captain;
	}
}

public class SingletonChallenge {
       public static void main(String args[]) {
    	   System.out.println("Creating Captain for the Team");
    	   Captain captain1 = Captain.getCaptain();
    	   System.out.println("Captain C1 is selected");
    	   Captain captain2 = Captain.getCaptain();
    	   System.out.println("Captain C2 is selected");
    	   System.out.println("Check if bothe Captains are same");
    	   if(captain1 == captain2) {
    		   System.out.println("Both Captains are same");
    	   }
       }
	
 
}
