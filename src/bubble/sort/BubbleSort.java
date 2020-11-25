package bubble.sort;

/**
 *
 * @author Mina
 */
public class BubbleSort {

    public static void main(String[] args) {
         int[] arr = {20,35,-15,7,55,1,-22};
        
//        arr[0] = 20;
//        arr[1] = 35;
//        arr[2] = -15;
//        arr[3] = 7;
//        arr[4] = 55;
//        arr[5] = 1;
//        arr[6] = -22;
        
        
        for (int unSortedIndex = arr.length-1; unSortedIndex>0;unSortedIndex--){
            for (int i = 0;i<unSortedIndex;i++){
                if(arr[i]>arr[i+1]){
                    swap(arr, i, i+1);
                }
            }
        }
        
        
        
        for (int i =0; i<arr.length;i++){
            System.out.println(arr[i]+" ");
            
        }
    }
    
    
    public static void swap(int[] arr, int i, int j){
        
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
        
    }
    
}
