package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author Alexander Harmaty
 */
public abstract class Human {
    
    //Constructor (2 Param - Name, Age)
        public Human(String name, short age) {
            this.name = name;
            this.age = age;
        }
        
    //Memeber Variables
        private String name;
        private short age;
        private String address;
        
    //Getters & Setters
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public short getAge() {
            return age;
        }
        public void setAge(short age) {
            this.age = age;
        }
        
    //Abstract Getter & Setter
        public abstract String getAddress() ;
        public abstract void setAddress(String address);
    
}
