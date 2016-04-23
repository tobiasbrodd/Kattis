/**
 * Created by tobbe on 2016-04-23.
 *
 * @author tobbe
 * @version 2016.04.23
 */
public class Trik {

    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        String[] moves = io.getWord().split("");
        boolean[] cups = new boolean[3];
        cups[0] = true;
        for (String current : moves) {
            boolean temp;
            switch (current) {
                case "A":
                    temp = cups[0];
                    cups[0] = cups[1];
                    cups[1] = temp;
                    break;

                case "B":
                    temp = cups[1];
                    cups[1] = cups[2];
                    cups[2] = temp;
                    break;

                case "C":
                    temp = cups[0];
                    cups[0] = cups[2];
                    cups[2] = temp;
                    break;

            }
        }
        for (int i = 0; i < 3; i++) {
            if (cups[i]) {
                System.out.println(i+1);
            }
        }
    }
}
