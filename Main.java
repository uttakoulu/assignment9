import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] array1 = new int[30];
        for (int i = 0; i < 30; i++) {
            array1[i] = rand.nextInt(100);
        }

        int[] array2 = new int[100000];
        for (int i = 0; i < 100000; i++) {
            array2[i] = rand.nextInt(100);
        }


        // BUBBLE SORT
        int[] bubbleInput1 = array1.clone();
        long time1sBubble = System.currentTimeMillis();
        new Bubble().bubbleSort(bubbleInput1);
        System.out.println("small array: " + (System.currentTimeMillis() - time1sBubble) + "ms with bubblesort");
        
        int[] bubbleInput2 = array2.clone();
        long time1lBubble = System.currentTimeMillis();
        new Bubble().bubbleSort(bubbleInput2);
        System.out.println("big array:   " + (System.currentTimeMillis() - time1lBubble) + "ms with bubblesort");
        System.out.println("-----"); 


        // MERGE SORT
        int[] mergeInput1 = array1.clone();
        long time1sMerge = System.currentTimeMillis();
        new Merge().threeWayMergeSort(mergeInput1, 0, mergeInput1.length - 1);
        System.out.println("small array: " + (System.currentTimeMillis() - time1sMerge) + "ms with mergesort");

        int[] mergeInput2 = array2.clone();
        long time1lMerge = System.currentTimeMillis();
        new Merge().threeWayMergeSort(mergeInput2, 0, mergeInput2.length - 1);
        System.out.println("big array:   " + (System.currentTimeMillis() - time1lMerge) + "ms with mergesort");
        System.out.println("-----");


        // RADIX SORT
        int[] radixInput1 = array1.clone();
        long time1sRadix = System.currentTimeMillis();
        new Radix().radixsort(radixInput1, radixInput1.length);
        System.out.println("small array: " + (System.currentTimeMillis() - time1sRadix) + "ms with radixsort");

        int[] radixInput2 = array2.clone();
        long time1lRadix = System.currentTimeMillis();
        new Radix().radixsort(radixInput2, radixInput2.length);
        System.out.println("big array:   " + (System.currentTimeMillis() - time1lRadix) + "ms with radixsort");
        System.out.println("-----");

    }
}
