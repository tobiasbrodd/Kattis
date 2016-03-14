import java.util.HashSet;

/**
 * Created by tobbe on 2016-03-14.
 *
 * @author tobbe
 * @version 2016.03.14
 */
public class Everywhere {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        int cases = io.getInt();
        for (int i = 0; i < cases; i++) {
            int cities = io.getInt();
            HashSet<String> visited = new HashSet<>();
            for (int j = 0; j < cities; j++) {
                visited.add(io.getWord());
            }
            System.out.println(visited.size());
        }
    }
}
