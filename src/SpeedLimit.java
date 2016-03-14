/**
 * Created by tobbe on 2016-03-14.
 *
 * @author tobbe
 * @version 2016.03.14
 */
public class SpeedLimit {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        int lines = io.getInt();
        while (lines != -1) {
            int miles = 0;
            int hours;
            int prev = 0;
            int current;
            for (int i = 0; i < lines; i++) {
                int mph = io.getInt();
                current = io.getInt();
                hours = current - prev;
                prev = current;
                miles += mph * hours;
            }
            System.out.println(miles + " miles");
            lines = io.getInt();
        }
    }
}
