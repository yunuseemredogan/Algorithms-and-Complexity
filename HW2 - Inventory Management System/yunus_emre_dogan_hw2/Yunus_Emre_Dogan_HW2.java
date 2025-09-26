package com.mycompany.yunus_emre_dogan_hw2;

/**
 *
 * @author ynsmr
 */
public class Yunus_Emre_Dogan_HW2 {
    public static void main(String[] args) {
   	 Inventory myInventory = new Inventory();
   	 
   	 myInventory.addResistor("2K", 20);
   	 myInventory.addTransistor("BC128", 45);
   	 myInventory.addResistor("2K", 20);
   	 myInventory.addTransistor("BC128", 45);
   	 myInventory.addCapacitor("2K","Polar", 20);
   	 myInventory.addInductor("BC128", 45);
   	 myInventory.addResistor("4K", 20);
   	 myInventory.addTransistor("BC415", 45);
   	 
   	 
   	 // Print inventory sorted by name
   	 System.out.println("Inventory sorted by name:");
   	 myInventory.printInventory(false);
   	 
   	 System.out.println();
   	 
   	 // Print inventory sorted by count
   	 System.out.println("Inventory sorted by count:");
   	 myInventory.printInventory(true);
   	 
   	 System.out.println();
   	 
   	 Integer remain = myInventory.deleteResistor("2.5K", 23);
   	 if (remain >= 0) {
   		 System.out.println("There are " + remain + " 2.5K resistors left in the inventory.");
   	 } else {
   		 System.out.println("There are not enough 2.5K resistors you want to delete left in the inventory!");
   	 }
   	 
   	 System.out.println();
   	 
   	 remain = myInventory.deleteResistor("2K", 23);
   	 if (remain >= 0) {
   		 System.out.println("There are " + remain + " 2K resistors left in the inventory.");
   	 } else {
   		 System.out.println("There are not enough 2K resistors you want to delete left in the inventory!");
   	 }

   }
}
