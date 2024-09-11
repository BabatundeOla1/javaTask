import java.util.Scanner;

public class PizzaWahala2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of the people: ");
        int numberOfPeople = sc.nextInt();

        System.out.print("Enter pizza type (1 >> Sapa size, 2 >> Small Money,3 >> Big boys, 4 >> Odogwu): ");
        int pizzaType = sc.nextInt();
        
        int slicesPerBox = getSlicesPerBox(pizzaType);
        int pricePerBox = getPricePerBox(pizzaType);
        
        int numberOfBoxes = calculateNumberOfBoxes(numberOfPeople, slicesPerBox);
        int leftoverSlices = calculateLeftoverSlices(numberOfPeople, slicesPerBox, numberOfBoxes);
        int totalPrice = calculateTotalPrice(numberOfBoxes, pricePerBox);
        
        displayResults(numberOfBoxes, leftoverSlices, totalPrice);
    }
}