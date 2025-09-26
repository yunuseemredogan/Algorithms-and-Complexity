/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.yunus_emre_dogan_hw3;

/**
 *
 * @author ynsmr
 */
public class Yunus_Emre_Dogan_HW3 {

    public static void main(String[] args) {
        HW3 hw3 = new HW3();
        hw3.read_file("C:\\Users\\ynsmr\\OneDrive\\Sunumlar\\NetBeansProjects\\Yunus_Emre_Dogan_HW3\\src\\main\\java\\com\\mycompany\\yunus_emre_dogan_hw3\\HW3Q2.txt");
        String figures = hw3.find_figures();
        hw3.print_figures(figures);
        hw3.print_figures_to_file(figures, "C:\\Users\\ynsmr\\OneDrive\\Sunumlar\\NetBeansProjects\\Yunus_Emre_Dogan_HW3\\src\\main\\java\\com\\mycompany\\yunus_emre_dogan_hw3\\HW3Q2_Output.txt");
    }
}
