package services;

public class GasStationGreedy {

    //134
    public int canCompleteCircuit(int[] gas, int[] cost) {


        int n = gas.length;

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += gas[i] - cost[i];
        }
        if (sum < 0)
            return -1;

        int tank = 0;
        int station = 0;
        for (int i = 0; i < n; i++) {
            tank += gas[i] - cost[i];
            if (tank < 0) {
                station = i + 1;
                tank = 0;
            }
        }

        return station;
    }

}
