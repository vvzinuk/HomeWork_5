class Task2 {

    public static int getNumOfOddElements(int[] array){
        int counter = 0;
        for (int element: array){
            if (element%2 != 0){
                counter += 1;
            }
        }
        return counter;
    }

    public static int getSumOfOddElements(int[] array){
        int sum = 0;
        for (int element: array){
            if (element%2 != 0){
                sum += element;
            }
        }
        return sum;
    }

    static void printNumAndSumOfOddElements(int[] array){
        Task1.printArray(array);
        System.out.println("The summ of all odd elements is: " + getSumOfOddElements( array ));
        System.out.println("The number of all odd elements is: " + getNumOfOddElements( array ));
        System.out.println("_________________________");
    }
}
