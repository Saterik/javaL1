// ввод значения в консоль
import java.util.Scanner;
public class exp1 {
    public static void main(String[] args){
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name:");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s", name);
        iScanner.close();

    }
}
