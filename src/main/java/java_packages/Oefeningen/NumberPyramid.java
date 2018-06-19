package java_packages.Oefeningen;

public class NumberPyramid {
    public static void main(String[] args) {

        int i = 0;
        int max = 7;

        while(i <= max){


            //count powers up
            for(int j=0; j <= i; j++){
                System.out.print((int)Math.pow(2, j)+ " ");
            }
            //count powers down
            for (int k= i-1; k >= 0;k--){
                System.out.print((int)Math.pow(2, k)+ " ");
            }
            System.out.println();
            i++;
        }
        System.out.println(args [0]);
    }
}
