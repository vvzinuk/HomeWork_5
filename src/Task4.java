public class Task4 {
    static int[] getPositiveElements(int[] array){
        return separate( true, array );
    }

    static int[] getNegativeElements(int[] array){
        return separate( false, array );
    }

    static int[] separate (boolean positive, int[] array){
        int numOfPositiveElements = 0;
        for (int element: array){
            if (element >= 0) numOfPositiveElements++;
        }
        int[] positiveArray = new int [numOfPositiveElements];
        int[] negativeArray = new int [array.length-numOfPositiveElements];
        int resultArrayIndex = 0;
        if (positive) {
            for (int i = 0; i < array.length; i++){
                int j = 0;
                if (array[i] >= 0){
                    positiveArray[resultArrayIndex] = array[i];
                    resultArrayIndex++;
                }
            }
            return positiveArray;
        } else {
            for (int i = 0; i < array.length; i++){
                if (array[i] < 0){
                    negativeArray[resultArrayIndex] = array[i];
                    resultArrayIndex++;
                }
            }
            return negativeArray;
        }
    }

    static void printSeparatedArrays(int[]array){
        Task1.printArray( array );
        System.out.println("Array with only negative elements: ");
        Task1.printArray( getPositiveElements( array ) );
        System.out.println("Array with only negative elements: ");
        Task1.printArray( getNegativeElements( array ) );
        System.out.println("_________________________");
    }
}
