package Lecture_22;

import java.util.*;

public class Interleave2Halves {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        
        Queue<Integer> q1 = new LinkedList<>();

        int length = q.size();

        for (int i = 0; i < length / 2; i++) {
            q1.add(q.remove());
        }

        for (int i = 0; i < length / 2; i++) {
            q.add(q1.remove());
            q.add(q.remove());
        }

        System.out.println(q);
    }
}
