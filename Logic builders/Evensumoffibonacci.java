import java.util.Scanner;

public class Evensumoffibonacci {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        n=sc.nextInt();
        int first=0;
        int second=1;
        int sum=0;
        //int a;
        System.out.println(first);
        System.out.println(second);
        for(int i=1;i<=n;i++)
        {
            if(first%2==0){
                sum+=first;
               // System.out.println(sum);

            }
        int next=first+second;
            first=second;
            second=next;
           System.out.println(next);
           //next=a;
        }
        System.out.println("sum="+sum);
          sc.close();
        }
        
    }

    

