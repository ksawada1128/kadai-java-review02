
public class Clock {

    public static void main(String[] args) {
        int seconds = getSeconds(18, 32, 47);
        System.out.println(seconds);

    }

    public static int getSeconds(int hour, int minute, int second) {
        int result = (60 * 60 * hour) + (60 * minute) + second;
        return result;
    }

}
