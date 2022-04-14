package com.solved.yuk.etc.bronze;

import java.io.*;
import java.math.BigInteger;

public class Bronze_2935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger a = new BigInteger(br.readLine());
        String cal = br.readLine();
        BigInteger b = new BigInteger(br.readLine());
        BigInteger result;
        if("+".equals(cal)){
            result = a.add(b);
        }else {
            result = a.multiply(b);
        }
        bw.write(result.toString());

        bw.flush();
        bw.close();
    }
}
