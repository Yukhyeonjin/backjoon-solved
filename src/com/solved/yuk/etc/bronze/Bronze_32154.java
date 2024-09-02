package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_32154 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String output[] = {
            "11\nA B C D E F G H J L M"
           ,"9\nA C E F G H I L M"
           ,"9\nA C E F G H I L M"
           ,"9\nA B C E F G H L M"
           ,"8\nA C E F G H L M"
           ,"8\nA C E F G H L M"
           ,"8\nA C E F G H L M"
           ,"8\nA C E F G H L M"
           ,"8\nA C E F G H L M"
           ,"8\nA B C F G H L M"
        };
        bw.write(output[N-1]);


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}