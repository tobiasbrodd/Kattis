/**
 * Created by tobbe on 2016-03-14.
 *
 * @author tobbe
 * @version 2016.03.14
 */
public class Conundrum {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        int days = 0;
        String[] cipher = io.getWord().split("");
        int length = cipher.length;
        for (int i = 0; i < length; i++) {
            switch (i % 3) {
                case 0:
                    if (!cipher[i].equals("P")) {
                        days++;
                    }
                    break;
                case 1:
                    if (!cipher[i].equals("E")) {
                        days++;
                    }
                    break;
                case 2:
                    if (!cipher[i].equals("R")) {
                        days++;
                    }
                    break;
            }
        }
        System.out.println(days);
    }
}
