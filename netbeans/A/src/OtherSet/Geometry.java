package OtherSet;

import static java.lang.Math.sqrt;
import java.util.Scanner;


public class Geometry {
    
    
    public static double cubeVolume(double h){
        return h*h*h;
    }
    public static double cubeSurface(double h){
        return 6*h*h;
    }
    public static double sphereVolume(double r){
        return ((4/3)*(3.1416)*r*r*r);
    } 
    public static double sphereSurface(double r){
        return (4*(3.1416)*r*r);
    }
    public static double cylinderVolume(double r,double h){
        return ((3.1416)*r*r*h);
    }
    public static double cylinderSurface(double r,double h){
        return (2*3.1416*r*h+ 2*3.1416*r*r);
    }
    
    public static double coneVolume(double r,double h){
        return (3.1416*r*r*h/3);
    }
    public static double coneSurface(double r,double h){
        return (3.1416*r)*(r+ sqrt(h*h+r*r));
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                
        
        System.out.println("Enter the Radius and Height:");
        
        double r = in.nextDouble();
        double h = in.nextDouble();
        
        System.out.println("Cube Volumn: " + cubeVolume(h));
        System.out.println("Cube Surface: " + cubeSurface(h));
        System.out.println("Sphere Volumn: " + sphereVolume(h));
        System.out.println("Sphere Surface: " + sphereSurface(h));
        System.out.println("Cylinder volumn: " + cylinderVolume(r,h));
        System.out.println("Cylinder Surface: " + cylinderSurface(r,h));
        System.out.println("Cone Volumn: " + coneVolume(r,h));
        System.out.println("Cone Surface: " + coneSurface(r,h));
    }
        
}
