/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.yunus_emre_dogan_hw3;

/**
 *
 * @author ynsmr
 */
import java.io.*;
import java.util.*;

public class HW3 implements HW3_2Interface {

    private int[][] grid;
    private int rows, cols;
    private boolean[][] visited_cells;

    // Dosyayi okuma
    @Override
    public void read_file(String filepath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            ArrayList<int[]> tmp_grid = new ArrayList<>();
            String str;

            while ((str = reader.readLine()) != null) {
                ArrayList<Integer> row_list = new ArrayList<>();
                String current_number = "";

                for (int i = 0; i < str.length(); i++) {
                    char c = str.charAt(i);

                    if (c == ' ') {
                        if (!current_number.isEmpty()) {
                            row_list.add(Integer.valueOf(current_number));
                            current_number = "";
                        }
                    } else {
                        current_number += c;
                    }
                }

                if (!current_number.isEmpty()) {
                    row_list.add(Integer.valueOf(current_number));
                }

                int[] row = new int[row_list.size()];
                for (int i = 0; i < row_list.size(); i++) {
                    row[i] = row_list.get(i);
                }
                tmp_grid.add(row);
            }

            rows = tmp_grid.size();
            cols = tmp_grid.get(0).length;
            grid = new int[rows][cols];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    grid[i][j] = tmp_grid.get(i)[j];
                }
            }

            visited_cells = new boolean[rows][cols];

        } catch (IOException e) {
            System.out.println("Dosya okuma hatası: " + e.getMessage());
        }
    }

    // Grid uzerindeki tum sekilleri bulup ciktiyi olusturma
    @Override
    public String find_figures() {
        ArrayList<ArrayList<int[]>> sekiller = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1 && !visited_cells[i][j]) {
                    ArrayList<int[]> sekil = new ArrayList<>();
                    find_shapes(i, j, sekil);
                    sekiller.add(sekil);
                }
            }
        }
        StringBuilder sonuc = new StringBuilder();
        sonuc.append("Toplam ").append(sekiller.size()).append(" sekil bulundu.\n\n");

        for (int i = 0; i < sekiller.size(); i++) {
            int[][] shape_grid = new int[rows][cols];
            for (int[] cell : sekiller.get(i)) {
                shape_grid[cell[0]][cell[1]] = 1;
            }
            sonuc.append("Sekil ").append(i + 1).append(":\n");
            sonuc.append(format_shape_grid(shape_grid)).append("\n");
        }

        return sonuc.toString();
    }

    // Sekilleri bulma
    private void find_shapes(int x, int y, List<int[]> shape) {
        LinkedList<int[]> list = new LinkedList<>();
        list.add(new int[]{x, y});
        visited_cells[x][y] = true;
        
        // Yonler (N, S, E, W, NE, NW, SE, SW)
        int[] drct_m = {-1, 1, 0, 0, -1, -1, 1, 1};
        int[] drct_n = {0, 0, 1, -1, 1, -1, 1, -1};

        while (!list.isEmpty()) {
            int[] tmp;
            int tmp_m, tmp_n;
            
            tmp = list.poll();
            tmp_m = tmp[0];
            tmp_n = tmp[1];
            
            shape.add(new int[]{tmp_m, tmp_n});
 
            for (int i = 0; i < 8; i++) {
                int new_m = tmp_m + drct_m[i];
                int new_n = tmp_n + drct_n[i];

                if ((new_m >= 0) && (new_m < rows) && (new_n >= 0) && (new_n < cols) 
                && (grid[new_m][new_n] == 1) && (!visited_cells[new_m][new_n])) {
                    list.add(new int[]{new_m, new_n});
                    visited_cells[new_m][new_n] = true;
                }
            }
        }
    }
 
    // Sekildeki 1'leri * ile, 0'lari bosluk ile formatlama
    private String format_shape_grid(int[][] shape_grid) {
        String sonuc = "";
        for (int[] item : shape_grid) {
            for (int j = 0; j < item.length; j++) {
                if (item[j] == 1) {
                    sonuc += "*";
                } else {
                    sonuc += " ";
                }
            }
            sonuc += "\n";
        }
        return sonuc;
    }

    // Sekilleri dosyaya yazdirma
    @Override
    public void print_figures_to_file(String myfigures, String filepath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filepath))) {
            writer.write(myfigures);
        } catch (IOException e) {
            System.out.println("Dosyaya yazma hatasi: " + e.getMessage());
        }
    }
    
    // Sekilleri konsola yazdirma
    @Override
    public void print_figures(String myfigures) {
        System.out.println(myfigures);
    }
}
