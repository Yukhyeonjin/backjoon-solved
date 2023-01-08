package com.solved.yuk.etc.silver;

import java.io.*;

public class Silver_1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long S = Long.parseLong(br.readLine());
        long sum = 0;
        int count = 0;

        /*
        * 1부터 차례대로 숫자를 더해 S보다 큰 값을 찾고
        * 그 후에 count에 -1한 값을 출력한다.
        * */
        for(int i = 1; ; i ++){
            if(sum > S) break;
            sum += i;
            count++;
        }
        bw.write(count-1+"");

        bw.flush();
        br.close();
        bw.close();
    }
}
