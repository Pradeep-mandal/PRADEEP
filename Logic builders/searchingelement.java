public class searchingelement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int key=3;
        int flage=0;
        for(int i=0;i<=4;i++){
            if(arr[i]==key){
                //System.out.println("index="+i);
                flage=1;
                break;

            }
        }
        if(flage==1){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }
    }
    
}
