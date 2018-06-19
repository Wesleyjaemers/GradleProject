package java_packages.Oefeningen;

public class ArrayOef {
    public static void main(String[] args) {

        int[] array = {1, 38, 5, 15, -48, 4, 76};
        int length = array.length;

        for (int i = 0; i < length; i++) {
            System.out.println(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            int doub = temp*2;
            array[i] = doub;    // Hiermee kunnen we de lijst herschrijven

        }

        String[] arrayNaam = {"Ludo", "Erik", "Johan", "Patrick", "Joske"}; // print de volledige lijst maar parameters kunnen aangepast worden
        for (int i = 0; i < arrayNaam.length; i++) {
            System.out.println(arrayNaam[i]);
        }

        for (String naam: arrayNaam){ // print de volledige lijst
            stuurEmailNaar(naam);
        }

    }
    public static void stuurEmailNaar (String email){
        //....
    }
}
