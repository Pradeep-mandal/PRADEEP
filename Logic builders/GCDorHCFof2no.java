public class GCDorHCFof2no {
    public static void main(String[] args) {
        int a=6;
        int b=2;
        while (b!=0) {
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println(a);
    }
    
}
