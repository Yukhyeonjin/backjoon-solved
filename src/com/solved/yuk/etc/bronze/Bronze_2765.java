package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2765 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i = 1;
        String[] input;
        while (true) {
            input = br.readLine().split(" ");
            double A = Double.parseDouble(input[0]),
                   B = Double.parseDouble(input[1]),
                   C = Double.parseDouble(input[2]);
            if(B == 0) break;

            C = (C / 60) / 60;
            //이동 거리를 밀리거리로 바꾸는 공식
            double distance = ((((A * 3.1415927) * B) / 12) / 5280);
            //MPH를 구하는 공식
            double MPH = (distance / C);
            bw.write("Trip #" + i + ": ");
            bw.write(String.format("%.2f", distance) + " ");
            bw.write(String.format("%.2f", MPH));
            //출력이 끝나고 다음 케이스 입력시에 줄바뀜을 준다.
            bw.newLine();
            i++;
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

