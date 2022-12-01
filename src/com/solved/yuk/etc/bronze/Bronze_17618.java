package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_17618 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a;
        int mok = 0, ext;
        int sum = 0;
        int count = 0;
        a = Integer.parseInt(br.readLine());

        for(int i=1; i<=a; i++) {
            mok = i;
            sum = 0;
            while(true) {

                if(mok == 0)
                    break;
                ext = mok % 10;
                mok = mok / 10;

                sum = sum + ext;
            }

            if(i % sum == 0)
                count++;
        }
        bw.write(count+"");

        bw.flush();
        br.close();
        bw.close();
    }
}

