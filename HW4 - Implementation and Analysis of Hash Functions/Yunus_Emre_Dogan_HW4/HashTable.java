/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.yunus_emre_dogan_hw4;


public class HashTable<K, V> implements HashTableInterface<K, V> {
    private Node<K, V>[] table;
    private int size;

    public HashTable(int capacity) {
        table = new Node[capacity];
    }

    public HashTable() {
        table = new Node[10];
    }

    // Olusturmus oldugum hash fonksiyonu, parametre olarak aldigi degeri
    // string bir ifadeye cevirip her bir karakterinin ASCII degerinin kupunu
    // alip hepsini toplayarak cikan sonucu 13'e boluyor. Daha sonrasinda da
    // hash tablosuna gore modunu alarak bize bir indeks degeri uretiyor.
    private int hash(K key) {
        String stringKey = (String) key;
        int hashIndex;
        int asciiCubeSum = 0;
        int i;
        
        for(i = 0;i<stringKey.length();i++){
            asciiCubeSum += ((stringKey.charAt(i)*stringKey.charAt(i)*stringKey.charAt(i)));
        }
        
        hashIndex = (int)(asciiCubeSum/13) % table.length;
        
        return hashIndex;
    }

    @Override
    public void insert(K key, V value) {
        int index = hash(key);
        Node<K, V> node = table[index];

        if (node == null) {
            size++;
            table[index] = new Node<>(key, value);
        } else {
            size++;
            while (node.next != null) {
                if (node.key.equals(key)) {
                    node.value = value;
                    return;
                }
                node = node.next;
            }
            if (node.key.equals(key)) {
                node.value = value;
            } else {
                node.next = new Node<>(key, value);
            }
        }    
    }

    @Override
    public void insertWithAnalyze(K key, V value) {
        long startTime = System.nanoTime();
        insert(key, value);
        long endTime = System.nanoTime();
        
        double insertTime = (endTime - startTime) / 1e9;

        double loadFactor = (double) size / table.length;

        int totalCollisions = 0;
        int bucketCollisions = 0;

        for (int i = 0; i < table.length; i++) {
            int listSize = 0;
            Node<K, V> current = table[i];
            
            while (current != null) {
                listSize++;
                current = current.next;
            }

            if (listSize > 1) {
                totalCollisions += (listSize - 1);
                if (i == hash(key)) {
                    bucketCollisions = listSize - 1;
                }
            }
        }
        
        int totalMemoryUsage = 0;
        int bucketMemoryUsage = 0;

        for (int i = 0; i < table.length; i++) {
            int tempBucketMemory = 0;
            Node<K, V> temp = table[i];

            while (temp != null) {
                totalMemoryUsage++;
                tempBucketMemory++;
                temp = temp.next;
            }

            if (i == hash(key)) {
                bucketMemoryUsage = tempBucketMemory;
            }
        }
        
        // hocam collision ve memory usage icin toplam sayi mi yoksa
        // node'un eklendigi bucket'taki toplam sayi mi oldugunu anlamadigim
        // icin iki durumda da sayilarini hesapladim
        System.out.println();
        System.out.println("Total Load Factor: " + loadFactor);
        System.out.println("Total Number of Collisions: " + totalCollisions);
        System.out.println("Total Number of Collisions in Bucket "+ hash(key)+": "+ bucketCollisions);
        System.out.println("Insert Time: " + insertTime + " seconds");
        System.out.println("Total Memory Usage: " + totalMemoryUsage + " nodes");
        System.out.println("Total Memory Usage in Bucket "+ hash(key)+": "+ bucketMemoryUsage + " nodes");
        System.out.println();
    }

    @Override
    public V search(K key) {
        int index = hash(key);
        Node<K, V> node = table[index];

        while (node != null) {
            if (node.key.equals(key)) {
                return node.value;
            }
            node = node.next;
        }

        return null;
    }

    @Override
    public void delete(K key) {
        int index = hash(key);
        Node<K, V> node = table[index];
        Node<K, V> prev = null;

        while (node != null) {
            if (node.key.equals(key)) {
                if (prev == null) {
                    table[index] = node.next;
                } else {
                    prev.next = node.next;
                }
                size--;
                return;
            }
            prev = node;
            node = node.next; 
        }
    }

    @Override
    public void display() {
        for (int i = 0; i < table.length; i++) {
            Node<K, V> node = table[i];
            System.out.print("Bucket " + i + ": ");

            while (node != null) {
                System.out.print("[" + node.key + ": " + node.value + "] -> ");
                node = node.next;
            }
            System.out.println("null");
        }
        System.out.println();
    }

    @Override
    public void displayOnlyElements() {
        for (Node<K, V> node : table) {
            while (node != null) {
                System.out.println("[" + node.key + ": " + node.value + "]");
                node = node.next;
            }
        }
    }
}