package services;

import java.util.Arrays;

public class TaskScheduler {

    public int leastInterval(char[] tasks, int n) {

        int[] freq = new int[26];

        for(char task : tasks){
            freq[task - 'A']++;
        }

        Arrays.sort(freq);
        int spots = freq[25] - 1;
        int idleSpots = spots * n;

        for(int i = 24; i >= 0 ; i--){
            idleSpots -= Math.min(freq[i], spots);
        }

        if(idleSpots > 0){
            return tasks.length + idleSpots;
        }
        return tasks.length;
    }
}
