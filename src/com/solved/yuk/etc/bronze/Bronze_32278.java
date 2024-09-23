package com.solved.yuk.etc.bronze;

import java.io.*;
import java.math.BigDecimal;

public class Bronze_32278 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BigDecimal N = new BigDecimal(br.readLine());
        BigDecimal minShort = new BigDecimal("-32768"),
                   maxShort = new BigDecimal("32767"),
                   minInt = new BigDecimal("-2147483648"),
                   maxInt = new BigDecimal("2147483647"),
                   minLong = new BigDecimal("-9223372036854775808"),
                   maxLong = new BigDecimal("9223372036854775807");
        if(N.compareTo(minShort) >= 0 && N.compareTo(maxShort) <= 0) {
            bw.write("short");
        }
        else if(N.compareTo(minInt) >= 0 && N.compareTo(maxInt) <= 0) {
            bw.write("int");
        }
        else {
            bw.write("long long");
        }

        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}