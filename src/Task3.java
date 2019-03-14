public class Task3 {
    static int[] getArraySumm (int[] arr1, int[] arr2){
        int[] result = new int [arr1.length];
        for (int i = 0;i<arr1.length; i++){
            result[i] = arr1[i] + arr2[i];
        }
        return  result;
    }

    static void printArraySumm (int[] arr1, int[] arr2){
        System.out.print("First ");
        Task1.printArray( arr1 );
        System.out.print("Second ");
        Task1.printArray( arr2 );
        System.out.print("Result of addition: ");
        Task1.printArray( getArraySumm( arr1, arr2 ) );
        System.out.println("_________________________");
    }
}
