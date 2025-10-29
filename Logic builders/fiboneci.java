import java.util.Scanner;

public class fiboneci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num;
        num=sc.nextInt();
        int a=0;
        int b=1;
        System.out.println("fact="+a +b);
        for(int i=1;i<=num;i++){
            int next=a+b;
            a=b;
            b=next;
        System.out.println(next);
        }

    }
    
}
