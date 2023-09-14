

public class bubblesort {
    public static void main(String[] args){
       int[] array={1,5,6,3,8,4};
       int n =array.length;
       for(int i =0;i<n;i++){
        for(int j =0;j<n-i-1;j++){
            int temp;
            if(array[j]>array[j+1]){
                temp =array[j];
                array[j]=array[j+1];
                array[j+1]=temp;
            }
        }
       }
       for(int k=0;k<n;k++){
        System.out.println(array[k]);

       }
       
    }
    
}