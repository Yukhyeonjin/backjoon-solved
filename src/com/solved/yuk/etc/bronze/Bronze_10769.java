package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_10769 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int happy = 0, sad = 0;
        if(input.length() < 3) bw.write("none");
        else {
            for(int i = 0; i <input.length()-2; i ++){
                String str = input.substring(i, i + 3);
                if(":-)".equals(str)) {
                    happy++;
                }
                else if(":-(".equals(str)){
                    sad++;
                }
            }
            if(happy == 0 && sad == 0) bw.write("none");
            else bw.write(happy == sad ? "unsure" : happy > sad ? "happy" : "sad");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
