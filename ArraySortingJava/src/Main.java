import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int arraySize;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        arraySize = input.nextInt();

        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++){
            System.out.println("Enter " + (i+1) + " element: ");
            array[i] = input.nextInt();
        }

        array = sortDescendingOrder(array);
        System.out.println("\nDescendingOrder");
        for (int anArray : array) {
            System.out.print(anArray + " ");
        }

        array = sortAscendingOrder(array);
        System.out.println("\nAscendingOrder");
        for (int anArray : array) {
            System.out.print(anArray + " ");
        }



    }
    private static int[] sortDescendingOrder (int[] array){

        int temp;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if (array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
    private static int[] sortAscendingOrder  (int[] array){

        int temp;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if (array[i] < array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
