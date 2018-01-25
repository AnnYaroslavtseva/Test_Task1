import org.junit.BeforeClass;
import org.junit.Test;


import static org.junit.Assert.*;

public class IpAddressGeneratorTest {
    IpAddressGenerator generator;

    @Test
    public void ipAddressGeneratorTest() {
        IpAddressGenerator generator = new IpAddressGenerator();

        String[] ipTest =
                {"192.168.0.0",
                        "192.168.0.4",
                        "1.1.1.1",
                        "255.255.255.255",
                        "192.168.1.1",
                        "10.10.1.1",
                        "132.254.111.10",
                        "26.10.2.10",
                        "127.0.0.1",
                        "10.10.10",
                        "10.10",
                        "10",
                        "a.a.a.a",
                        "10.0.0.a",
                        "10.10.10.256",
                        "222.222.2.999",
                        "999.10.10.20",
                        "2222.22.22.22",
                        "22.2222.22.2"
                };
       /* for (int i = 0; i < ipTest.length-1; i++) {
            generator.generate(ipTest[i].toString(), ipTest[i+1].toString() );
            }*/

        generator.generate(ipTest[0], ipTest[1]);




    }


    }

