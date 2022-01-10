package com.solved.yuk.etc.bronze;

import java.io.*;
import java.math.BigInteger;

public class Bronze_16428 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        BigInteger A = new BigInteger(input[0]),
                   B = new BigInteger(input[1]),
                   div = A.divide(B), rest = A.remainder(B);
        if(A.compareTo(BigInteger.ZERO) == -1  && !A.equals(BigInteger.ZERO) && B.compareTo(BigInteger.ZERO) == 1){
            div = div.subtract(BigInteger.ONE);
            rest = A.subtract(B.multiply(div));
        }else if(A.compareTo(BigInteger.ZERO) == -1  && !A.equals(BigInteger.ZERO) && B.compareTo(BigInteger.ZERO) == -1){
            div = div.add(BigInteger.ONE);
            rest = A.subtract(B.multiply(div));
        }
        bw.write(div+"\n"+rest);
        bw.flush();
        bw.close();
    }
}
