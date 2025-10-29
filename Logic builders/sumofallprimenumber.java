import java.util.Scanner;

public class sumofallprimenumber {
    public static void main(String[] args) {
        int n;
        int sum=0;
        int count;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                sum=sum+i;
            }
        }
        System.out.println(sum);
        sc.close();
    }
    
}
