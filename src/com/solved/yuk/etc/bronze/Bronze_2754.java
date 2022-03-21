package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2754 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String Grade = br.readLine();
        if("F".equals(Grade))bw.write("0.0");
        else{
            String alphabet = Grade.split("")[0],
                   cal = Grade.split("")[1];
            double avg = 0.0;
            if("A".equals(alphabet)) avg = 4.0;
            else if("B".equals(alphabet)) avg = 3.0;
            else if("C".equals(alphabet)) avg = 2.0;
            else if("D".equals(alphabet)) avg = 1.0;

            if("+".equals(cal)) avg+=0.3;
            else if("-".equals(cal)) avg-=0.3;

            bw.write(avg+"");
        }

        bw.flush();
        bw.close();
    }
}
