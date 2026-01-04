// ...existing code...
// [
//     {
//         "type": "command",
//         "details": {
//             "key": "java.debug.runJavaFile"
//         }
//     }
// ]
package Array_with_java;

import java.util.Scanner;

public class Rotate90Deg_ArrayMatrix {
    static void printArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // transpose for rectangular matrices (returns new matrix)
    static int[][] transposeOfMatrix(int[][] matrix, int R, int C) {
        int[][] trans = new int[C][R];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                trans[j][i] = matrix[i][j];
            }
        }
        return trans;
    }

    // in-place transpose for square matrix
    static void transposeInPlace(int[][] matrix, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    static void reverseArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    // returns rotated matrix (90 deg clockwise)
    static int[][] Rotatematrix(int[][] matrix, int R, int C) {
        if (R != C) {
            // rectangular: transpose into new matrix then reverse each row
            int[][] trans = transposeOfMatrix(matrix, R, C);
            for (int i = 0; i < trans.length; i++) {
                reverseArray(trans[i]);
            }
            return trans;
        }
        // square: transpose in-place then reverse rows
        transposeInPlace(matrix, R);
        for (int i = 0; i < R; i++) {
            reverseArray(matrix[i]);
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rowes and column of matrix Array:");
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] matrix = new int[R][C];
        System.out.println("enter matrix value");
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                matrix[i][j] = sc.nextInt();
            }

        }

        System.out.println("original matrix");
        printArray(matrix);
        System.out.println("rotate matrix by 90 degrees clockwise");
        int[][] rotated = Rotatematrix(matrix, R, C);
        printArray(rotated);
    }
}
// ...existing code...