


public class ArrayIndexOutOfBounds {

    public static void generateException(int[] arr){
        System.out.println(arr[arr.length]);
    }

    public static void handleException(int[] arr){
        try {
            generateException(arr);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Custom expection caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        handleException(arr);
    }
}
