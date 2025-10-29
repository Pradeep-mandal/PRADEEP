import java.util.Scanner;

public class sunofarmstrong {
     public static void main(String[] args) {
        int num;
        int rem;
        int temp;
        //temp=num;
        //Scanner sc=new Scanner(System.in);
       // System.out.println("Enter the number:");
       // num=sc.nextInt();
       for( num=1;num<=1000;num++){
        temp=num;
        int digit=0;
        int sum=0;
        while(temp!=0){
        temp=temp/10;
         digit++;
        
        }
    //System.out.println(digit);
        temp=num;
        while(temp!=0){
            rem=temp%10;
            sum=sum+(int)Math.pow(rem, digit);
            temp=temp/10;
        }
        if(sum==num){
            System.out.println("Armstrong="+num);
        }
    }

    }
    
}
