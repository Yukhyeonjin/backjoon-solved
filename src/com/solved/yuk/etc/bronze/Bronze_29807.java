package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_29807 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()), score[] = new int[5];
        String input[] = br.readLine().split(" ");
        for(int i = 0; i < T; i ++){
            score[i] = Integer.parseInt(input[i]);
        }
        for(int i = T; i < 5; i ++){
            score[i] = 0;
        }
        int sum = 0, x = 0, y = 0, z = 0;

        if(score[0] > score[2]) x = (score[0]-score[2])*508;
        else x = (score[2]-score[0])*108;

        if(score[1] > score[3]) y = (score[1]-score[3])*212;
        else y = (score[3]-score[1])*305;

        if(score[4]> 0) z = (score[4]*707);

        sum = (x+y+z)*4763;

        bw.write(sum+"");



        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

