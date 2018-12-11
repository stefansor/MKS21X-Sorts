import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        int elements = 10000;
        if(args.length > 0) {
            elements = Integer.parseInt(args[0]);
        }
        int[] array = new int[elements];
        for(int i = 0 ; i < elements; i++){
            array[i] =(int)(Math.random()*10000);
        }
        int[] array1 = Arrays.copyOf(array, elements);
        int[] array2 = Arrays.copyOf(array, elements);
        int[] array3 = Arrays.copyOf(array, elements);

        long startTime = System.currentTimeMillis();
        Sorts.selectionSort(array1);
        long endTime = System.currentTimeMillis();
        System.out.println("Selection Sort: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        Sorts.insertionSort(array2);
        endTime = System.currentTimeMillis();
        System.out.println("Insertion Sort: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        Sorts.bubbleSort(array3);
        endTime = System.currentTimeMillis();
        System.out.println("Bubble Sort: " + (endTime - startTime));
    }
}
