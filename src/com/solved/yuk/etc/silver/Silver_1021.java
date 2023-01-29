package com.solved.yuk.etc.silver;

import java.io.*;
import java.util.LinkedList;

public class Silver_1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]),
            M = Integer.parseInt(input[1]),
            count = 0;
        input = br.readLine().split(" ");
        // 큐 선언
        LinkedList<Integer> deque = new LinkedList<Integer>();
        for(int i = 1; i <= N; i ++){
            deque.add(i);
        }
        for(int i = 0; i < M; i ++){
            int index = Integer.parseInt(input[i]);
            count += count(deque, index);
        }
        bw.write(count+"");



        bw.flush();
        br.close();
        bw.close();
    }

    /*
    * 찾고자 하는 위치가 큐의 왼쪽과 가까운지 오른쪽과 가까운지 판단을 한 후
    * 한 수씩 차례로 오른쪽 또는 왼쪽으로 밀고
    * 해당 값이 첫번째 위치에 위치하는 순간 poll을 활용하여 큐에서 제거 및 이동한 만큼의 수를 return
    * */
    public static int count(LinkedList<Integer> queue, int index){
        int count= 0;
        while (true){
            if(queue.peekFirst() == index) {
                queue.poll();
                break;
            }
            else {
                if(queue.indexOf(index) > queue.size()/2) {
                    queue.addFirst(queue.removeLast());
                    count++;
                }
                else {
                    queue.addLast(queue.removeFirst());
                    count++;
                }
            }
        }
        return count;
    }
}
