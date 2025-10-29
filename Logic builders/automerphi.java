import java.util.Scanner;

public class automerphi {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int temp=n;
        int digit=0;
        while (temp>0) {
            temp=temp%10;
            digit++;
        }
        int sq=n*n;
        int s=(int)Math.pow(10,digit);
        int result=sq%s;
        if(n==result){
            System.out.println("automerphic");
        }
        sc.close();
    }
    
}
