public class TwoMatrics {
    Matrix matrix1;
    Matrix matrix2;

    public TwoMatrics(Matrix obj1, Matrix obj2) {
        matrix1 = obj1;
        matrix2 = obj2;
    }

    public Matrix summ() {
            double[][] resultMatrix = new double[matrix1.rows][matrix1.columns];

            for (int i = 0; i < matrix1.rows; i++) {
                for (int j = 0; j < matrix1.columns; j++) {
                    double result = matrix1.m[i][j] + matrix2.m[i][j];
                    resultMatrix[i][j] = result;
                }
            }
            return new Matrix(resultMatrix);
    }

    public Matrix subtraction(){
        double[][] resultMatrix = new double[matrix1.rows][matrix1.columns];

        for (int i = 0; i < matrix1.rows; i++) {
            for (int j = 0; j < matrix1.columns; j++) {
                double result = matrix1.m[i][j] - matrix2.m[i][j];
                resultMatrix[i][j] = result;
            }
        }
        return new Matrix(resultMatrix);
    }

}
