import java.util.Scanner;

public class q5{
    public static void main(String[] args){

        String str;
        int sum=0;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();

        String[] arr = str.split(" ");

//        int temp=arr.length;
//        System.out.println(temp);


        for(int i=0; i<arr.length; i++){
//            System.out.println(arr[i]);
            sum=sum+Integer.parseInt(arr[i]);
        }

        System.out.println(sum);
    }
}