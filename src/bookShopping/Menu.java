package bookShopping;

import javax.swing.*;
import java.util.Scanner;

public class Menu {

    private static BookShelf bookShelf = new BookShelf();
    private static ShoppingCart shoppingCart = new ShoppingCart();
    private static Order order = new Order(shoppingCart);
    public static void main(String[] args) {
        mainMenu();
    }

    private static void mainMenu(){
        String menu = """
                ===================
                        Menu
                ===================
                1 -> Admin
                2 -> Customer
                ===================
                 Enter Choice: 
                ===================
                """;

        char userInput = input(menu).charAt(0);
        switch (userInput){
            case '1' -> admin();
            case '2' -> customerLogin();
            default -> mainMenu();
        }
    }
    private static void admin() {
        try{
            String bookTitle = input("Enter Book Title: ").toLowerCase();
            String bookAuthor = input("Enter Author's Name: ");
            int bookPrice  = Integer.parseInt(input("Enter price: "));
            Book storeBooks = new Book(bookTitle,bookAuthor,bookPrice);
            bookShelf.storeBooks(storeBooks);
            display(bookTitle + "has been added \n");
            display("Books in Shelf \n" + bookShelf.viewShelfBooks());
            mainMenu();
        }catch (IllegalArgumentException error){
            display(error.getMessage());
            mainMenu();
        }
    }

    private static void customerLogin() {
        String menu = """
                =============================
                          Customer
                =============================
                1 -> See Books In Shelf
                2 -> Search Book
                3 -> Add Books to cart
                4 -> Check Cart
                5 -> Remove Books From Cart
                6 -> Place Order
                7 -> View Order History
                8 -> Main Menu
                =============================
                      Enter Choice: 
                =============================
                """;
        char userInput = input(menu).charAt(0);
        switch (userInput){
            case '1' -> viewBooks();
            case '2' -> searchForBook();
            case '3' -> addBooksToCart();
            case '4' -> checkShoppingCart();
            case '5' -> removeBooksFromCart();
            case '6' -> placeOrder();
            case '7' -> orderHistory();
            case '8' -> mainMenu();
            default -> customerLogin();
        }
    }

    private static void viewBooks() {
        display("Books in Shelf: \n" + bookShelf.viewShelfBooks());
        customerLogin();
    }

    private static void searchForBook() {
        display("Books in Shelf \n" + bookShelf.viewShelfBooks());
        try{
            String bookTitle = input("Enter Book Title: ").toLowerCase();
            display("Searched Book(s): \n" + bookShelf.searchBook(bookTitle));
            customerLogin();
        }catch (IllegalArgumentException error){
            display(error.getMessage());
            customerLogin();
        }
    }

    private static void addBooksToCart() {
        display("Books in Shelf \n" + bookShelf.viewShelfBooks());
        try {
            String bookTitle = input("Enter the title of the book to add to your cart: ").toLowerCase();
            Book book = bookShelf.searchBook(bookTitle);
            if (book != null) {
                shoppingCart.addBooks(book);
                bookShelf.removeBook(book);
                customerLogin();
            } else {
                display("Book not found.");
                customerLogin();
            }
        }
        catch (IllegalArgumentException error) {
            display(error.getMessage());
            customerLogin();
        }
    }
    private static void checkShoppingCart() {
        display("Quantity: " + shoppingCart.getQuantity());
        display(" "+ shoppingCart.viewBook());
        customerLogin();
    }

    private static void removeBooksFromCart() {
        display("Books in Cart \n" + shoppingCart.viewBook());
        try{
            String bookTitle = input("Enter the title of book to remove: ").toLowerCase();
            Book book = shoppingCart.searchBook(bookTitle);
            if (book != null){
                shoppingCart.remove(book);
                bookShelf.storeBooks(book);
                checkShoppingCart();
            }
            else {
                display("Book not found");
            }
        }
        catch (IllegalArgumentException error){
            display(error.getMessage());
            customerLogin();
        }
    }

    private static void placeOrder() {
        display(" " + shoppingCart.viewBook());
        display("" + order.placeOrder());
        display(order.getTotalCost());
        customerLogin();

    }

    private static void orderHistory() {
        String orderId = input("Enter Order Id: ");
        order.orderHistory(orderId);
        customerLogin();
    }
    private static String input(String message) {
        display(message);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
//        return JOptionPane.showInputDialog(message);
    }

    private static void display(String message){
        System.out.println(message);
//        JOptionPane.showMessageDialog(null, message);
    }
}
