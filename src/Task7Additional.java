class Task7Additional {
    static int getMinElement(int[] array){
        int min = array[0];
        for (int element: array){
            if (element < min)
                min = element;
        }
        return min;
    }

    static int getMaxElement(int[] array){
        int max = array[0];
        for (int element: array){
            if (element > max)
                max = element;
        }
        return max;
    }

    static int[] deleteMinMaxDuplicates (int[] array){
        int amountOfDuplicates = 0;
        for (int element: array) {
            if(element == getMinElement(array) || element == getMaxElement(array)){
                amountOfDuplicates++;
            }
        }
        int[] result = new int [array.length-amountOfDuplicates+2];
        int min = getMinElement(array);
        int max = getMaxElement(array);
//        System.out.println( min+ "," + max);
        int counterMin = 0, counterMax = 0;
        for (int i = 0, j = 0; i < result.length; i++, j++){
            if (array[i] != min && array[i] != max){
                result[j] = array[i];
            } else if (counterMin < 1 && (array[i] == min)){
                result[j] = array[i];
                counterMin++;
            } else if(counterMax < 1 && (array[i] == max)) {
                result[j] = array[i];
                counterMax++;
            } else {
                j--;
            }
        }
        return result;
    }

    static void printWithoutDuplicates(int[] array){
        System.out.println("TASK 7: DELETE DUPLICATES OF MIN AND MAX ELEMENTS");
        Task1.printArray("Generated array:                      ", array);
        Task1.printArray("Array without min and max duplicates: ", deleteMinMaxDuplicates(array));
        System.out.println("_________________________");
    }
}
