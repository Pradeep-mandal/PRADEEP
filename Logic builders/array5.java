public class array5 {
    public static void main(String[] args) {
        int arr1[]={6,20,15,5,10};
        int length=arr1.length;
        int []arr2=new int[length];
        int j=0;
        for(int i=length-1;i>=0;i--){
           arr2[j]=arr1[i];
           System.out.println(arr2[j]);
           j++;
        }
        
    }
    
}
