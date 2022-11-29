package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++){
            String input[] = br.readLine().split(" ");
            double number = Double.parseDouble(input[0]);
            if("kg".equals(input[1])){
                number *= 2.2046;
                input[1] = "lb";
            }
            else if("lb".equals(input[1])){
                number *= 0.4536;
                input[1] = "kg";
            }
            else if("l".equals(input[1])){
                number *= 0.2642;
                input[1] = "g";
            }
            else if("g".equals(input[1])){
                number *= 3.7854;
                input[1] = "l";
            }
            bw.write(String.format("%.4f",number)  + " " + input[1]+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
