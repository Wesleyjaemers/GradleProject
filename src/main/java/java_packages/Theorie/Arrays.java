package java_packages.Theorie;

public class Arrays {

    public static void main(String[] args) {

        int i = 5;  //Scalar variable

        int[] j = {1, 2, 5, 7, 9, -6, 12};
        System.out.println(j.length);   // print lengte van de array, 7 vakjes in dit geval

        int index = 1 + 1;
        int getal = j[2];
        System.out.println(index); // waarde opvragen op index 2

        int[] getallen = new int[20]; //nieuwe array met default waarden (in dit geval 0), 20 posities
        for (int k : getallen) {

            System.out.println(k);
        }
        String[] getallen2 = new String[20]; // Als het geen primitief datatype is gaat de waarde 'null' zijn, 20 posities
        for (String k : getallen2) {

            System.out.println(k);
        }

        double x = 5;
        double y = 0;
        double res;
        res = x / y;
        System.out.println(res); // dit geeft resultaat INFINITY
        System.out.println(res / res); // dit geeft NaN (Not a Number)*/

        int[][] getallen3 = {  // 2-dimensionale array, een array zijn de parameters van de eerste array
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
                            };
        int getal3 = getallen3[2][0];
        System.out.println(getal3);

    }
}
