package lesson4;

import static java.lang.System.out;

public class Task2 {
    public static void main(String[] args) {

        int [] massiv = {10, 20, 30, 40, 60, 33, 500};

        //а) количество элементов
        out.println(massiv.length);

        //сумма элементов
        int summ = 0;
        for(int i = 0; i < massiv.length; i++){
            summ +=massiv[i];
        }
        out.println(summ);

        //максимальный элемент
        int max = massiv[0];
        for(int i = 0; i < massiv.length; i++){
            if(massiv[i] > max)
                max = massiv[i];
        }
        out.println(max);

        //манимальный элемент
        int min = massiv[0];
        for(int i = 0; i < massiv.length; i++){
            if(massiv[i] < min)
                min = massiv[i];
        }
        out.println(min);
    }
}
