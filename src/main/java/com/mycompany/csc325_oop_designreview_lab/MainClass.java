/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author Alexander Harmaty
 */
public class MainClass {
	
    public static void main(String[] args) {
        
        //Constructor calls
            Student std1= new Freshman("James", (short)20, 12);
            Student std2 = new Senior("John", (short)30, 90);

        //Create scanenr for input
            Scanner input = new Scanner(System.in);

        //Take inputs
            System.out.println("Set the GPA of the students...");
            System.out.println("Type and enter a number to set the GPA of student 1: ");
            double grade1 = input.nextDouble();
            System.out.println("Type and enter a number to set the GPA of student 2: ");
            double grade2 = input.nextDouble();
        
        //Set Student GPAs
            std1.setGPA(grade1);
            std2.setGPA(grade2);

        //Print results with calls to toString()
            System.out.println(std1);
            System.out.println(std2);
        
    }

}