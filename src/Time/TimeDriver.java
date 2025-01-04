package Time;

public class TimeDriver {
    public static void main(String[] args) {
        Time time = new Time();
        displayTime("Before passing value: ", time);
        System.out.println();

        time.setTime(13, 57, 25);
        displayTime("After Passing Value: ", time);
        System.out.println();


        try{
            time.setTime(99, 99, 99);
        }catch (IllegalArgumentException err){
            System.out.println(err.getMessage());
        }
    }

    private static void displayTime(String header, Time t){
        System.out.println(header + "\n" + t.toUniversalString() + "\n" + t.toString());
    }
}
