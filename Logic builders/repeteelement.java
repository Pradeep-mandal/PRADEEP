public class repeteelement {
    public static void main(String[] args) {
        int arr[]={5,6,7,5,10,11,5,5,9,6,2};
        int flage=0;
        int key=5;
        int sum=0;
        for(int i=0;i<=10;i++){
            if(arr[i]==key){
                flage=1;
                if(flage==1){
                    sum=sum+1;
                }
            }
        }
        System.out.println("my key value "+sum +" times appears");
    }
    
}
