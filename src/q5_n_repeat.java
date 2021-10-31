import java.util.Scanner;

public class q5_n_repeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        if(n>s.length()){
            System.out.println("'n' must be in between 0 and the length of the string.");
        }
        else{
            String new_s = s.substring(s.length()-n);
            for(int i=0;i<n;i++){
                System.out.print(new_s);
            }
        }
    }
}
