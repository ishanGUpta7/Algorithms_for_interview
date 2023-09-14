

public class Insertion {
    public static void main(String[] args){
        int[] arr={1,5,6,3,8,4};
        int i,j,temp;
        int n=arr.length;
        for(i=1;i<n;i++){
            temp=arr[i];
            j=i-1;
            while(j>=0 && temp<=arr[j]){
                arr[j+1]=arr[j];
                j--;

            }
            arr[j+1]=temp;
        }
        for(int k =0;k<n;k++){
            System.out.println(arr[k]);
        }
    }
    
}