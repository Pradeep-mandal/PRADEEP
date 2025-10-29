import java.util.Scanner;

public class NEON {
    public static void main(String[] args) {
        int m;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        m=sc.nextInt();
for(int n=1;n<=m;n++){
        int sq=n*n;
        int sum=0;
        while(sq>0){
            int r=sq%10;
            sum=sum+r;
            sq/=10;
        }
        if (n==sum) {
           System.out.println(n); 
        }
    }
    }
    
}
