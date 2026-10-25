import java.util.Scanner;
public class IT26102740Lab6Q1{
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        int num, square;
        double root;

        System.out.print("Enter a number:");
        num = input.nextInt();

        square = num*num;
        root = Math.sqrt(num);

        System.out.println("The square of " + num + " is "  + square);
        System.out.println("The square root of " + num + " is " + root);
        
    }
}