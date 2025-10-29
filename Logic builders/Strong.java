import java.util.Scanner;

public class Strong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num,m;
        num=sc.nextInt();
        int temp=num;
        int r;
    
        int sum=0;
        while (num>0) {
            r=num%10;
            int fact=1;
        for(int i=1;i<=r;i++){
            fact=fact*i;
        }
        sum+=fact;
        num/=10;
    }
    if(temp==sum)
        System.out.println("strong number");
   

  
}
    
}

