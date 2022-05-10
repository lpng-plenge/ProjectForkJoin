package AlgoritmoConcurrencia;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class MatrixAddForkJoin2 {

    static double[][] answ;

    public void matrixAdd(double[][] A, double[][] B) {
        double[][] helper = new double[A.length][B[0].length];
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.invoke(new AddRow(A, B, A.length, A[0].length, B.length, B[0].length, 0, B[0].length - 1, helper));
        setResultados(helper);
    }

    public void setResultados(double[][] helper) {
        answ = new double[helper.length][helper[0].length];
        answ = helper.clone();
    }

    public double[][] getResultados() {
        return this.answ;
    }

    public class AddRow extends RecursiveAction {

        public double[][] A, B, help;
        private final int i1, i2;
        private final int j1, j2;
        private final int left;
        private final int right;

        AddRow(double[][] A, double[][] B, int i1, int j1, int i2, int j2, int left, int right, double[][] help) {
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
                AddCols op = new AddCols(A, B, i1, j1, i2, j2, 0, j2 - 1, left, help);
                invokeAll(op);
            } else {
                int mid = (int) (this.left + this.right) / 2;
                AddRow arriba = new AddRow(A, B, i1, j1, i2, j2, left, mid, help);
                AddRow abajo = new AddRow(A, B, i1, j1, i2, j2, mid + 1, right, help);
                invokeAll(arriba, abajo);
            }
        }

        class AddCols extends RecursiveAction {

            private final double[][] A, B, help;
            private final int i1, i2;
            private final int j1, j2;
            private final int left, right;
            private final int current;

            AddCols(double[][] A, double[][] B, int i1, int j1, int i2, int j2, int left, int right, int current, double[][] help) {
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
                    help[left][current] = A[current][current] + B[current][current];
                } else {
                    int mid = (this.left + this.right) / 2;
                    AddCols leftMatrix = new AddCols(A, B, i1, j1, i2, j2, left, mid, current, help);
                    AddCols rightMatrix = new AddCols(A, B, i1, j1, i2, j2, mid + 1, right, current, help);
                    invokeAll(leftMatrix, rightMatrix);
                }
            }
        }

    }
}
