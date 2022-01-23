package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_1362 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line , input[];
        int o,w, i = 1; boolean isDie = false;
        while (true){
            line = br.readLine();
            if(line.equals("0 0")) break;
            input = line.split(" ");
            o = Integer.parseInt(input[0]); // 적정 체중
            w = Integer.parseInt(input[1]); // 실제 체중
            isDie = false;
            while (true){
                line = br.readLine();
                if(line.equals("# 0")) break;
                else if (isDie) continue;
                input = line.split(" ");
                if(input[0].equals("F")) w += Integer.parseInt(input[1]);
                else w -= Integer.parseInt(input[1]);
                if(w <= 0) isDie = true;
            }
            bw.write(i+ " ");
            if(w > o/2 && w < 2*o) bw.write(":-)");
            else if(isDie) bw.write("RIP");
            else bw.write(":-(");
            bw.newLine();
            i++;
        }


        bw.flush();
        bw.close();
    }
}
