package AlgoritmoConcurrencia;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class MatrixMultiForkJoin {

    static double[][] answ;

    public void matrixMulti(double[][] A, double[][] B) {
        double[][] helper = new double[A.length][B[0].length];
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.invoke(new MultiRow(A, B, A.length, A[0].length, B.length, B[0].length, 0, B[0].length-1, helper));
        setResultados(helper);
    }

    public void setResultados(double[][] helper) {
        answ = new double[helper.length][helper[0].length];
        answ = helper.clone();
    }

    public void getResultados() {
        for (double[] answ1 : answ) {
            System.err.println(Arrays.toString(answ1));
        }
    }

    public class MultiRow extends RecursiveAction {

        public double[][] A, B, help;
        private final int i1, i2;
        private final int j1, j2;
        private final int left;
        private final int right;

        MultiRow(double[][] A, double[][] B, int i1, int j1, int i2, int j2, int left, int right, double[][] help) {
            this.A = A;
            this.B = B;
            this.help = help;
            this.i1 = i1;
            this.j1 = j1;
            this.i2 = i2;
            this.j2 = j2;
            this.left = left;
            this.right = right;
        }

        @Override
        protected void compute() {
            if (left == right) {
                MultiCols op = new MultiCols(A, B, i1, j1, i2, j2, 0, j2 - 1, left, help);
                invokeAll(op);
            } else {
                int mid = (int) (this.left + this.right) / 2;
                MultiRow arriba = new MultiRow(A, B, i1, j1, i2, j2, left, (left+right)/2, help);
                MultiRow abajo = new MultiRow(A, B, i1, j1, i2, j2, mid + 1, right, help);
                invokeAll(arriba, abajo);
            }
        }

        class MultiCols extends RecursiveAction {

            private final double[][] A, B, help;
            private final int i1, i2;
            private final int j1, j2;
            private final int left, right;
            private final int current;

            MultiCols(double[][] A, double[][] B, int i1, int j1, int i2, int j2, int left, int right, int current, double[][] help) {
                this.A = A;
                this.B = B;
                this.help = help;
                this.i1 = i1;
                this.j1 = j1;
                this.i2 = i2;
                this.j2 = j2;
                this.left = left;
                this.right = right;
                this.current = current;
            }

            @Override
            protected void compute() {
                if (left == right) {
                    for (int i = 0; i < this.j2; i++) {
                        help[current][left] += A[current][i] * B[i][left];
                    }
                } else {
                    int mid = (this.left + this.right) / 2;
                    MultiCols leftMatrix = new MultiCols(A, B, i1, j1, i2, j2, left, mid, current, help);
                    MultiCols rightMatrix = new MultiCols(A, B, i1, j1, i2, j2, mid + 1, right, current, help);
                    invokeAll(leftMatrix, rightMatrix);
                }
            }
        }

    }

}
