package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_30676 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int star = Integer.parseInt(br.readLine());
        if(star >= 620 && star <= 780) bw.write("Red");
        else if(star >= 590 && star <= 620) bw.write("Orange");
        else if(star >= 570 && star <= 590) bw.write("Yellow");
        else if(star >= 495 && star <= 570) bw.write("Green");
        else if(star >= 450 && star <= 495) bw.write("Blue");
        else if(star >= 425 && star <= 450) bw.write("Indigo");
        else if(star >= 380 && star <= 425) bw.write("Violet");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
