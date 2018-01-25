import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class IpAddressValidator {
    private IpAddressGenerator ipAddressGenerator;



    public void inputIPRange(){
        ipAddressGenerator = new IpAddressGenerator();
        System.out.println("Введите диапазон ip:");
        Scanner scan = new Scanner(System.in);
        String ipAddressInput = scan.nextLine();
        String ipAddressInput2 = scan.nextLine();
        if (!validate(ipAddressInput)||!validate(ipAddressInput2)){
            System.out.println("Недопустимое значение IP");
        }
        else{
            ipAddressGenerator.generate(ipAddressInput,ipAddressInput2);


        }

    }


    private boolean validate(String ipAddressInput) {
        Matcher matcher;
        Pattern pattern;
        final String IP_ADDRESS_PATTERN
                = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
                + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
                + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
                + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

            pattern = Pattern.compile(IP_ADDRESS_PATTERN);

            return pattern.matcher(ipAddressInput).matches();
        }







}

