package AlgoritmosSecuenciales;

import java.util.Arrays;

public class MatrixAdd {

    private double[][] answ;

    public MatrixAdd(double[][] A, double[][] B) {
        this.answ = new double[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                answ[i][j] = A[i][j] + B[i][j];
            }
        }
    }

    public void getResultados() {
        for (double[] answ1 : answ) {
            System.out.println(Arrays.toString(answ1));
        }
    }
}
