import java.util.ArrayList;

public class MyStack {
    private ArrayList<String> element;
    private int size;
    public MyStack(){
        this.element = new ArrayList<>();
    }

//    public boolean isEmpty() {
//        return element.isEmpty();
//    }

    public int size() {
        return element.size();
    }
    public String push(String input){
        return element.add(input);
    }
}