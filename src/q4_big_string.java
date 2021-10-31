import java.util.Scanner;

public class q4_big_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text1 = sc.next();
        String text2 = sc.next();
        int x = Math.max(text1.length(),text2.length());
        StringBuffer text = new StringBuffer();
        for(int i=0;i<x;i++){
            text.append(text1.charAt(i));
            text.append(text2.charAt(i));
        }
        System.out.println(text);
    }
}
