package ru.spbstu.telematics.java;

public class App {
    public static void main( String[] args ){
        System.out.println("Hello, world!");
    }

    public static int det(int[][] matrix){
        int dim = matrix.length;
        int result = 0;

        if(dim == 1) return matrix[0][0];  

        for(int i = 0; i < dim; i++) {

            int subM[][] = new int[dim - 1][dim - 1];

            for(int j = 1; j < dim; j++){
                for(int k = 0;  k < dim; k++){
                    
                    if( k < i){
                        subM[j - 1][k] = matrix[j][k];
                    }
                    else if(k > i) {
                        subM[j - 1][k - 1] = matrix[j][k];
                    }
                }
            }
            int num = matrix[0][i];
            result += num * det(subM) * (int) Math.pow(-1.0,i);
        }
        return result;
    }
}
