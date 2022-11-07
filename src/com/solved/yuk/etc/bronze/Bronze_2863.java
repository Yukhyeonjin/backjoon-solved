package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2863 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        double A = Double.parseDouble(input[0]),
               B = Double.parseDouble(input[1]);
        input = br.readLine().split(" ");
        double C = Double.parseDouble(input[0]),
               D = Double.parseDouble(input[1]);
        /*
        * A B  C A  D C  B D
        * C D  D B  B A  A C
        * */
        double turnZero  = A/C + B/D,
               turnOne   = C/D + A/B,
               turnTwo   = D/B + C/A,
               turnThree = B/A + D/C;
        if(turnZero >= turnOne && turnZero >= turnTwo && turnZero >= turnThree) bw.write("0");
        else if(turnOne >= turnZero && turnOne >= turnTwo && turnOne >= turnThree) bw.write("1");
        else if(turnTwo >= turnOne && turnTwo >= turnZero && turnTwo >= turnThree) bw.write("2");
        else if(turnThree >= turnOne && turnThree >= turnTwo && turnThree >= turnZero) bw.write("3");


        bw.flush();
        br.close();
        bw.close();
    }
}
