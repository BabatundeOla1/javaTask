import java.util.Scanner;

public class PizzaWahala {
    
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
    
    public static int getSlicesPerBox(int pizzaType) {
        switch (pizzaType) {
            case 1: return 4;
            case 2: return 6;
            case 3: return 8;
            case 4: return 12;
            default: return 0;
        }
    }
    
    public static int getPricePerBox(int pizzaType) {
        switch (pizzaType) {
            case 1: return 2000;
            case 2: return 2400;
            case 3: return 3000;
            case 4: return 4200;
            default: return 0; 
        }
    }
    
    public static int calculateNumberOfBoxes(int numberOfPeople, int slicesPerBox) {
        return (int) Math.ceil((double) numberOfPeople / slicesPerBox);
    }
    
    public static int calculateLeftoverSlices(int numberOfPeople, int slicesPerBox, int numberOfBoxes) {
        int totalSlices = numberOfBoxes * slicesPerBox;
        return totalSlices - numberOfPeople;
    }
    
    public static int calculateTotalPrice(int numberOfBoxes, int pricePerBox) {
        return numberOfBoxes * pricePerBox;
    }
    
    public static void displayResults(int numBoxes, int leftoverSlices, int totalPrice) {
        System.out.println("Number of boxes to buy = " + numBoxes + " boxes");
        System.out.println("Number of leftover slices = " + leftoverSlices + " slices");
        System.out.println("Total price = " + totalPrice);
    }
}