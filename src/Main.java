import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность массива n на n: ");
        int n = scanner.nextInt();
        int [][] mass= new int[n][n];
        for (int i = 0; i < mass.length; i++){
            for (int j = 0; j < mass[i].length; j++){
                mass[i][j] = random.nextInt(51);
            }
            System.out.println(Arrays.toString(mass[i]));
        }
        System.out.println();

        //Задание 1
        int sum = 0;
        for (int i = 0; i < mass.length; i++){
            if (mass[i][i]%2==0) {
                sum += mass[i][i];
            }
        }
        System.out.println("Сумма чётных элементов: " + sum);

        //Задание 2
        for (int i = 0; i < mass.length; i++){
            for (int j = 0; j <= i; j++){
                if (mass[i][j]%2 == 1){
                    System.out.print(mass[i][j] + " ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        //Задание 3
        int p1 = 1;
        int p2 = 1;
        for (int i = 0; i<mass.length; i++){
            p1 *= mass[i][i];
            p2 *= mass[i][(n-1)-i];
        }
        System.out.println("Произведение элементов главной диагонали: " + p1);
        System.out.println("Произведение элементов побочной диагонали: " + p2);
        if(p1 > p2){
            System.out.println("Произведение элементов главной диагонали больше произведения побочной.");
        }else if (p2>p1){
            System.out.println("Произведение элементов побочной диагонали больше произведения главной.");
        }else {
            System.out.println("Произведения элементов обеих диагоналей равны.");
        }

        //Задание 4
        int sum2 = 0;
        for (int i = 0; i < mass.length; i++){
            for (int j = 0; j < mass.length - (i+1); j++){
                sum2 += mass[i][j];
            }

        }
        System.out.println("Сумма элементов над побочной диагональю: " + sum2);

        //Задание 5
        int[][] massT = new int[n][n];
        for (int i = 0; i < massT.length; i++){
            for (int j = 0; j < massT[i].length; j++){
                massT[i][j]=mass[j][i];
            }
            System.out.println(Arrays.toString(massT[i]));
        }

    }
}
