public class Demo065 {
    public static void main(String[] args) {
        // Define an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Swap first and last element
        int temp = numbers[0];
        numbers[0] = numbers[numbers.length - 1];
        numbers[numbers.length - 1] = temp;

        // Print array elements after swap
        System.out.println("Array elements after swapping first and last:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}