package lesson4;

import static java.lang.System.*;

public class Task1 {
    public static void main(String[] args) {

        int [] massiv = {10, 20, 30, 40, 60, 33, 500};

        int [] massiv2 = {20, 700, 50, 100, 500, 40};

        for(int i = 0; i < massiv.length; i++){
           for(int j = 0; j < massiv2.length;j++){
               if(massiv2[j]==massiv[i]){
                   out.println(massiv2[j]);
               }
           }
        }
    }
}
