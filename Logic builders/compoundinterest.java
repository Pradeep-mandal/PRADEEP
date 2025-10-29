import java.util.Scanner;

public class compoundinterest {
    public static void main(String[] args) {
        int p;
        int r;
        int ci;
         int t;
        Scanner sc=new Scanner(System.in);
        System.out.println("The value of p:");
        p=sc.nextInt();
        System.out.println("The value of r:");
        r=sc.nextInt();
        System.out.println("The value of t:");
        t=sc.nextInt();
        ci=p*((1+r/100)^t)-p;
        System.out.println(ci);
        sc.close();

    }
    
}
