import java.util.Scanner;
public class IT26102740Lab6Q2B{
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        int Number, num = 1;
        String values = "";

        System.out.print("Enter 10 numbers :");
        while(num <= 10){
            System.out.println("Enter number "+num+" :");
            Number = input.nextInt();
            values = values + Number + " ";
            num += 1;
        }
        System.out.println("The numbers you entered are :");
        System.out.println(values);
    }
    
}