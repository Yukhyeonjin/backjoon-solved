package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_1350 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] file = br.readLine().split(" ");
        long clusterSize = Long.parseLong(br.readLine());
        long sum = 0;
        for(int i = 0; i < N; i ++){
            long fileSize = Long.parseLong(file[i]);
            if(fileSize == 0) continue;
            else if(fileSize <= clusterSize) sum += clusterSize;
            else {
                long div = fileSize/clusterSize;
                if(clusterSize*div == fileSize) sum += (div*clusterSize);
                else sum += ((div+1)*clusterSize);
            }
        }
        bw.write(sum + "");

        bw.flush();
        bw.close();
    }
}
