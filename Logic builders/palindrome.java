import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        int n;
        //int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        n=sc.nextInt();
        int temp=n;
        int sum=0;
        while (n>0) {
            int r=n%10;
            sum=sum*10+r;
            n/=10;
        }
        if(temp==sum){
            System.out.println("palindrom");
        }
        else{
            System.out.println("not palindrom");
        }
        sc.close();
    }
    
}
