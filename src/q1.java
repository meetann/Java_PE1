import java.util.Scanner;

public class q1{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int input = sc.nextInt();

        int n1=input;
        int n2=0;
        int sum=0;

        if (n1>=0){
            int x=0;
            while(n1!=0){
                x=n1%10;
                n2=(n2*10)+x;
                n1=n1/10;
                if(x%2==0) sum+=x;
            }
        }
        if(input==n2){
            System.out.print(input+ " is a palindrome ");
        }else{
            System.out.print(input +" is not a palindrome ");
        }
        if(sum>25){
            System.out.print("and sum of even numbers is greater than 25.\n");
        }
        else if(sum<25){
            System.out.print("and sum of even numbers is less than 25.\n");
        }
        else
            System.out.print("and sum of even numbers is equal to 25.\n");

    }
}