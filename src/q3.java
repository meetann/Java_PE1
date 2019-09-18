import java.util.Scanner;

public class q3{
    public static void main(String[] args){
        String str;
        int flag=0,i=0;
        char x;
        boolean check;
        Scanner sc = new Scanner(System.in);
        str = sc.next();

        while (flag!=str.length()){
            if((str.charAt(i)-'a'>=0 && str.charAt(i)-'a'<=25) || (str.charAt(i)-'A'>=0 && str.charAt(i)-'A'<=25)) {
                flag+=1;
                i++;
            }
            else break;
        }

        if(flag==str.length()) {
            for(int j=0; j<str.length(); j++){
                x=str.charAt(j);
                check = vowel_check(x);
                if(check==true) System.out.println(x+" :"+"Vowel");
                else  System.out.println(x+" :"+"Consonant");
            }

        }

        else System.out.println("Wrong input");

    }

    public static boolean vowel_check(char x){
        if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u'){
            return true;
        }
        else return false;

    }
}