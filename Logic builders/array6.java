public class array6 {
    public static void main(String[] args) {
        int arr[]={1,23,4,5,6};
        int length=arr.length;
        int l=0;
        int r=length-1;
        int temp;
        while(l<r){
        temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        l++;
        r--;
        }
        for(int i=0;i<=length-1;i++)
        System.out.println(arr[i]);

    }
    
}
