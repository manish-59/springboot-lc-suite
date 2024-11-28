package services;

public class DistriMoneyChild {

    //2591
    public int distMoney(int money, int children) {
        int response = 0;
        if(money < children){
            return response - 1;
        }
        if(money > children * 8){
            return children - 1;
        }

        money -= children;
        while(money >= 7){
            money -= 7;
            if(money == 3 && response == children - 2) break;
            response++;

        }

        return response;
    }
}
