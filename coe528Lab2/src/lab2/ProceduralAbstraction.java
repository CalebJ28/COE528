/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;

//Requires : None
//Modifies  : None
//Effects : Returns the smallest positive integer n for which n!
public class ProceduralAbstraction {

    public static int reverseFactorial(int x) {

        int n = 0;

        if (x <= 1) {
            return 1;
        }

        for (n = 1; x > n; n++) {

            x = x / n;

        }

        return n;
    }

//Requires : None
//Modifies  : None
//Effects : If the matrix arr satisfies Nice property, prints the sum and returns true. Otherwise returns false.
    public static boolean isMatrixNice(int[][] arr) {

        int rows = arr.length;
        int col = 0;
        int i;
        int sumDiag1 = 0;
        int sumDiag2 = 0;
        int sumRow = 0;
        int sumCol = 0;
        int totalSum = 0;

        System.out.println("This is the inputed array :");
        for (i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("\n");
        }

        for (i = 0; i < rows; i++) {
            if (arr[i].length == rows) {
                col = arr[i].length;
            } else {
                System.out.println("Not a square matrix");
                return false;
            }
        }

        if (rows == col) {
            for (i = 0; i < rows; i++) {
                for (int j = 0; j < col; j++) {
                    if (i == j) {
                        sumDiag1 += arr[i][j];
                        sumDiag2 += arr[i][col - j - 1];
                    }
                }
            }
        }
        if (sumDiag1 != sumDiag2) {
            System.out.println("Diagonals are not equal");
            return false;
        }

        for (i = 0; i < col; i++) {
            sumCol = 0;
            for (int j = 0; j < rows; j++) {
                sumCol += arr[j][i];
            }
            if (sumCol != sumDiag1) {
                System.out.println("Sum of columns do not equal sum of diagnols");
                return false;
            }
        }

        for (i = 0; i < rows; i++) {
            sumRow = 0;
            for (int j = 0; j < col; j++) {
                sumRow += arr[i][j];
            }
            if (sumRow != sumDiag1) {
                System.out.println("Sum of rows do not equal sum of diagnols");
                return false;
            }
        }

        for (i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                totalSum = totalSum + arr[i][j];
            }
        }

        System.out.println("The sum of the array is: " + totalSum);
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter an integer number: ");
        int num = in.nextInt();
        
        System.out.println("Reverse factorial of the number is: " + reverseFactorial(num) + "\n");

        int[][] arr1 = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        int[][] arr2 = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        int[][] arr3 = {{1, 1}, {1, 1, 1}, {1, 1, 1}};
        int[][] arr4 = {{1, 1, 1}, {1, 1, 1}};
        int[][] arr5 = {{1, 2, 1}, {1, 2, 1}, {1, 2, 1}};
        int[][] arr6 = {{1, 1, 1}, {1, 1, 1}, {1, 1, 2}};

        isMatrixNice(arr1);
        isMatrixNice(arr2);
        isMatrixNice(arr3);
        isMatrixNice(arr4);
        isMatrixNice(arr5);
        isMatrixNice(arr6);
    }
}
