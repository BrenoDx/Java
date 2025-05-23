/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author breno
 */
public class Rectangle {
    public double height;
    public double width;
    
    public double area(){
        return width*height;
    }
    
    public double perimeter(){
        return 2*(width+height);
    }
    
    public double diagonal(){
        return Math.sqrt(width*width + height*height);
    }
}
