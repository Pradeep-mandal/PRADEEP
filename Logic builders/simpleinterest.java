import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        int p;
        int r;
        int t;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of p:");
        p=sc.nextInt();
        System.out.println("Enter the number of r:");
        r=sc.nextInt();
        System.out.println("Enter the number of t:");
        t=sc.nextInt();
        int simpleinterest=(p*r*t)/100;
        System.out.println("simpleinterest="+simpleinterest);
        sc.close();
    }
    
}
