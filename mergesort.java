import java.util.Arrays;

public class mergesort {
    public static void main(String[] args){
        int[] arr={1,5,6,3,8,4};
       
        mergesor(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void mergesor(int[] arr) {
        if(arr.length<2){
            return;
        }
        int n =arr.length;
        int mid=n/2;
        int[] left=new int[mid];
        int[] right=new int[n-mid];
        for(int i =0;i<mid;i++){
            left[i]=arr[i];
        }
        for(int i=mid;i<n;i++){
            right[i-mid]=arr[i];    

        }
        mergesor(left);
        mergesor(right);
        merge(arr,left,right);

    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i=0;
        int j =0;
        int k =0;

        int l =left.length;
        int r =right.length;
        while(i<l && j<r){
            if(left[i]<=right[j]){
                arr[k]=left[i];
                i++;
            
            }
            else{
                arr[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<l){
            arr[k]=left[i];
            i++;
            k++;
        }
        while (j<r) {
            arr[k]=right[j];
            j++;
            k++;
            
        }
        
    }
    
}