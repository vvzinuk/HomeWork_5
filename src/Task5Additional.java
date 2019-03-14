public class Task5Additional {
    static int getAverageValue (int[] array){
        int sum = 0;
        for (int element: array) {
            sum += element;
        }
        return sum/array.length;
    }

    static int getAmountBiggerThanAverageElements(int[] array){
        int amount = 0;
        int average = getAverageValue( array );
        for (int element: array) {
            if (element > average)
                amount++;
        }
        return amount;
    }

    static void printAverage (int[] array){
        Task1.printArray( array );
        System.out.println("The average element value is: " + getAverageValue( array ));
        System.out.println("The amount of elements bigger than average element: " + getAmountBiggerThanAverageElements( array ));
        System.out.println("_________________________");
    }
}
