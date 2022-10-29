package patikadev;
import java.util.Scanner;
public class bmi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        float length,weight,bmi;
        System.out.print("enter your lenght by meter: ");
        length = inp.nextFloat();

        System.out.print("enter your weight by kilogram: ");
        weight = inp.nextFloat();

        bmi = weight / (length * length);
        System.out.print("your body mass index is: "+bmi);











    }
}
