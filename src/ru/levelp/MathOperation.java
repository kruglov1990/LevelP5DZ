package ru.levelp;

/**
 * Created by Андрей on 07.06.2016.
 */
public class MathOperation {
/*
    public int min(int a , int b){
       if (a < b){
           return a;
       }
        else{
           return b;
       }
    }


    public int max(int x, int y, int z){
        int max = x;
        if (y>max){
            max = y;
        }
        if(z>max){
            max = z;
        }
        return max;
    }
  */
/*
    public int sum(int[] massiv){
        int sum = 0;
        for (int i = 0; i < massiv.length; i++){
            sum = sum + massiv[i];
        }
        return sum;
    }
*/
    public int arv(int[] massiv2){
        int sum = 0;
        for (int i = 0; i < massiv2.length; i++){
            sum = sum + massiv2[i];
        }
        return sum/massiv2.length;
    }

}
