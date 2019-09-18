import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class q7{
    public static void main(String[] args){
        ArrayList<String> arr_list = new ArrayList<String>();

        String input;
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        int len = input.length();
        int sum=0;

        for(int i=0; i<len; i++){
            arr_list.add(input.substring(i,i+1));
        }

        Collections.sort(arr_list, Collections.reverseOrder());

        System.out.println(arr_list);


        for(int i=0; i<arr_list.size(); i++){
            if(Integer.parseInt(arr_list.get(i))%2==0) {
                sum = sum + Integer.parseInt(arr_list.get(i));
            }
        }
        if(sum>15)
        System.out.println(sum);
        else System.out.println("Sum is less than 15.");
    }
}