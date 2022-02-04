package com.solved.yuk.etc.silver;

import java.io.*;

public class Silver_1064 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        double leng[] = new double[3];
        // A좌표
        int Ax = Integer.parseInt(input[0]),
            Ay = Integer.parseInt(input[1]),
        // B좌표
            Bx = Integer.parseInt(input[2]),
            By = Integer.parseInt(input[3]),
        // C좌표
            Cx = Integer.parseInt(input[4]),
            Cy = Integer.parseInt(input[5]);
        // 3개의 좌표가 1개의 선분 위에 있으면 사각형을 만들 수 없다.
        if((By-Ay)*(Cx-Bx) == (Bx-Ax)*(Cy-By)) bw.write("-1");
        else {
            // A - B 변
            double AB = Math.sqrt(Math.pow(Ax - Bx, 2) + Math.pow(Ay - By, 2)),
                    // A - C 변
                    AC = Math.sqrt(Math.pow(Ax - Cx, 2) + Math.pow(Ay - Cy, 2)),
                    // B - C 변
                    BC = Math.sqrt(Math.pow(Bx - Cx, 2) + Math.pow(By - Cy, 2));

            leng[0] = AB + AC;
            leng[1] = AB + BC;
            leng[2] = AC + BC;
            double min = Double.MAX_VALUE,
                    max = Double.MIN_VALUE;
            for (int i = 0; i < 3; i++) {
                min = Math.min(min, leng[i]);
                max = Math.max(max, leng[i]);
            }
            bw.write(2 * max - 2 * min + "");
        }

        bw.flush();
        bw.close();
    }
}
