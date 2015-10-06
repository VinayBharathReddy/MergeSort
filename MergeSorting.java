
public class MergeSorting {     
    private int[] array;
    private int[] tempArr;
 
    public void sort(int inputArr[]) {
        this.array = inputArr;
        this.tempArr = new int[inputArr.length];
        splitSort(0, inputArr.length - 1);
    }
 
    private void splitSort(int lowIndx, int upprIndex) {   
        if (lowIndx < upprIndex) {
            int mid = lowIndx + (upprIndex - lowIndx) / 2;
            splitSort(lowIndx, mid);
            splitSort(mid + 1, upprIndex);
            merging(lowIndx, mid, upprIndex);
        }
    }
 
    private void merging(int lowIndx, int mid, int upprIndex) {
        for (int i = lowIndx; i <= upprIndex; i++) {
            tempArr[i] = array[i];
        }
        int i = lowIndx;
        int j = mid + 1;
        int k = lowIndx;
        while (i <= mid && j <= upprIndex) {
            if (tempArr[i] <= tempArr[j]) {
                array[k] = tempArr[i];
                i++;
            } else {
                array[k] = tempArr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            array[k] = tempArr[i];
            k++;
            i++;
        }
 
    }
}