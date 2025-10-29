import java.util.Scanner;

public class displayprimenumber2toN {
    public static void main(String[] args) {
        //int a;
        //int b;
        int count;
        int n;
        Scanner sc=new Scanner(System.in);
       // System.out.println("Enter number of a:");
        //a=sc.nextInt();
       // System.out.println("Enter the number of b:");
       // b=sc.nextInt();
        System.out.println("Enter the number of n:");
        n=sc.nextInt();
            for(int i=1;i<=n;i++){
                count=0;
                for(int j=1;j<=i;j++){
                    if(i%j==0){
                        count++;
                    }
                }
                    if(count==2){
                        System.out.println(i);
                    }
                }
sc.close();
        
    }
    
}
