package com.solved.yuk.class2.silver;

import java.io.*;

public class Silver_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class2
        String[] input = br.readLine().split(" ");
        int M = Integer.parseInt(input[0]),
                N = Integer.parseInt(input[1]);
//        Set<Integer> unPrimeSet = makeUnPrimeSet(N);
        boolean[] primeArr = makePrimeArr(N);
        for(int i = M; i <= N; i ++){
            if(!primeArr[i])bw.write(i + "\n");
        }

        bw.flush();
        bw.close();
    }
    public static boolean[] makePrimeArr(int N){
        boolean[] primeArr = new boolean[N+1];
        primeArr[0] = primeArr[1] = true;
        for(int i = 2; i <= Math.sqrt(N); i ++){
            if(primeArr[i]) continue;
            for(int j = i*i; j <= N; j += i){
                primeArr[j] = true;
            }
        }
        return primeArr;
    }
}