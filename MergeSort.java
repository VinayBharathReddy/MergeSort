public class MergeSort { 
    public static void main(String[] vb){
         
        int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
        MergeSorting mms = new MergeSorting();
        mms.sort(inputArr);
        for(int i:inputArr){
            System.out.print(i);
            System.out.print(" ");
        }
    }
}