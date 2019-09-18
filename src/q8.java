import java.util.Random;
import java.util.Scanner;

public class q8{
    public static void main(String[] args){
        int input=0;
        System.out.println("Enter a number between 1-50");

        Scanner sc = new Scanner(System.in);
        //input=sc.nextInt();

        Random r=new Random();
        int randomNumber=r.nextInt(50);
        //System.out.println(randomNumber);

        while (input!=randomNumber) {
            input=sc.nextInt();
            if (input < randomNumber) {
                System.out.println("Number guessed is less than original number");
            }
            else if (input > randomNumber) {
                System.out.println("Number guessed is more than original number");
            }
            else if (input == randomNumber) {
                System.out.println("Number guessed is equal to the original number!");
            }
        }
    }
}