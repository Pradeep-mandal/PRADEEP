import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        int n;
      int  count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n:");
        n=sc.nextInt();
        while (n>0) {
            count++;
            n=n/10;
        }
System.out.println(count);
sc.close();
    }
    
}
