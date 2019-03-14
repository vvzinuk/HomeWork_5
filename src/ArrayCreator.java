public abstract class ArrayCreator {

    static int[] createArray (int setType, int size, int minItemSize, int maxiItemSize){
        if (size > 0){
            int[] arrayInt = new int[size];
            for(int i = 0; i < arrayInt.length; i++){
                arrayInt[i] = (int) ((Math.random()* (maxiItemSize - minItemSize) + minItemSize));
            }
            return arrayInt;
        } else {
            return null;
        }
    }

    public static double[] createArray (double setType, int size, int maxiItemSize){
        if (size > 0){
            double[] arrayDouble = new double[size];
            for(int i = 0; i < arrayDouble.length; i++){
                arrayDouble[i] = Math.random()* maxiItemSize;
            }
            return arrayDouble;
        } else {
            return null;
        }
    }

    public static char[] createArray (char setType, int size){
        if (size > 0){
            char[] arrayChar = new char[size];
            for(int i = 0; i < arrayChar.length; i++){
                arrayChar[i] = (char)(33 + Math.random()* 94);
            }
            return arrayChar;
        } else {
            return null;
        }
    }

}
