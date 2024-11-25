package services;

import org.junit.jupiter.api.Test;

public class MeetingRoomsIITest {

    @Test
    public void testMeetingRoomsII(){

        System.out.println(new MeetingRoomsII().minMeetingRooms(new Interval().createIntervalsList(new int[][]{{0,30},{5,10},{15,20}})));
        System.out.println(new MeetingRoomsII().minMeetingRooms(new Interval().createIntervalsList(new int[][]{{5,8},{9,15}})));
        System.out.println(new MeetingRoomsII().minMeetingRooms(new Interval().createIntervalsList(new int[][]{{2,3},{1,5},{3,4}})));

    }
}
