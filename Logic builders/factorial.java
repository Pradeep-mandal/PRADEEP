import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int num;
        int fact;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=sc.nextInt();
        //int fact;
        for(int i=1;i<=num;i++){
            fact=i;
        
            System.out.println(i);
        }
        sc.close();
    }
    
}
