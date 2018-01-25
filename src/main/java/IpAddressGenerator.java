import java.util.ArrayList;

public class IpAddressGenerator {

    public void generate(String ipAdress1, String ipAdress2) {
        ArrayList<Integer> mass1Int = new ArrayList<Integer>();
        ArrayList<Integer> mass2Int = new ArrayList<Integer>();
        String[] ipMass1;
        String[] ipMass2;
        ipMass1 = ipAdress1.split("\\.");
        ipMass2 = ipAdress2.split("\\.");

        for (int i = 0; i <= 3; i++) {


            mass1Int.add(Integer.parseInt(ipMass1[i]));//создаем массив чисел из строки
            mass2Int.add(Integer.parseInt(ipMass2[i]));
        }
        int i = mass1Int.get(0);
        int j = mass1Int.get(1);
        int k = mass1Int.get(2);
        int n = mass1Int.get(3);


        while (i < mass2Int.get(0)) {
            while (j <= 255) {
                while (k <= 255) {
                    while (n <= 255) {
                        System.out.println(i + "." + j + "." + k + "." + n);
                        n++;

                    }
                    n = 0;
                    k++;
                }
                k = 0;
                j++;
            }
            j = 0;
            i++;
        }
        while (j < mass2Int.get(1)) {
            while (k <= 255) {
                while (n <= 255) {
                    System.out.println(i + "." + j + "." + k + "." + n);
                    n++;
                }
                n = 0;
                k++;
            }
            k = 0;
            j++;
        }
        while (k < mass2Int.get(2)) {
            while (n <= 255) {
                System.out.println(i + "." + j + "." + k + "." + n);
                n++;
            }
            n = 0;
            k++;
        }
        while (n < mass2Int.get(3)) {
            System.out.println(i + "." + j + "." + k + "." + n);
            n++;
        }
        System.out.println(i + "." + j + "." + k + "." + n);
    }
}



