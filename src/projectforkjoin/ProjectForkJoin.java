package projectforkjoin;

import AlgoritmosSecuenciales.MatrixAdd;
import AlgoritmosSecuenciales.MatrixMulti;
import AlgoritmoConcurrencia.MatrixAddForkJoin;
import AlgoritmoConcurrencia.MatrixMultiForkJoin;

public class ProjectForkJoin {

    public static void main(String[] args) {
        long inicio;
        CreateMatrix matrix = new CreateMatrix(1000);
        //matrix.printMatrixA();
        //matrix.printMatrixB();
        
        /*
        //SUMA
        //Secuencial
        inicio = System.currentTimeMillis();
        MatrixAdd matrixAdd = new MatrixAdd(matrix.getMatrixA(), matrix.getMatrixB());
        System.out.println("Tiempo transcurrido de secuencial en ms:" + (System.currentTimeMillis() - inicio));
        matrixAdd.getResultados();
        
        //Concurrencia
        MatrixAddForkJoin forkAdd = new MatrixAddForkJoin();
        inicio = System.currentTimeMillis();
        forkAdd.matrixAdd(matrix.getMatrixA(), matrix.getMatrixB(), 100);
        System.out.println("Tiempo transcurrido de concurrencia en ms:" + (System.currentTimeMillis() - inicio));
        forkAdd.getResultados();
        */
        
        //MULTIPLICACION
        //Secuencial
        inicio = System.currentTimeMillis();
        MatrixMulti matrixMulti = new MatrixMulti(matrix.getMatrixA(), matrix.getMatrixB());
        System.out.println("Tiempo transcurrido de secuencial en ms:" + (System.currentTimeMillis() - inicio));
        matrixMulti.getResultados();
        
        //Concurrencia
        MatrixMultiForkJoin forkMulti = new MatrixMultiForkJoin();
        inicio = System.currentTimeMillis();
        forkMulti.matrixMulti(matrix.getMatrixA(), matrix.getMatrixB());
        System.err.println("Tiempo transcurrido de concurrencia en ms:" + (System.currentTimeMillis() - inicio));
        forkMulti.getResultados();
    }

}
