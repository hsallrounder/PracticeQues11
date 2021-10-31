import java.util.Scanner;

public class q1_check_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int j = text.length()-1;
        int flag=0;
        for(int i=0;i<text.length()/2;i++,j--){
            if(text.charAt(i)!=text.charAt(j)){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
