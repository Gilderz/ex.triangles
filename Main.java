//******Задача про базові графічні примітиви******//
package main;

public class Main {
    public static void main(String[] args) {
        int rows = 6; // к-сть рядків примітива

//******трикутник 1******//
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(". ");
            }
            System.out.println();
        }
        System.out.println();// розділюєм трикутники порожнім рядком 
//******трикутник 2******//
        for (int i = rows; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(". ");
            }
            System.out.println();
        }
        System.out.println();// розділюєм трикутники порожнім рядком 
//******трикутник 3******//
        int k = 0;
        for (int i = 6; i > 0; i--) {
            for (int j = 0; j < k; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(". ");
            }
            System.out.println();
            k++;
    }
        System.out.println();//розділюєм трикутники порожнім рядком
//******трикутник 4******//
        int k1 = rows-1;
        for (int i = 1; i < 7; i++) {
            for (int j = 0; j < k1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(". ");
            }
            System.out.println();
            k1--;
        }
        System.out.println();//розділюєм трикутники порожнім рядком
//******квадрат******//
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(". ");
            }
            System.out.println();
        }        
    	}
    }