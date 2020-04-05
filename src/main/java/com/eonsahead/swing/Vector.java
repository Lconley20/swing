
package com.eonsahead.swing;


public class Vector {
    
    private double[] elements;
    
    public Vector() {
        this.elements = new double[4];
    } // Vector()
    
    public Vector(double x, double y, double z) {
        this.elements[0] = x;
        this.elements[1] = y;
        this.elements[2] = z;
        this.elements[3] = 1;      
    } // Vector( double, double, double )
    
    public double get(int i) {
        return this.elements[i];
    } // get( int )
    
    public void set(double num, int i) {
        this.elements[i] = num;
    }// set( double, int )
    
    public double dot(Vector v) {
        double x = v.get(0) * this.get(0);
        double y = v.get(1) * this.get(1);
        double z = v.get(2) * this.get(2);
        
        return x + y + z;       
    }// dot( Vector )
    
    public double magnitude() {
        double x = this.get(0) * this.get(0);
        double y = this.get(1) * this.get(1);
        double z = this.get(2) * this.get(2);
        
        return Math.sqrt(x + y + z);
    }// magnitude()
    
    public Vector normalize() {
        double x = this.get(0) / this.magnitude();
        double y = this.get(1) / this.magnitude();
        double z = this.get(2) / this.magnitude();
        Vector v = new Vector(x, y, z);
        
        return v;
    }// normalize()
    
    public Vector cross(Vector v) {
        double x = (v.get(1) * this.get(2)) - (v.get(2) * this.get(1));
        double y = (v.get(2) * this.get(0)) - (v.get(0) * this.get(2));
        double z = (v.get(0) * this.get(1)) - (v.get(1) * this.get(0));
        Vector result = new Vector(x, y, z);
        
        return result;
    }// cross( Vector )
    
} // Vector
