public class array3 {
    public static void main(String[] args) {
        int arr[]={1,2,10,4,5};
        int large=arr[0];
        for(int i=0;i<=4;i++){
                if(large<arr[i]){
                    large=arr[i];
                }
            }
            System.out.println(large);
        }
    }
    
