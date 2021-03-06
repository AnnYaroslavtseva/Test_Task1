import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
import static org.junit.runners.Parameterized.*;

@RunWith(value = Parameterized.class)
public class IpAddressValidatorTest {



    private  String ipTest1;
    private  String ipTest2;


    public IpAddressValidatorTest(String ipTest1, String ipTest2) {
        this.ipTest1 = ipTest1;
        this.ipTest2 = ipTest2;
    }


    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {

                {"192.168.0.0",
                "192.168.0.4"},
                {"1.1.1.1",
                "1.1.15.15"},
                {"127.0.0.1",
                "10.10.10"},
                {"10.10",
                "10"},
                {"a.a.a.a",
                "10.0.0.a"},
                {"10.10.10.256",
                "222.222.2.999"},
                {"999.10.10.20",
                "2222.22.22.22"},
        };
        return Arrays.asList(data);
    }

    @Test
    public void validateTest() {

        IpAddressValidator validator = new IpAddressValidator();
        System.out.println("Начало теста");


        validator.validate(ipTest1, ipTest2);
        System.out.println("Конец теста");


    }
}