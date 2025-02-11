package logistic;

import java.util.ArrayList;

public class Package {
    private ArrayList<Item> items = new ArrayList<>();
    private String destination;
    private int packageWeightInGram;
    private String senderContact;
    private String receiverContact;
    private int totalItemsInPackage;

    public Package(String destination, int packageWeightInGram, String senderContact, String receiverContact) {
        this.destination = destination;
        this.packageWeightInGram = packageWeightInGram;
        this.senderContact = senderContact;
        this.receiverContact = receiverContact;
    }
    public void setReceiverContact(String receiverContact) {
        this.receiverContact = receiverContact;
    }
    public void setSenderContact(String senderContact) {
        this.senderContact = senderContact;
    }
    public void setWeightInGram(int weightInGram) {
        this.packageWeightInGram = weightInGram;
    }
    public String getDestination() {
        return destination;
    }
    public String getSenderContact() {
        return senderContact;
    }
    public int getPackageWeightInGram() {
        int packagWeight = 0;
        for (Item myItems : items){
            packagWeight += myItems.getWeightInGrams();
        }
        return packagWeight;
    }
    public String getReceiverContact() {
        return receiverContact;
    }
    public int getTotalItemsInPackage() {
        int quantity = items.size();
        return quantity;
    }
    public void addItems(Item item){
        items.add(item);
        dispaly(item.getName() + " Has been added to package");
    }
    public ArrayList<Item> viewPackage() {
        getTotalItemsInPackage();
        if (items.isEmpty()){
            dispaly("Package is empty, add items.");
        }
        return items;
    }
    public void removePackage(Item item1) {
        findPackage(item1.getName());
        items.remove(item1);
        dispaly(item1.getName() + " Has been removed to package");
    }
    public Item findPackage(String itemName) {
        for (Item myItem : items){
            if (myItem.getName().equals(itemName)){
                return myItem;
            }
        }
        throw new IllegalArgumentException("Item not found in package");
    }

    @Override
    public String toString() {
        return "Weight = " + getPackageWeightInGram() + "Grams" + " \n" + "Sender Contact = " + getSenderContact() + " \n" + "Receiver Contact =  " + getReceiverContact() + " \n" +
                "Destination =  " + getDestination() + " \n" + "Total Items In Package = " + getTotalItemsInPackage() + " \n";
    }
    private void dispaly(String message){
        System.out.println(message);
    }
}
