import java.util.Scanner;
public class fac {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = n - 1;

        while(i!=0){
            n = n * i;
            i--;
        }
        System.out.println(n);
        
    }
}