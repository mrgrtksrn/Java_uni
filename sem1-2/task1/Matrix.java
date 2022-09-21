import java.util.Random;

public class Matrix {

    double[][] m;
    int rows;
    int columns;


    public Matrix(int a, int b) {
        rows = a;
        columns = b;

        m = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                m[i][j] = 0;
            }
        }
        initiliser();
    }

    public Matrix(double[][] thisMatrix) {
        m = thisMatrix;
        rows = m.length;
        columns = m[0].length;
    }

    private void initiliser() {
        Random random = new Random();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = random.nextInt(100);
            }
        }
    }

    // Вывод матрицы
    public void getvalue() {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("%.2f  ", m[i][j]);
            }
            System.out.print("\n");
        }
    }


    //Умножение матрицы на число
    public Matrix NumberMulti(double number) {
        double[][] resultMatrix = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                double result = m[i][j] * number;
                resultMatrix[i][j] = result;
            }
        }
        return new Matrix(resultMatrix);
    }

    // Транспонированная матрица
    public Matrix Transpose() {
        double[][] resultMatrix = new double[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[j][i] = m[i][j];
            }
        }
        return new Matrix(resultMatrix);
    }

    // возведение матрицы в степень
    public Matrix exponent(int exp){
        double[][] resultMatrix = new double[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                double result = 1;
                int N = 1;
                while (N <= exp){
                    if (N == exp){
                        result = result * m[i][j];
                        resultMatrix[i][j] = result;
                        break;
                    } else{
                        result = result * m[i][j];
                        N ++;
                        continue;
                    }

                }

            }
        }
        return new Matrix(resultMatrix);

    }
}