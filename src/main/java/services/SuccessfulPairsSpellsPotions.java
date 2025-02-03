package services;

import java.util.Arrays;

public class SuccessfulPairsSpellsPotions {

    //2300

    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n = spells.length;
        int m = potions.length;

        for (int i = 0; i < n; ++i) {
            int low = 0;
            int high = m - 1;

            while (low <= high) {
                int mid = low + (high - low) / 2;
                if ((long) spells[i] * potions[mid] >= success) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            spells[i] = m - low;
        }

        return spells;
    }
}
