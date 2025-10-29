public class secondlargest {
    public static void main(String[] args) {
        int arr[]={10,20,60,60};
        int second=-1;
        int l=-1;
        for(int i=0;i<=3;i++){
            if(arr[i]>l){
                second=l;
                l=arr[i];

            }
            else if(arr[i]>second && arr[i]!=l){
                second=arr[i];
            }
        }
        System.out.println(second);

    }
    
}
