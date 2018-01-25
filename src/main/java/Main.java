import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        IpAddressValidator ipAddressValidator = new IpAddressValidator();
        System.out.println("Введите диапазон ip:");
        Scanner scan = new Scanner(System.in);
        String inputIP1 =scan.nextLine();
        String inputIP2 = scan.nextLine();
        ipAddressValidator.validate(inputIP1,inputIP2);// валидация ip


    }
}
