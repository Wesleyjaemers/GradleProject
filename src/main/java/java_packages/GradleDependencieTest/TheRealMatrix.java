package java_packages.GradleDependencieTest;

import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class TheRealMatrix {
    public static void main(String[] args) {

        RealMatrix a = MatrixUtils.createRealMatrix(2, 2);
        a.setRow(0, new double[]{1, 10});
        a.setRow(1, new double[]{2, 15});

        RealMatrix b = MatrixUtils.createRealMatrix(2, 2);
        b.setRow(0, new double[]{5, 4});
        b.setRow(1, new double[]{3, 14});

        RealMatrix res = a.multiply(b);

        System.out.println(res);
    }
}
