package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_21638 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int t1 = Integer.parseInt(input[0]);
        int v1 = Integer.parseInt(input[1]);

        input = br.readLine().split(" ");
        int t2 = Integer.parseInt(input[0]);
        int v2 = Integer.parseInt(input[1]);

        if(t2 < 0 && v2 >= 10) {
            bw.write("A storm warning for tomorrow! Be careful and stay home if possible!");
        }
        else if(t1 > t2) {
            bw.write("MCHS warns! Low temperature is expected tomorrow.");
        }
        else if(v1 < v2) {
            bw.write("MCHS warns! Strong wind is expected tomorrow.");
        }
        else {
            bw.write("No message");
        }


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

