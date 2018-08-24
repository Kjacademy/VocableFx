package service.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Meanings {
    private Map<PartsOfSpeech, List<String>> meaningsMap = new HashMap<>();

    public void addMeaning(PartsOfSpeech partsOfSpeech, String meaning) {
        if(meaningsMap.containsKey(partsOfSpeech)) {
            meaningsMap.get(partsOfSpeech).add(meaning);
        } else {
            meaningsMap.put(partsOfSpeech, createListByMeaning(meaning));
        }
    }

    private List<String> createListByMeaning(String meaning) {
        ArrayList<String> meaningsList = new ArrayList<>();
        meaningsList.add(meaning);
        return meaningsList;
    }
}
