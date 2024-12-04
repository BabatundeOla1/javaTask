import java.util.ArrayList;

public class MyStack {
    private ArrayList<String> element;
    private boolean isEmpty;
    private int size;
    public MyStack(){
        this.element = new ArrayList<>();
        this.isEmpty = true;
    }

    public boolean Empty() {
        return this.isEmpty;
    }

    public int size() {
        return element.size();
    }
    public void push(String input){
        element.add(input);
    }

    public int display(){
        return element.size() - 1;
    }

    public String pop(){
        return element.remove(display());
    }
    public void peek(){
        System.out.println(element.remove(display()));
    }

    public void displayStack() {
        System.out.println(element);
    }
}