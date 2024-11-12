package services;

import java.util.Stack;

public class DailyTemperatures {

//    static {
//        // Calling dailyTemperatures with an array of zeros multiple times (500 times)
//        for(int i = 0; i < 500; i++) {
//            dailyTemperatures(new int[]{0, 0});
//        }
//    }

    public static int[] dailyTemperatures(int[] temperatures) {

        int[] res = new int[temperatures.length];

        for(int i =0; i<temperatures.length; i++){

            for(int j=0; j<temperatures.length; j++){

                if((temperatures[i]<temperatures[j]) && j>i){
                    res[i] = j-i;
                    break;
                }
            }

        }

        return res;
    }

    public int[] dailyTemperatures2(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int[] answer = new int[temperatures.length];
        for(int i = 0;i < temperatures.length;i++)
        {
            while(!st.isEmpty() && temperatures[st.peek()] < temperatures[i])
            {
                int top = st.pop();
                answer[top] = i - top;
            }
            st.push(i);
        }
        return answer;
    }
}
