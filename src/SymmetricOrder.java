/**
 * Created by tobbe on 2016-03-14.
 *
 * @author tobbe
 * @version 2016.03.14
 */
public class SymmetricOrder {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        int numberOfNames = io.getInt();
        int set = 1;
        while (numberOfNames != 0) {
            System.out.println("SET " + set);
            String[] names = new String[numberOfNames];
            int i = 0;
            int j = 0;
            int k = numberOfNames - 1;
            while (j < numberOfNames) {
                names[i] = io.getWord();
                i += k * (int) Math.pow(-1, j);
                j++;
                k--;
            }
            for (String current : names) {
                System.out.println(current);
            }
            set++;
            numberOfNames = io.getInt();
        }
    }
}
