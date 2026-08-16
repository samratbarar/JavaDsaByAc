package Lecture_19;

import java.util.*;

public class JobSequencing {
    static class Job {
        int deadline;
        int profit;
        int id;

        public Job(int i, int d, int p) {
            id = i;
            deadline = d;
            profit = p;
        }
    }
    public static void main(String[] args) {
        int[][] jobsInfo = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        Collections.sort(jobs, (obj1, obj2) -> obj2.profit-obj1.profit);

        int time = 0;
        int maxProfit = 0;
        ArrayList<Integer> seq = new ArrayList<>();

        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);

            if (curr.deadline > time) {
                seq.add(curr.id);
                maxProfit += curr.profit;
                time++;
            }
        }

        System.out.println("Max Jobs = " + seq.size());
        System.out.println("Max profit = " + maxProfit);
        System.out.println(seq);
    }
}
