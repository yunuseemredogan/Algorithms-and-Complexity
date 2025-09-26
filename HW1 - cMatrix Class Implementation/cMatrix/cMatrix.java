package cMatrix;

import java.util.Random;

// Class of cMatrix
public class cMatrix {
    private long[][] elements; // Stores the elements of the matrix
    private int rows;          // Number of rows
    private int cols;          // Number of columns

    // Default constructor
    public cMatrix() {
        this.rows = 10; // Number of columns is set to 10 by default
        this.cols = 10; // Number of columns is set to 10 by default
        this.elements = new long[rows][cols];
    }

    // Parameterized constructor
    public cMatrix(int rows, int cols) {
        if ((rows > 10000)||(cols > 10000)) {
        	System.out.println("Satır veya sütun sayısı 10000'i geçemez!");
        } else {
        	this.rows = rows;
            this.cols = cols;
            this.elements = new long[rows][cols];
        }
    }

    // Method to assign random values
    public void assignRandom() {
        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                elements[i][j] = rand.nextInt(10000) + 1; // Assigned random values between 1 and 10,000
            }
        }
    }

    // Method to print the matrix
    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(elements[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Method to print the matrix with prime numbers marked
    public void printMatrixWithPrime() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (isPrime(elements[i][j])) {
                    System.out.print(elements[i][j] + "*\t");
                } else {
                    System.out.print(elements[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }


    // Method to multiply matrices
    public cMatrix multiplyMatrices(cMatrix multiplicand) {
    	
    	try {
            // Check if matrices are compatible for multiplication
            if (this.cols != multiplicand.rows) {
                throw new IllegalArgumentException("Matrix dimensions do not match for multiplication.");
            }
            
            cMatrix result = new cMatrix(this.rows, multiplicand.cols);
            long startTime = System.nanoTime(); // Time initialized to calculate time complexity
            int operationCount = 0;

            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < multiplicand.cols; j++) {
                    long sum = 0;
                    for (int k = 0; k < this.cols; k++) {
                        sum += this.elements[i][k] * multiplicand.elements[k][j];
                        operationCount += 2; // One multiplication and one addition
                    }
                    result.elements[i][j] = sum;
                }
            }

            long endTime = System.nanoTime(); // Time initialized to calculate time complexity
            System.out.println("Multiplication completed in " + (endTime - startTime) / 1e6 + " milliseconds.");
            System.out.println("Number of operations performed: " + operationCount);

            return result;
            
        } catch (IllegalArgumentException e) {
            // Catch the exception and print the error message
            System.out.println("Error: " + e.getMessage());
            return null;  // Return null if multiplication cannot be performed
        }
        
    }

    
    // Additional helper method which finds prime numbers in multiplied matrix as needed
    private boolean isPrime(long num) {
        if (num <= 1) return false;
        for (long i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    
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

