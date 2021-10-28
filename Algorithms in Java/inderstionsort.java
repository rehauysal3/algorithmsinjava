public class InsertionSortExample {  
    public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  }  
            array[i+1] = key;}}    
    public static void main(String a[]){    
        int[] arr1 = {54, 26, 93,  17, 77, 31, 44, 55, 20};    
        System.out.println("Before Array");    
        for(int i:arr1){    
            System.out.print(i+" ");}    
        System.out.println();    
        insertionSort(arr1);   
        System.out.println("After Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");}}}  