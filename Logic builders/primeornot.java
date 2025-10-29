import java.util.Scanner;

public class primeornot {
    public static void main(String[] args) {
        int n,count=0,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        i=1;
        while (i<=n) {
            if (n%i==0) 
                count++;
                i++;  
        }
        if (count==2) {
            System.out.println("prime");
            
        }
        else{
            System.out.println("not prime");
        }
    }
    
}
