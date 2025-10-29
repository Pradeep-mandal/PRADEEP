import java.util.Scanner;

public class neonnumber {
    public static void main(String[] args) {
        int sq;
        int num;
        int rem;
        int sum=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the num:");
       num=sc.nextInt();
        sq=num * num;
        while (sq>0) {
            rem=sq%10;
            sum=sum+rem;
            sq=sq/10;
          }
          if(num==sum){
            System.out.println("Neon");
          }
          else{
            System.out.println("not neon");
          }
          sc.close();


    }
    
}
