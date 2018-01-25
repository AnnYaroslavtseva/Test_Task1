import java.util.ArrayList;

public class IpAddressGenerator {

    public void generate(String ipAdress1, String ipAdress2){
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
        int a;
        int b;
        String ip = null;

        for (int i = 3; i > 0; i--){
            a = mass1Int.get(i);
            b = mass2Int.get(i);

            for (int j = a+1; j < b; j++) {
            //while (a < b){
                //a++;



                switch (i){


                case 0: ip = j+"."+ mass1Int.get(1)+"."+ mass1Int.get(2)+"."+mass1Int.get(3);
                    break;

                case 1: ip = mass1Int.get(0)+"."+ j+"."+ mass1Int.get(2)+"."+mass1Int.get(3);
                    break;

                case 2: ip = mass1Int.get(0)+"."+ mass1Int.get(1)+"."+ j+"."+mass1Int.get(3);
                    break;

                case 3: ip = mass1Int.get(0)+"."+ mass1Int.get(1)+"."+ mass1Int.get(2)+"."+j;
                    break;

            }
            System.out.println(ip);


            }
        


        }



        /*StringBuffer stringBuffer = new StringBuffer();
        int j;
        int j1;
        for (int i = 3; i > 0; i--) {
            j = mass1Int.get(i);
            j1 = mass2Int.get(i);
            while ( j  <=  j1)  {
                j++;
                stringBuffer.append(j+".");


            }
            System.out.println(stringBuffer);
            stringBuffer.setLength(0);
        }*/

    }
}
