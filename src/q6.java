import java.util.Scanner;

public class q6{
    public static void main(String[] args){
        char input;
        Scanner sc = new Scanner(System.in);
        input = sc.next().charAt(0);

        if(input-'a'>=0 && input-'a'<=25){
            System.out.println("Small Case Letter");
        }

        else if(input-'A'>=0 && input-'A'<=25){
            System.out.println("Capital Letter");
        }

        else if (input-'0'>=0 && input-'0'<=9){
            System.out.println("A digit");
        }

        else System.out.println("Special Case Character");

    }
}