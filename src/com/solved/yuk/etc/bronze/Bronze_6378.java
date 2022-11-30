package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_6378 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while(!"0".equals(input = br.readLine())){
            while(true) {
                //자릿수의 수들을 합쳐서 저장할 변수
                int sum = 0;

                //문자열 길이가 1이 되면 무한루프 종료
                if(input.length() < 2) {
                    break;
                }else {
                    for(int i = 0; i < input.length(); i++) {
                        sum += input.charAt(i) - '0';
                    }
                }
                //합을 문자열에 형변환해서 저장
                input = String.valueOf(sum);
            }
            bw.write(input+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
