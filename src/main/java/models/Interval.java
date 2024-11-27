package models;

import java.util.ArrayList;
import java.util.List;

public class Interval {

    public int start, end;

    public Interval() {
        this.start = 0;
        this.end = 0;
    }

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public List<Interval> createIntervalsList(int[][] array){

        List<Interval> intervalsList = new ArrayList<>();
        for(int[] i:array){
            intervalsList.add(new Interval(i[0], i[1]));
        }

        return intervalsList;
    }
}
