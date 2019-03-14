class Task6Additional {
    static int[] concatenateArrays (int[] arr1, int[] arr2){
        int[] result = new int [arr1.length+arr2.length];
        for (int i = 0;i < arr1.length;i++ ){
            result[i] = arr1[i];
        }
        for (int i = 0;i < arr2.length;i++ ){
            result[arr1.length+i] = arr2[i];
        }
        return result;
    }

    static void printConcatenatedArrays (int[] arr1, int[] arr2){
        System.out.println("TASK 6: CONCATENATE TWO ARRAYS");
        Task1.printArray( "Generated array: ",arr1 );
        Task1.printArray( "Generated array: ",arr2 );
        Task1.printArray("Result of concatenation: ", concatenateArrays( arr1,arr2 ));
        System.out.println("_________________________");
    }
}
