package projectforkjoin;

import java.util.Arrays;

public class CreateMatrix {

    private double[][] A, B;

    public CreateMatrix(int tamMatrix) {
        this.A = new double[tamMatrix][tamMatrix];
        this.B = new double[tamMatrix][tamMatrix];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                //A[i][j] = (int) (Math.random() * 100);                
                A[i][j] = j;
                //B[i][j] = (int) (Math.random() * 100);
                B[i][j] = j + 1;
            }
        }
    }

    public double[][] getMatrixA() {
        return this.A;
    }

    public double[][] getMatrixB() {
        return this.B;
    }

    public void printMatrixA() {
        for (double[] A1 : A) {
            System.out.println(Arrays.toString(A1));
        }
    }

    public void printMatrixB() {
        for (double[] B1 : B) {
            System.err.println(Arrays.toString(B1));
        }
    }
}
