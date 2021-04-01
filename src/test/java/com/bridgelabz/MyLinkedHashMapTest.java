package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyLinkedHashMapTest {
    @Test
    public void givenSentenceWhenWordsAreAddedToListShouldReturnParanoidFrequency()
    {

        String sentence = "Paranoids are not paranoid because they are paranoid but"
                + "because they keep putting themselves deliberately into"
                + "paranoid avoidable situations";
        MyLinkedHashMap<String, Integer> mylinkedHashMap = new MyLinkedHashMap<>();
        String[] words = sentence.toLowerCase().split(" ");

        for (String word : words)
        {
            Integer value = mylinkedHashMap.get(word);
            if (value == null)
                value = 1;
            else
                value = value + 1;
            mylinkedHashMap.add(word, value);
        }

        int frequency = mylinkedHashMap.get("paranoid");
        System.out.println(mylinkedHashMap);
        Assertions.assertEquals(2, frequency);
    }
}
