
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author Alexander Harmaty
 */
public class Student extends Human {
    double GPA;
    int credits;

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    
    public Student(String eName, int eAge, int eCredits) {
        super(eName, eAge);
        this.GPA = 0;
        this.credits = eCredits;
    }

    @Override
    public String getAddress() {
        throw new UnsupportedOperationException("Not supported yet."); 
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setAddress(String address) {
        throw new UnsupportedOperationException("Not supported yet."); 
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}