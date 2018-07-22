package com.JoraLenovo;

public class Main {

    public static void main(String[] args) {
        int[] vector = {2, 5, 8, 7, 4, 5, 5};

       for (int i=0; i<vector.length; i++) {
           System.out.println("valoarea de pe pozitia "+i+" este "+vector[i]);
       }
       try {
           System.out.println("si avem un vector cu o lungime de " + vector[8]);
       }
       catch(Exception e){
           System.out.println(e);
       }
    }
}
