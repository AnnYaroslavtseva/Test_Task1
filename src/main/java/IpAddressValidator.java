import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class IpAddressValidator {




    public void validate(String ip1, String ip2) {
        IpAddressGenerator ipAddressGenerator = new IpAddressGenerator();
        Matcher matcher;
        Pattern pattern;
        final String IP_ADDRESS_PATTERN
                = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
                + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
                + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
                + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

        pattern = Pattern.compile(IP_ADDRESS_PATTERN);


        if (!pattern.matcher(ip1).matches() || !pattern.matcher(ip2).matches()) {
            System.out.println("Недопустимое значение IP");
        } else {
            ipAddressGenerator.generate(ip1, ip2);


        }
    }






}

