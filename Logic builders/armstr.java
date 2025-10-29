import java.util.Scanner;

public class armstr {
    public static void main(String[] args) {
        int rem;
        int n;
        //int temp;
       // Scanner sc=new Scanner(System.in);
      //  System.out.println("enter the number");
      // n=sc.nextInt();
        for( n=1;n<=1000;n++){
        int temp;
        temp=n;
        int digit=0;
    int sum=0;
        while(temp>0){
            temp=temp/10;
            digit++;
        }
        temp=n;
        while(temp>0){
            rem=temp%10;
            sum=sum+(int)Math.pow(rem,digit);
            temp=temp/10;

        }
        if(sum==n){
            System.out.println(n);
        }
      //  sc.close();
    }
}
}

    

