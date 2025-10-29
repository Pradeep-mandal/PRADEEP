public class sumofevenorodddigit {
    public static void main(String[] args) {
        int n=3333;
        int rem;
        int sum=0;
        while(n>0){
            rem=n%10;
            if(rem%2!=0){
           // if(rem%2==0){
                sum=sum+rem;
                n=n/10;
            }
        }
        System.out.println(sum);
    }
    
}
