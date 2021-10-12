package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        int[] dizi = {3,16,5,9,21,28,13,-1};

        //Selection sort

        for(int i=0; i<dizi.length; i++){
            int key = i;
            for (int j=i+1; j<dizi.length; j++){
                if (dizi[key]>dizi[j]){
                    key = j;
                }
                int temp = dizi[key];
                dizi[key]=dizi[j];
                dizi[i]=temp;
                System.out.println(dizi[i]);
            }

        }

    }
}
