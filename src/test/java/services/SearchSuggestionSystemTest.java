package services;

import org.junit.jupiter.api.Test;

import java.util.List;

public class SearchSuggestionSystemTest {

    @Test
    public void testSearchSuggestionSystem(){

        List<List<String>> res = new SearchSuggestionSystem().suggestedProducts(new String[]{"mobile","mouse","moneypot","monitor","mousepad"}, "mouse");

        for(List<String> ls:res){
            for(String s:ls){

                System.out.println(s);
            }
            System.out.println("-");
        }
    }

    @Test
    public void testSearchSuggestionSystem2(){

        List<List<String>> res = new SearchSuggestionSystem().suggestedProducts(new String[]{"havana"}, "tatiana");

        for(List<String> ls:res){
            for(String s:ls){

                System.out.println(s);
            }
            System.out.println("-");
        }
    }

}
