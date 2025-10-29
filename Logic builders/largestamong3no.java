import java.util.Scanner;

public class largestamong3no {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numberof a:");
        a=sc.nextInt();
        System.out.println("Enter the number of b:");
        b=sc.nextInt();
        System.out.println("Enter the number of c:");
        c=sc.nextInt();
        if(a>=b  && a>=c){
            System.out.println("a is larger");
        }else if(b>=a && b>=c){
            System.out.println("largest number is b");
         }
         else{
            System.out.println("largest number is c");
         }
         sc.close();
    }
    
}
