package services;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TwitterTest {

    @Test
    public void testTwitter(){

        Twitter twitter = new Twitter();

        twitter.postTweet(1, 5); // User 1 posts a new tweet (id = 5).
        List<Integer> res = new ArrayList<>();
        res = twitter.getNewsFeed(1);  // User 1's news feed should return a list with 1 tweet id -> [5]. return [5]
        for(int i=0; i< res.size();i++){
            System.out.println(res.get(i));
        }
        twitter.follow(1, 2);    // User 1 follows user 2.
        twitter.follow(3, 2);
        twitter.follow(4, 2);
        twitter.postTweet(1, 9);
        twitter.postTweet(2, 6); // User 2 posts a new tweet (id = 6).
        res = twitter.getNewsFeed(1);  // User 1's news feed should return a list with 2 tweet ids -> [6, 5]. Tweet id 6 should precede tweet id 5 because it is posted after tweet id 5.
        for(int i=0; i< res.size();i++){
            System.out.println(res.get(i));
        }
        twitter.unfollow(1, 2);  // User 1 unfollows user 2.
        twitter.unfollow(3, 2);
        res = twitter.getNewsFeed(1);
        for(int i=0; i< res.size();i++){
            System.out.println(res.get(i));
        }
    }
}
