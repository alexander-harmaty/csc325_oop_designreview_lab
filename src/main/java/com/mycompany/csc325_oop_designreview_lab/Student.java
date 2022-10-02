
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author Alexander Harmaty
 */
public class Student extends Human{
    double GPA;

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    
    public Student(String eName, int eAge, double eGPA) {
        super(eName, eAge);
        this.GPA = eGPA;
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