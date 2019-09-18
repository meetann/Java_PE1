import java.util.Scanner;

public class q2{
    public static void main(String[] args){
        int x;
        Scanner s = new Scanner(System.in);
        x = s.nextInt();

        if(x>20 && x<30){
            if(x%2 != 0) { System.out.println("Tom"); }

            else System.out.println("Jerry");

        }

        else
            System.out.println("Enter number between 20-30!");

    }
}