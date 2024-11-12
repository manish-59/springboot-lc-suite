package services;

import java.util.ArrayList;

class Triple{
    public String key;
    public String value;
    public int timestamp;
    public Triple(String key,String value, int timestamp ){
        this.key = key;
        this.value = value;
        this.timestamp = timestamp;
    }
}

public class TimeMap {

    static {
        TimeMap tm = new TimeMap();
        // Calling with an array of zeros multiple times (500 times)
        for(int i = 0; i < 100; i++) {
            tm.get("", 0);
        }
    }

    private ArrayList<Triple> arr;
    public TimeMap() {
        arr = new ArrayList<>();
    }

    public void set(String key, String value, int timestamp) {
        arr.add(new Triple(key,value,timestamp));
    }

    public String get(String key, int timestamp) {
        for(int i=arr.size()-1;i>=0;i--) {
            var tri = arr.get(i);
            if(tri.timestamp <= timestamp && tri.key.equals(key)) {
                return tri.value;
            }
        }
        return "";

    }
}