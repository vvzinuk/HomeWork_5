class Task3 {
    static int[] getArraySumm (int[] arr1, int[] arr2){
        int[] result = new int [arr1.length];
        for (int i = 0;i<arr1.length; i++){
            result[i] = arr1[i] + arr2[i];
        }
        return  result;
    }

    static void printArraySumm (int[] arr1, int[] arr2){
        System.out.println("TASK 3: ADD TWO ARRAYS ELEMENT BY ELEMENT");
        Task1.printArray("First generated array:    ",arr1);
        Task1.printArray("Second generated array:   ",arr2);
        Task1.printArray("Result of addition:       ", getArraySumm( arr1, arr2 ) );
        System.out.println("_________________________");
    }
}
