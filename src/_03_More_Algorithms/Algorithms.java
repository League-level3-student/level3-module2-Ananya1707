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
}
