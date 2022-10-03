/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author Alexander
 */
public class Senior extends Student {

    //Constructor (3 Param - Name, Age, Credits)
        public Senior(String eName, short eAge, int eCredits) {
            super(eName, eAge, eCredits);
        }
    
    //Override toString()
        @Override
        public String toString() {
            return "Senior { " + getName() + ", age " + getAge() + ", " + getCredits() + " credits, " + getGPA() + " GPA }";
        }
    
}
