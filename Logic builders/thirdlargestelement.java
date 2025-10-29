public class thirdlargestelement {
    public static void main(String[] args) {
        int arr[]={1,6,3,4,6,6};
        int l=-1;
        int s=-1;
        int t=-1;
        for(int i=0;i<=5;i++){
            if(arr[i]>l){
                t=s;
                s=l;
                l=arr[i];
            }
            else if(arr[i]>s && arr[i]!=l && arr[i]!=t){
                s=arr[i];
                t=s;
            }
            else if(arr[i]>t && arr[i]!=s && arr[i]!=l){
                t=arr[i];
            }
        }
        System.out.println(t);
    }
    
}
