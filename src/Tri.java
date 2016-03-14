/**
 * Created by tobbe on 2016-03-14.
 *
 * @author tobbe
 * @version 2016.03.14
 */
public class Tri {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        int first = io.getInt();
        int second = io.getInt();
        int third = io.getInt();

        if(first+second == third) {
            System.out.println(first + "+" + second + "=" + third);
        }
        else if(first == second+third) {
            System.out.println(first + "=" + second + "+" + third);
        }

        else if(first-second == third) {
            System.out.println(first + "-" + second + "=" + third);
        }
        else if(first == second-third) {
            System.out.println(first + "=" + second + "-" + third);
        }

        else if(first*second == third) {
            System.out.println(first + "*" + second + "=" + third);
        }
        else if(first == second*third) {
            System.out.println(first + "=" + second + "*" + third);
        }

        else if(first/second == third) {
            System.out.println(first + "/" + second + "=" + third);
        }
        else if(first == second/third) {
            System.out.println(first + "=" + second + "/" + third);
        }
    }
}
