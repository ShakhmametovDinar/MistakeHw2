package Task;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String a1 = in.nextLine();
        if(a1.equals("")) throw new RuntimeException("Введена пустая строка!");
        System.out.print(a1);
        in.close();
    }
}
