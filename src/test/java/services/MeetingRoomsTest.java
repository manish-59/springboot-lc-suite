package services;

import org.junit.jupiter.api.Test;

public class MeetingRoomsTest {

    @Test
    public void testMeetingRooms(){

        //brute
        System.out.println(new MeetingRooms().canAttendMeetings(new Interval().createIntervalsList(new int[][]{{0,30},{5,10},{15,20}})));
        System.out.println(new MeetingRooms().canAttendMeetings(new Interval().createIntervalsList(new int[][]{{5,8},{9,15}})));
        System.out.println(new MeetingRooms().canAttendMeetings(new Interval().createIntervalsList(new int[][]{{2,3},{1,5},{3,4}})));

        System.out.println();

        //sort
        System.out.println(new MeetingRooms().canAttendMeetings2(new Interval().createIntervalsList(new int[][]{{0,30},{5,10},{15,20}})));
        System.out.println(new MeetingRooms().canAttendMeetings2(new Interval().createIntervalsList(new int[][]{{5,8},{9,15}})));
        System.out.println(new MeetingRooms().canAttendMeetings2(new Interval().createIntervalsList(new int[][]{{2,3},{1,5},{3,4}})));
    }
}
