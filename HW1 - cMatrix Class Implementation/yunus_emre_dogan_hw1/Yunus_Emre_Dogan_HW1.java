package yunus_emre_dogan_hw1;

/**
 *
 * @author ynsmr
 */
import java.util.Random;

public class Yunus_Emre_Dogan_HW1 {
    public static void main(String[] args) { 
    	cMatrix m1 = new cMatrix(); 
    	m1.assignRandom(); 
    	m1.printMatrix(); 
    	
    	System.out.println();
    	
    	System.out.println("m1 matrix: ");
    	m1.printMatrixWithPrime(); 
    	
    	cMatrix m2 = new cMatrix(5, 5); 
    	cMatrix m3 = new cMatrix(5, 5); 
    	
    	System.out.println();
    	
    	System.out.println("m2 matrix: ");
    	m2.assignRandom(); 
    	m2.printMatrix();
    	
    	System.out.println();
    	
    	System.out.println("m3 matrix: ");
    	m3.assignRandom();
    	m3.printMatrix();
    	
    	// Try-Catch block to find errors
    	try { 
	    	cMatrix m4 = m2.multiplyMatrices(m3);
	    	m4.printMatrixWithPrime(); 
    	} catch (Exception e) { 
    		System.out.println("Error: " + e.getMessage()); 
    	}
    } 
}

