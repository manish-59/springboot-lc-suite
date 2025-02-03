package services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SearchSuggestionSystem {

    //1268

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {

        Trie productsTrie = new Trie();

        for(String product:products){
            productsTrie.insert(product);
        }

        List<List<String>> ans = new ArrayList<>();
        StringBuilder search = new StringBuilder();

        for (char c : searchWord.toCharArray()) {
            search.append(c);
            List<String> output = new ArrayList<>();
            StringBuilder temp = new StringBuilder();

            Trie prefix = productsTrie.getPrefixNode(search.toString());


            prefix.traverse(prefix, temp, output);
            List<String> updatedAns = new ArrayList<>();

            for(String s: output) {
                updatedAns.add((search.toString()+s));
            }
            List<String> top3 = updatedAns.stream()
                    .sorted() // Sort lexicographically
                    .limit(3) // Take the first 3
                    .collect(Collectors.toList());
            ans.add(top3);
        }

        return ans;
    }
}
