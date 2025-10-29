import java.util.Scanner;

public class userinputofGCD {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of a:");
        a=sc.nextInt();
        System.out.println("Enter the number of b:");
        b=sc.nextInt();
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println(a);
        sc.close();

    }
    
}
