package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_3029 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String curTime = br.readLine(),
               natriumThrowingTime = br.readLine();
        if(curTime.equals(natriumThrowingTime)){
            bw.write("24:00:00");
        }else {
            int h = Integer.parseInt(natriumThrowingTime.split(":")[0]) - Integer.parseInt(curTime.split(":")[0]),
                m = Integer.parseInt(natriumThrowingTime.split(":")[1]) - Integer.parseInt(curTime.split(":")[1]),
                s = Integer.parseInt(natriumThrowingTime.split(":")[2]) - Integer.parseInt(curTime.split(":")[2]);

            if(s<0){
                s+=60;
                m--;
            }
            if(m<0){
                m+=60;
                h--;
            }
            if(h<0){
                h+=24;
            }
            bw.write(String.format("%02d:%02d:%02d",h,m,s));
        }




        bw.flush();
        bw.close();
    }
}
