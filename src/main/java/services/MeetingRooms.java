package services;

import models.Interval;

import java.util.Comparator;
import java.util.List;

public class MeetingRooms {

    //252

    //brute
    public boolean canAttendMeetings(List<Interval> intervals) {

        int n = intervals.size();
        for (int i = 0; i < n; i++) {
            Interval A = intervals.get(i);
            for (int j = i + 1; j < n; j++) {
                Interval B = intervals.get(j);
                if (Math.min(A.end, B.end) > Math.max(A.start, B.start)) {
                    return false;
                }
            }
        }
        return true;
    }

    //sorting
    public boolean canAttendMeetings2(List<Interval> intervals){

        intervals.sort(Comparator.comparingInt(i -> i.start));

        for(int i=1; i< intervals.size(); i++){
            Interval A = intervals.get(i-1);
            Interval B = intervals.get(i);
            if(A.end > B.start){
                return false;
            }
        }

        return true;
    }
}
