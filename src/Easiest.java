/**
 * Created by tobbe on 2016-03-14.
 *
 * @author tobbe
 * @version 2016.03.14
 */
public class Easiest {
    public static void main(String[] args) {
        new Easiest();

    }

    public Easiest() {
        Kattio io = new Kattio(System.in, System.out);
        int N = io.getInt();
        while(N != 0) {
            int digitSum = sumDigits(N, 100000);
            int p = 11;
            while(!(sumDigits(p * N, 1000000) == digitSum)) {
                p++;
            }
            System.out.println(p);
            N = io.getInt();
        }
    }

    private int sumDigits(int remainder, int cardi) {
        if(cardi < 10) {
            return remainder;
        }

        return (remainder / cardi) + sumDigits(remainder % cardi, cardi/10);
    }
}
