package Task;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

    boolean tr = true;
    while (tr) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите число: ");
            float num = in.nextFloat();
            System.out.print(num);
            in.close();
            tr = false;
        } catch (Exception e) {
            System.out.println("Попробуй снова!");
        }
    }
}

}
