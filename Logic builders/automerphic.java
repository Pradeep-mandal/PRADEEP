import java.util.Scanner;

public class automerphic {
    public static void main(String[] args) {
        int n,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        m=sc.nextInt();
        for(n=1;n<m;n++){
        int sq=n*n;
        if (String.valueOf(sq).endsWith(String.valueOf(n))) {
            System.out.println(n);
            
        }
    }
        sc.close();
    }
    
}
