package services;

public class KokoEatingBananas {

    //875

    public static int minEatingSpeed(int[] piles, int h) {

        int l=1, r=1000000000+1;

        while(l<r){

            int mid = l + (r-l)/2;
            if(canEat(piles, mid, h)) r = mid-1;
            else l = mid+1;
        }

        return l;
    }

    public static boolean canEat(int piles[], int mid, int h){

        int hours=0;
        for(int pile:piles){
            int div = pile / mid;
            hours += div;
            if(pile % mid > 0) hours++;
        }
        return hours<=h;
    }
}
