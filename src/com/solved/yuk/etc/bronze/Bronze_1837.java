package com.solved.yuk.etc.bronze;

import java.io.*;
import java.math.BigInteger;

public class Bronze_1837 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        BigInteger P = new BigInteger(input[0]);
        int K = Integer.parseInt(input[1]);

        boolean[] primes = new boolean[K + 1];
        boolean flag = true;
        primes[1] = true;

        BigInteger now = null;
        for(int i = 2 ; i < K ; i++){
            if(primes[i]) continue; // 소수가 아닌(true) 수는 넘어가기
            now = new BigInteger(Integer.toString(i));
            if(P.mod(now).compareTo(BigInteger.ZERO) == 0) {    // p를 now로 나눈 나머지가 0이면
                flag = false;
                break;
            }
            for(int j = i + i ; j <= K ; j += i){ // i를 제외한 i의 배수 모두 체크하기
                primes[j] = true;
            }
        }
        if(flag) bw.write("GOOD");
        else bw.write("BAD " + now);

        bw.flush();
        br.close();
        bw.close();
    }
}
