import java.util.Scanner;

public class findLCMof2no {
    public static void main(String[] args) {
        int a;
        int b;
        int max;
        int lcm;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of a");
        a=sc.nextInt();
        System.out.println("Enter the number of b:");
        b=sc.nextInt();
        if(a>b){
            max=a;
        }else{
            max=b;
        }
        while(true){
            if(max%a==0  && max%b==0){
                lcm=max;
                break;
            }
            max++;
        }
        System.out.println(lcm);
        sc.close();

    }
    
}
