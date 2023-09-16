import java.util.Arrays;

public class quick {
    public static void quicksort(){

    }
    public static void main(String[] args){
        int[] arr={1,5,6,3,8,4};
        int n=arr.length;
        int low=0;
        int high=n-1;
        quicks(arr, low, high);
        System.out.println(Arrays.toString(arr));
        
       


    }
   
    private static void quicks(int[] array,int low,int high){
        if(low>=high){
            return;
        }
        int p =partition(array,low,high);
        quicks(array, low, p-1);
        quicks(array, p+1, high);
        
    }
    public static int partition(int[] array, int l, int h) {
        int pivot = array[h];
        int i = l - 1;
        for (int j = l; j < h; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, h);
        return i + 1;
    }

    
    private static void swap(int[] arra,int val1,int val2){
        int temp=arra[val1];
        arra[val1]=arra[val2];
        arra[val2]=temp;

        

        }

    
    }
    
