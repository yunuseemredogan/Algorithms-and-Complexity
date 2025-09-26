package com.mycompany.yunus_emre_dogan_hw2;

/**
 *
 * @author ynsmr
 */
public interface InventoryInterface {
    void addResistor(String val, Integer cnt);
	 void addCapacitor(String val, String typ, Integer cnt);
	 void addInductor(String val, Integer cnt);
	 void addTransistor(String typ, Integer cnt);

	 int deleteResistor(String val, Integer cnt); // Returns remaining count of resistors, or -1 if insufficient
	 int deleteCapacitor(String val, String typ, Integer cnt); // Returns remaining count of capacitors, or -1
	 int deleteInductor(String val, Integer cnt); // Returns remaining count of inductors, or -1
	 int deleteTransistor(String typ, Integer cnt); // Returns remaining count of transistors, or -1
	 
	 void printInventory(boolean sortByCount);
}
