/**
 * Created by tobbe on 2016-04-23.
 *
 * @author tobbe
 * @version 2016.04.23
 */
public class Spavanac {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        int hour = io.getInt();
        int minute = io.getInt();
        int totalMinutes = hour*60 + minute;
        int newTotalMinutes = totalMinutes - 45;
        if (newTotalMinutes < 0) {
            hour = 23;
            minute = 60 + newTotalMinutes;
            System.out.println(hour + " " + minute);
        }
        else {
            hour = newTotalMinutes / 60;
            minute = newTotalMinutes % 60;
            System.out.println(hour + " " + minute);
        }
    }
}
