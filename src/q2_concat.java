import java.util.Locale;
import java.util.Scanner;

public class q2_concat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text1 = sc.next().toLowerCase();
        String text2 = sc.next().toLowerCase();
        if(text1.charAt(text1.length()-1)==text2.charAt(0)){
            StringBuffer buff = new StringBuffer(text2);
            System.out.println(text1.concat(buff.deleteCharAt(0).toString()));
        }
        else{
            System.out.println(text1.concat(text2));
        }
    }
}
