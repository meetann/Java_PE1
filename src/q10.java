import java.util.Scanner;

public class q10{
    public static void main(String[] args){

        String str,repeat_str,final_str="";
        int input;

        Scanner sc = new Scanner(System.in);
        str = sc.next();
        input = sc.nextInt();

        int len=str.length();
        repeat_str = str.substring(len-input,len);

        for(int i=0; i<input; i++){
            final_str=final_str.concat(repeat_str);
        }
        System.out.println(str+final_str);
    }
}