import java.util.Scanner;
//want to find the smallest number using different functions
public class Main{

    public static void main(String []args){
        //instatiate
        scanner kb = new Scanner(System.in);
        System.out.print("Enter the radius of sphere: ");
        double radius = kb.nextDouble();
        System.out.printf("Volume is %f%n", SphereVolume(radius));
    }//end of methods that determine volumeSphere

    public static double SphereVolume(double radius){
        double volume = (4.0/3.0) * Math.PI*Math.pow(radius,3)
        return volume;
    }//end of method SphereVolume

}//end of class modulisation