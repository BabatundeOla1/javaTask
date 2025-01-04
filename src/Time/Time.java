package Time;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public void setTime(int hour, int minute, int second){
        validateHour(hour);
        validateMinute(minute);
        validateSecond(second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        validateHour(hour);
        this.hour = hour;
    }

    public void setMinute(int minute) {
        validateMinute(minute);
        this.minute = minute;
    }

    public void setSecond(int second) {
        validateSecond(second);
        this.second = second;
    }

    public String toUniversalString(){
        return  String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toString(){
        return String.format("%d:%02d:%02d %s", ((hour == 0 || hour ==12) ? 12 : hour % 12),
                                minute, second, (hour < 12 ? "AM" : "PM"));
    }
    private void validateHour(int hour){
        boolean checkHour = hour < 0 || hour >= 23;
        if(checkHour){
            throw new IllegalArgumentException("Hour out of range");
        }
    }
    private void validateMinute(int minute){
        boolean checkMinute = minute < 0 || minute >= 60;
        if(checkMinute){
            throw new IllegalArgumentException("Minutes out of range");
        }
    }
    private void validateSecond(int second){
        boolean checkSeconds = second < 0 || second >= 60;
        if(checkSeconds){
            throw new IllegalArgumentException("Seconds out of range");
        }
    }
}


