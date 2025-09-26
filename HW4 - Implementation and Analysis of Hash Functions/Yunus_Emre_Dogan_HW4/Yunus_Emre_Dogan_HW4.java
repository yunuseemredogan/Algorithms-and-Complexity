/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.yunus_emre_dogan_hw4;

public class Yunus_Emre_Dogan_HW4 {
    public static void main(String[] args) {
        
        HashTable<String, String> table = new HashTable<>(10);
        
        // Insert key-value pairs
        table.insert("apple", "Fruit: Apple");
        table.insert("banana", "Fruit: Banana");
        table.insert("cherry", "Fruit: Cherry");
        table.insert("melon", "Fruit: Melon");
        table.insert("watermelon", "Fruit: Watermelon");
        table.insert("peach", "Fruit: Peach");
        
        table.insert("tomato", "Vegetable: Tomato");
        table.insert("potato", "Vegetable: Potato");
        table.insert("cucumber", "Vegetable: Cucumber");
        table.insert("garlic", "Vegetable: Garlic");
        table.insert("onion", "Vegetable: Onion");
        table.insert("pumpkin", "Vegetable: Pumpkin");
        
        table.insert("water", "Drink: Water");
        table.insert("tea", "Drink: Tea");
        table.insert("coffee", "Drink: Coffee");
        table.insert("juice", "Drink: Juice");
        table.insert("ooke", "Drink: Coke");
        table.insert("lemonade", "Drink: Lemonade");
         
        System.out.println("Hash Table Contents:");
        
        table.display();
        
        // Test searching with an iterable
        System.out.println("\nSearching with Iterable:");
        String[] searchKeys = {"grape", "banana", "apple"};
        String result = null;
        
        for (String key : searchKeys) {
            result = table.search(key);
            if (result != null) {
                System.out.println("Found: " + result);
                break;
            }
        }
        
        if (result == null) {
            System.out.println("No match found.");
        }
        
        // Deleting a key
        System.out.println("\nDeleting 'banana'...");
        table.delete("banana");
        System.out.println("\nHash Table Contents After Deletion:\n");
        table.display();
        
        table.insertWithAnalyze("banana", "Fruit: Banana");
        table.display();
        table.displayOnlyElements();
    }
}
