import java.util.ArrayList;

public class IpAdressGenerator {

    public void generate(String ipAdress1, String ipAdress2){
        ArrayList<Integer> mass1Int = new ArrayList<Integer>();
        ArrayList<Integer> mass2Int = new ArrayList<Integer>();
        String[] ipMass1;
        String[] ipMass2;
        ipMass1 = ipAdress1.split("\\.");
        ipMass2 = ipAdress2.split("\\.");

        for (int i = 0; i < 3; i++) {


             mass1Int.add(Integer.parseInt(ipMass1[i]));//создаем массив чисел из строки
            mass2Int.add(Integer.parseInt(ipMass2[i]));
        }

        for (int i = 0; i < 3; i++) {
            for (int j = mass1Int.get(i); j < mass2Int.get(i); j++) {
                System.out.print(j+".");

            }
            System.out.println();
        }

    }
}
