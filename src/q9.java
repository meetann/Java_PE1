import java.util.Scanner;

public class q9{
    public static void main(String[] args){
        String str ;
        Scanner sc = new Scanner(System.in);
        str = sc.next();

        String reverse_str="";
        int length_str=str.length()-1;

        for(int i=length_str; i>=0; i--){
            reverse_str=reverse_str+str.charAt(i);
        }
        System.out.println(reverse_str);

    }
}