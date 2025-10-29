import java.util.Scanner;

public class perimeterofrectangle {
    public static void main(String[] args) {
        int l;
        int w;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of length:");
        l=sc.nextInt();
        System.out.println("Enter the value of width:");
        w=sc.nextInt();
        int perimeterofrectangle=2*(l+w);
        System.out.println(" perimeterofrectangle="+ perimeterofrectangle);
        sc.close();
    }
    
}
