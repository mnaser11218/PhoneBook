package com.zipcodewilmington.phonebook;

import java.security.KeyStore;
import java.util.*;
//import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {

    private Map<String, List<String>> phonebook = new LinkedHashMap<>();

    public PhoneBook(Map<String, List<String>> map) {
        this.phonebook = map;
    }

    public PhoneBook() {
        this.phonebook = phonebook;
    }

    public void add(String name, String phoneNumber) {
      //  ArrayList[]phoneNum = new ArrayList[1];
        phonebook.put(name, Collections.singletonList(phoneNumber));
    }

    public void addAll(String name, String... phoneNumbers) {
        phonebook.put(name, Arrays.asList(phoneNumbers));


    }

    public void remove(String name) {
        this.phonebook.remove(name);
    }

    public Boolean hasEntry(String name) {

        return phonebook.containsKey(name);
    }

    public List<String> lookup(String name) {

        return phonebook.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        String results = null;
        for(Map.Entry<String, List<String>> entry: this.phonebook.entrySet()) {
            if(entry.getValue().contains(phoneNumber)) {
                results = entry.getKey();
            }
        }
        return results;
    }

    public List<String> getAllContactNames() {

   String[]results = phonebook.keySet().toArray(new String[0]);
   return List.of(results);
    }

    public Map<String, List<String>> getMap() {

        return phonebook;
    }
}
