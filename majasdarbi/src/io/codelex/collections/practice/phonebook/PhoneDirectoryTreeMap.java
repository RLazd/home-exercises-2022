package io.codelex.collections.practice.phonebook;

import java.util.TreeMap;

public class PhoneDirectoryTreeMap {
    private TreeMap<String, String> data = new TreeMap<>();

    public void putNewPhoneEntry(PhoneEntry phoneEntry) {
        this.data.put(phoneEntry.name, phoneEntry.number);
    }

    public String getNumber(String name) {
        return data.get(name);
    }

    public void putNumber(String name, String number) {

        if (name == null || number == null) {
            throw new IllegalArgumentException("name and number cannot be null");
        } else if (!name.equals("") && !number.equals("")) {
            data.put(name, number);
        }

    }

    public TreeMap<String, String> getData() {
        return data;
    }
}
