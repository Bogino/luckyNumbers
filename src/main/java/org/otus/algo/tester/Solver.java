package org.otus.algo.tester;

public class Solver {

    private static int count;

    public static int solve(int N){
        internalSolve(N, 0,0);
        return count;
    }

    public static void internalSolve(int remainingN, int sumA, int sumB) {

        if(remainingN == 0){
            if(sumA == sumB){
                count++;
            }
            return;
        }

        for (int a = 0; a <= 9; a++){
            for(int b = 0; b <= 9; b++){
                internalSolve(remainingN - 1,sumA + a,sumB + b);
            }
        }
    }
}
