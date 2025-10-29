import java.util.Scanner;

public class perfectnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int m;
        m=sc.nextInt();
        for(int n=1;n<=m;n++){
            int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println(n);
        }
    }
        sc.close();
        
    }
    
}
