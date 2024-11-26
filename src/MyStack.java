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

//    public void pop() {
//        return element.remove();
//    }
}