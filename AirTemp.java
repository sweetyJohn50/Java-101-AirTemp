package airTemp;

import java.util.Scanner;
public class AirTemp {

    public static void main(String[] args) {
     
        int aT;
        
        Scanner  i = new Scanner(System.in);

        System.out.print("Hava Sıcaklığı Giriniz : ");
        
        aT = i.nextInt();
        
        if (aT < 5){
            System.out.println("Kayak yapabilirsiniz");
        } else if (aT > 5 && aT < 15) {
            System.out.println("Sinemaya gidebilirsin");

            if (aT > 5 && aT < 25) {
                System.out.println("Pikniğe gidebilirsin");
            }
            if (aT > 25) {
                System.out.println("Yüzmeye gidebilirsin");
            }

        }
    }
}
