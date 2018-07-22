package com.JoraLenovo;
//home asignment 10, problem 1

public class SumArray {
    //trebuie un algoritm care sa imparta vectrul in 4 bucati
    public static void main(String[] args) {
        int[] source = {0,1,2,3,4,5,6,7,8,9};
        int subArraySize = source.length/4+1;


    }

}

//implementam runnable
class Adder implements Runnable{

    private int[] source;
    private int leftLimit;
    private int rightLimit;

    public Adder(int[] source, int leftLimit, int rightLimit){
        this.source = source;
        this.leftLimit = leftLimit;
        this.rightLimit = rightLimit
    }

    @Override
    public void run() {
        int result

    }
}