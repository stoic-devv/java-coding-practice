package common.algos;

public class MergeSort {

    private static int[] getArray(int[] someArray, int start, int end) {
        int[] newArray = new int[end-start+1];
        int index = 0;
        for (int i = start; i <= end ; i++) {
            newArray[index] = someArray[i];
            index++;
        }
        return newArray;
    }
    private static int[] mergeSort(int[] someArray, int start, int end) {
        if(start > end) {
            return someArray;
        } else if (start < 0 || end > someArray.length-1){
            return someArray;
        } if(start == end) {
            return getArray(someArray,start,end);
        }
        int mid = (start + end)/2;
        int[] lArray = mergeSort(someArray, start, mid);
        int[] rArray = mergeSort(someArray, mid+1, end);
        int lPointer = 0;
        int rPointer = 0;
        int tempArraySize = end-start+1;
        int index = 0;
        int[] tempArray = new int[tempArraySize];
        while(lPointer < lArray.length && rPointer < rArray.length) {
            if(lArray[lPointer] <= rArray[rPointer]) {
                tempArray[index] = lArray[lPointer];
                lPointer++;
            } else if(lArray[lPointer] > rArray[rPointer]) {
                tempArray[index] = rArray[rPointer];
                rPointer++;
            }
            index++;
        }
        while(lPointer < lArray.length) {
            tempArray[index] = lArray[lPointer];
            lPointer++;
            index++;
        }
        while(rPointer < rArray.length) {
            tempArray[index] = rArray[rPointer];
            rPointer++;
            index++;
        }
        return tempArray;
    }

    public static void solution(int[] someArray) {
        someArray = mergeSort(someArray, 0, someArray.length-1);
        for (int num : someArray) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
    }
}
