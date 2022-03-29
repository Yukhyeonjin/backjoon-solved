package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String threeLenghDial = "ABCDEFGHIJKLMNOTUV", // 2 3 4 5 6 8
               fourLenghDial = "PQRSWXYZ", // 7 9
               input[] = br.readLine().split("");
        int sum = 0;
        for(int i = 0; i < input.length; i ++){
            int index, second;
            if(threeLenghDial.indexOf(input[i]) > -1) {
                index = threeLenghDial.indexOf(input[i]);
                second = (index / 3) == 5 ? 9 : (index / 3) + 3;
            }else {
                index = fourLenghDial.indexOf(input[i]);
                second = (index / 4) == 1 ? 10 : 8;
            }
            sum+=second;
        }
        bw.write(sum+"");

        bw.flush();
        bw.close();
    }
}
