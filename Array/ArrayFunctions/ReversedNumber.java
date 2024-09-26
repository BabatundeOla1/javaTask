public class ReversedNumbers {

    public static void main(String[] args) {
        int[] elements = {1, 2, 3, 4, 5, 6};

        int[] reversed = reverseArray(elements);

        for (int count : reversed) {
   	System.out.print(count + " ");

        }
    }

    public static int[] reverseArray(int[] numbers) {

        int[] numbersLength = new int[numbers.length];

        for (int count = 0; count < numbers.length; count++) {

            numbersLength[count] = numbers[numbers.length -1 - count];
        }
        return numbersLength;
    }
}