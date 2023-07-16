package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_28295 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String arr[] = {"N","E","S","W"};
        int index = 0, t;
        for(int i = 0; i < 10; i ++){
            t = Integer.parseInt(br.readLine());
            if(t == 1) {
                index++;
            }
            else if(t == 2) {
                index+=2;
            }
            else if(t == 3) {
                index--;
            }

            if(index > 3) index-=4;
            else if(index < 0) index+=4;
        }
        bw.write(arr[index]);

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
