package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bronze_15820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); //
        int sample_answer = Integer.parseInt(st.nextToken());
        int system_answer = Integer.parseInt(st.nextToken());
        int[] Answer = new int[sample_answer + system_answer];
        int[] MyAnswer = new int[sample_answer + system_answer];
        int sw = 0;
        //입력값 받기
        for (int i = 0; i < sample_answer + system_answer; i++) {
            StringTokenizer st0 = new StringTokenizer(br.readLine());
            Answer[i] = Integer.parseInt(st0.nextToken()); //정답
            MyAnswer[i] = Integer.parseInt(st0.nextToken()); //내 답
            if (i < sample_answer && Answer[i] != MyAnswer[i]) {
                System.out.println("Wrong Answer");
                sw = 1;
                break;
            } else if (i >= sample_answer && Answer[i] != MyAnswer[i]) {
                System.out.println("Why Wrong!!!");
                sw = 1;
                break;
            }
        }
        if (sw == 0) {
            System.out.println("Accepted");
        }

    }
}
