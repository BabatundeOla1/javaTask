public class DescendingNumbers2 {
    public static void main(String... args) {
        displaySortedNumbers(6, 7, 1);
    }

    public static void displaySortedNumbers(double firstNumber, double secondNumber, double thirdNumber) {
        double largestNum = firstNumber;
        double middleNum = firstNumber;
        double smallestNum = firstNumber;

        if (secondNumber > largestNum) {
            middleNum = largestNum;
            largestNum = secondNumber;
        } else if (secondNumber < smallestNum) {
            middleNum = smallestNum;
            smallestNum = secondNumber;
        } else {
            middleNum = secondNumber;
        }

        if (thirdNumber > largestNum) {
            middleNum = largestNum;
            largestNum = thirdNumber;
        } else if (thirdNumber < smallestNum) {
            middleNum = smallestNum;
            smallestNum = thirdNumber;
        } else {
            middleNum = thirdNumber;
        }

        System.out.println(largestNum + " " + middleNum + " " + smallestNum);
    }
}