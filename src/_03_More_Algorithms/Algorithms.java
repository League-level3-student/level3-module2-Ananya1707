package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
    	String value = num1 + " x " + num2 + " = " + num1*num2;
        return value;
    }
    
    public static boolean isPrime(int num1) {
    	boolean value;
    	for(int i = 2; i < num1; i++) {
    		if(num1%i == 0) {
    			return false;
    		}
    	}
        return true;
   }
    
    public static boolean isSquare(int num) {
    	for(int i = 0; i <= num; i++) {
    		if(i*i == num) {
    			return true;
    		}
    	}
    	
        return false;
    }
    
    public static boolean isCube(int num) {
    	for(int i = 0; i <= num; i++) {
    		if(i*i*i == num) {
    			return true;
    		}
    	}
    	
        return false;
    }
    
    public static int findBrokenEgg(List<String> eggs) {
    	for(int i = 0; i < eggs.size(); i++) {
    		if(eggs.get(i).equals("cracked")) {
    			return i;
    		}
    	}
        return 0;
    }
    
    public static int countPearls(List<Boolean> oysters) {
    	int pearls = 0;
    	for(int i = 0; i < oysters.size(); i++) {
    		if(oysters.get(i) == true) {
    			pearls += 1;
    		}
    	}
        return pearls;
    }
    
    public static Double findTallest(List<Double> peeps) {
    	Double tallest = 0.0;
    	for(int i = 0; i < peeps.size(); i++) {
    		if(peeps.get(i) > tallest) {
    			tallest = peeps.get(i);
    		}
    	}
        return tallest;
    }
    
    public static String findLongestWord(List<String> words) {
    	int longest = 0;
    	int index = 0;
    	for(int i = 0; i < words.size(); i++) {
    		if(words.get(i).length() > longest) {
    			longest = words.get(i).length();
    			index = i;
    		}
    	}
        return words.get(index);
    }
    
    public static Boolean containsSOS(List<String> message) {
    	for(int i = 0; i < message.size(); i++) {
    		if(message.get(i).equals("... --- ...")) {
    			return true;
    		}
    	}
        return false;
    }
    
    public static List<Double> sortScores(List<Double> results) {
    	for (int k = 0; k < results.size(); k++) {
	    	for (int i = 0; i < results.size()-1; i++) {
	    		if( results.get(i) > results.get(i+1) ) {
	    			Double num1 = results.get(i);
	    			Double num2 = results.get(i+1);
	    			
	    			results.set(i, num2);
	    			results.set(i+1, num1);

	    		}
	    	}
    	 }
    	
    	return results;
    }
    

	public static List<String> sortDNA(List<String> unsortedSequences) {
		// TODO Auto-generated method stub
		for (int k = 0; k < unsortedSequences.size(); k++) {
	    	for (int i = 0; i < unsortedSequences.size()-1; i++) {
	    		if( unsortedSequences.get(i).length() > unsortedSequences.get(i+1).length() ) {
	    			String str1 = unsortedSequences.get(i);
	    			String str2 = unsortedSequences.get(i+1);
	    			
	    			unsortedSequences.set(i, str2);
	    			unsortedSequences.set(i+1, str1);

	    		}
	    	}
    	 }
		return unsortedSequences;
	}

	public static List<String> sortWords(List<String> words) {
		// TODO Auto-generated method stub
		for (int k = 0; k < words.size(); k++) {
	    	for (int i = 0; i < words.size()-1; i++) {
	    		if( words.get(i).compareTo(words.get(i+1))>0 ) {
	    			String str1 = words.get(i);
	    			String str2 = words.get(i+1);
	    			
	    			words.set(i, str2);
	    			words.set(i+1, str1);


	    		}
	    	}
    	 }
		
		return words;
	}
}
