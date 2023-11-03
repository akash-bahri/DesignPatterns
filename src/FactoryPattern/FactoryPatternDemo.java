/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FactoryPattern;

/**
 *
 * @author Akash Bahri
 */
public class FactoryPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory(); // Create a new ShapeFactory object
        Shape shape1 = shapeFactory.getShape("CIRCLE"); // Create a new Shape object of type Circle
        shape1.draw(); // Call the draw method of the Circle class\
        Shape shape2 = shapeFactory.getShape("RECTANGLE"); // Create a new Shape object of type Rectangle
        shape2.draw(); // Call the draw method of the Rectangle class
        Shape shape3 = shapeFactory.getShape("SQUARE"); // Create a new Shape object of type Square
        shape3.draw(); // Call the draw method of the Square class
        
    }
    
}
