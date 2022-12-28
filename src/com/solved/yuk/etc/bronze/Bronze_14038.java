package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_14038 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int wCount = 0, lCount = 0;
        for(int i = 0; i < 6; i ++){
            String input = br.readLine();
            if("W".equals(input)) wCount++;
            else if("L".equals(input)) lCount++;
        }
        int result = -1;
        if(wCount == 6 || wCount == 5) result = 1;
        else if(wCount == 4 || wCount == 3) result = 2;
        else if(wCount == 2 || wCount == 1) result = 3;
        bw.write(result+"");

        bw.flush();
        bw.close();
        br.close();
    }
}