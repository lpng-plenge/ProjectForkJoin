# ProjectForkJoin
 Proyecto de Computacion Paralela Ceti
1.- El problema propuesto fue la multiplicacion y suma de matrices cuadradas, la cual fue una buena idea ya que en algunos sitios web estan limitados a matrices de 100x100.
2.- Durante la ejecucion de nuestro programa se necesita seleccionar las casillas del tipo de operacion a realizar (pueden ser ambas simultaneamente), se coloca el tamaño de la matriz no menor a 1 y no mayor a 5 mil. Finalmente el metodo ya sea secuencial o, concurrente o ambos.
Considero que si son matrices menores de mil se utilice el secuencial, caso contrario usar concurrencia.
Ademas, se ha visto que un tamaño de matriz A y B de 10 mil, no logra resolverse o mostrarse adecuadamente en mi equipo. Esto se debe a que esta programado secuncialmente la impresion de datos. Una solucion, se puede usar el algoritmo de suma de matrices para la impresion de datos para cada area de texto (son los resultado y valores de las matrices).
NOTA: Los valores de las matrices se generan a base del tamaño de las matrices;

Ejemplo: n=3 
Donde comienza n=0
A [n][n] 	B [n+1][n+1]

  [0,1,2]	  [1,2,3]
A=[0,1,2]	B=[1,2,3]
  [0,1,2]	  [1,2,3]

3.-Algoritmos concurrentes.
En ambas opreciones estaremos usando el framework de FORK/JOIN para dividir tareas.
En la multiplicacion de matrices no es es complejo su algoritmo, aunque se utlizo dos clases para hacer recursividad. Se implemento estas dos clases recursivas para acceder n veces mas a las las posiciones de columnas y filas de matriz A y B. Para el primer compute sera para dividir las filas de arriba y abajo de y el segundo compute sera para las columnas izquierda y derecha.
Para la suma de matrices se intento usar el mismo algoritmo de la multiplicacion, sin embargo no fue eficiente para conseguir el menor tiempo. Sin embargo, a base del primer compute de la multiplicacion y un limite o THRESHOLD de valor de 10, se hizo este algoritmo. Este threshold o limite se establece una validacion para poder dividir las filas de las matrices, dando un poco mas de rendimiento a la operacion. (En la suma se considera realizar mas pruebas).
4.- Algoritmos secuenciales.
Para ambos casos de las operaciones de suma y multiplicacion, estos se operan dentro del hilo del Jframe, donde solo creamos y pasamos los valores de las matrices A Y B. Estos se calculan de acuerdo a la formula algebraica de las matrices.



