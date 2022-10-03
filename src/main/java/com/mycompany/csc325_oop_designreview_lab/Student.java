
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author Alexander Harmaty
 */
public class Student extends Human {
    
    //Constructor (3 Param - Name, Age, Credits)
        public Student(String eName, short eAge, int eCredits) {
            super(eName, eAge);
            this.GPA = 0;
            this.credits = eCredits;
        }
        
    //Memeber variables
        double GPA;
        int credits;
    
    //Getters & Setters
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

    //SuperClass Implemented Methods
        @Override
        public String getAddress() {
            throw new UnsupportedOperationException("Not supported yet."); 
        }
        @Override
        public void setAddress(String address) {
            throw new UnsupportedOperationException("Not supported yet."); 
        }

}