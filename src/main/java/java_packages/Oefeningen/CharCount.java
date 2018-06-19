package java_packages.Oefeningen;

import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {

        //Scanner input = new Scanner(System.in);
        //System.out.println("Geef input: ");
        //String woord = input.next();

        //klinkerCheck('a');
        filter("blup");
    }

        public static void filter (String y){
        char [] charArray = new char [y.length()];

            for (int i = 0; i < y.length(); i++) {
                 charArray[i] = y.charAt(i);
            }

        }

    /*public static void klinkerCheck (char x) {
        char y;
        char[] klinkers = {'a', 'e', 'i', 'o', 'u'};
        int[] counter = new int[6];
        for (int i = 0; i < 5; i++) {
            if (x == klinkers[i]) {
                counter[i]++;
            }

        }
    }*/
}
