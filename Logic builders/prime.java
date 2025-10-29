import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int num;
        int count;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        num=sc.nextInt();
            for(int i=1;i<=num;i++){
                count=0;
                for(int j=1;j<=i;j++){
                    if(i%j==0){
                        count++;
                    }
                }
            
        
        if(count==2)
            System.out.println(i);
    }
    sc.close();
}
}
    

