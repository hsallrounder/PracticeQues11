import java.util.Scanner;

public class q3_n_copies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer text = new StringBuffer(sc.next());
        for(int i=0;i<text.length();i++){
            System.out.print(text.substring(0,2));
        }
    }
}
