import java.util.Scanner;

public class harshad {
    public static void main(String[] args) {
        int m,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        n=sc.nextInt();
        //for(int n=1;n<=m;n++){
        int sum=0;
        int temp=n;
        while(n>0){
            int r=n%10;
            sum+=r;
            n/=10;
        }
        if (temp%sum==0) 
            System.out.println("harshad");
        else{
           System.out.println("not harshad");
        }

    }
}
    
