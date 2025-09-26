/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.yunus_emre_dogan_hw4;

public interface HashTableInterface<K, V> {
    void insert(K key, V value);
    void insertWithAnalyze(K key, V value);
    V search(K key);
    void delete(K key);
    void display();
    void displayOnlyElements();
}
