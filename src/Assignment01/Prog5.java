package Assignment_1;

import java.util.*;

public class Prog5 {
    public static void main (String[]args){
        int[] arraya = {5, 6, -4, 3, 1};
        int[] arrayb = {3, 8, 9, 11};
        System.out.println(Arrays.toString(combine(arraya, arrayb)));
    }

    public static int[] combine(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i;
        int j;
        for (i = 0; i < a.length; i++) {
            result[i] = a[i];
        }
        for (j = 0; j < b.length; j++) {
            result[i] = b[j];
            i++;
        }
        return result;
    }
}