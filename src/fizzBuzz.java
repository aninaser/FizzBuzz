/**
 * Created by Aunteek on 3/29/2017.
 */
import java.util.*;
public class fizzBuzz {
    public static void main(String[] args) {
        for (double i = 1; i < 101; i++) {
            if ((i / 3) == Math.floor(i / 3)) {
                System.out.println("Fizz");
            } else if ((i / 5) == Math.floor(i / 5)){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
