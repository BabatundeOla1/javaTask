package logistic;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class PackageTest {

    @Test
    public void testThatItemsCanBeAddedIntoPackage(){
        Item item1 = new Item("Book", 5, 10_000.00);
        Item item2 = new Item("Paint", 10, 20_000.00);
        Package myPackage = new Package("Lagos", 15, "09036011444", "09063475087");
        myPackage.addItems(item1);
        myPackage.addItems(item2);

        assertEquals(2, myPackage.getTotalItemsInPackage());
    }

    @Test
    public void testThatYouCanViewItemsInPackge(){
        Item item1 = new Item("Book", 5, 10_000.00);
        Item item2 = new Item("Paint", 10, 20_000.00);
        Package myPackage = new Package("Lagos", 15, "09036011444", "09063475087");
        myPackage.addItems(item1);
        myPackage.addItems(item2);

        ArrayList<Item> itemsInPackage = myPackage.viewPackage();
        assertTrue(itemsInPackage.contains(item1));
        assertTrue(itemsInPackage.contains(item2));

        assertEquals(2, myPackage.getTotalItemsInPackage());

        System.out.println(myPackage.viewPackage());
    }

    @Test
    public void testThatYouCanRemoveItemFromPackage(){
        Item item1 = new Item("Book", 5, 10_000.00);
        Item item2 = new Item("Paint", 10, 20_000.00);

        Package myPackage = new Package("Lagos", 15, "09036011444", "09063475087");
        myPackage.addItems(item1);
        myPackage.addItems(item2);

        myPackage.removePackage(item1);

        assertEquals(1, myPackage.getTotalItemsInPackage());
        System.out.println(myPackage.viewPackage());
    }

    @Test
    public void testThatYouCanFindItemsInPackage(){
        Item item1 = new Item("Book", 5, 10_000.00);
        Item item2 = new Item("Paint", 10, 20_000.00);

        Package myPackage = new Package("Lagos", 15, "09036011444", "09063475087");
        myPackage.addItems(item1);
        myPackage.addItems(item2);

        assertEquals(item1,myPackage.findPackage("Book"));
    }

    @Test
    public void testThatErrorIsThrownWhenItemIsNotFoundInPackage(){
        Item item1 = new Item("Book", 5, 10_000.00);
        Item item2 = new Item("Paint", 10, 20_000.00);

        Package myPackage = new Package("Lagos", 15, "09036011444", "09063475087");
        myPackage.addItems(item1);
        myPackage.addItems(item2);

        assertThrows(IllegalArgumentException.class, ()-> myPackage.findPackage("Pencil"));
    }

    @Test
    public void testThatYouCanGetTheTotalWeightOfThePackage(){
        Item item1 = new Item("Book", 5, 10_000.00);
        Item item2 = new Item("Paint", 10, 20_000.00);
        Item item3 = new Item("Pencil", 1, 20_000.00);

        Package myPackage = new Package("Lagos", 15, "09036011444", "09063475087");
        myPackage.addItems(item1);
        myPackage.addItems(item2);
        myPackage.addItems(item3);

        assertEquals(16, myPackage.getPackageWeightInGram());
        System.out.println("Total Grams Of Items In Package:  " +  myPackage.getPackageWeightInGram());
    }

    @Test
    public void testThatYou() {
        Item item1 = new Item("Book", 5, 10_000.00);
        Item item2 = new Item("Paint", 10, 20_000.00);
        Item item3 = new Item("Pencil", 1, 20_000.00);

        Package myPackage = new Package("Lagos", 15, "09036011444", "09063475087");
        myPackage.addItems(item1);
        myPackage.addItems(item2);
        myPackage.addItems(item3);

        System.out.println(myPackage);
    }

}