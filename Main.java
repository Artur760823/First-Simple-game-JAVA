package Artur.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random rnd = new Random();
        int rndNumber = rnd.nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int userNumber;
        do {
            System.out.print("Zgadnij liczbę z przedziału od 1 do 10: ");
            userNumber = scanner.nextInt();
            i++;
            if (userNumber > rndNumber){
                System.out.print("Twoja liczba jest za duża, próbuj dalej.");
            }else if( userNumber < rndNumber){
                System.out.print("Twoja liczba jest za mała, spórbuj raz jeszcze.");
            }
        }while (userNumber != rndNumber);
        System.out.println("Brawo! Odgadłeś za " + i + " razem. To właśnie jest liczba: " + rndNumber +"!");
    }
}
