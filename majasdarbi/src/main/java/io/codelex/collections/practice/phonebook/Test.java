package io.codelex.collections.practice.phonebook;

public class Test {
    public static void main(String[] args) {

        PhoneEntry phoneEntry1 = new PhoneEntry("Aa", "123");
        PhoneEntry phoneEntry2 = new PhoneEntry("Ba", "345");
        PhoneEntry phoneEntry3 = new PhoneEntry("Ca", "567");
        PhoneEntry phoneEntry4 = new PhoneEntry("Da", "567");

        PhoneDirectoryTreeMap directoryTree = new PhoneDirectoryTreeMap();
        directoryTree.putNewPhoneEntry(phoneEntry1);
        directoryTree.putNewPhoneEntry(phoneEntry2);
        directoryTree.putNewPhoneEntry(phoneEntry3);
        directoryTree.putNewPhoneEntry(phoneEntry4);

        System.out.println(directoryTree.getNumber("Aa"));
        System.out.println(directoryTree.getNumber("BB"));
        directoryTree.putNumber("BB", "123456");
        directoryTree.putNumber("BB", "New number for BB");
        directoryTree.putNumber("", "123456");

        System.out.println(directoryTree.getData());

        PhoneDirectory directoryArray = new PhoneDirectory();
        directoryArray.putNumber("Aa", "123");
        directoryArray.putNumber("Ba", "345");
        directoryArray.putNumber("Ca", "567");
        directoryArray.putNumber("Da", "567");

        directoryArray.getData();
        System.out.println(directoryArray.getDataCount());

        System.out.println(directoryArray.getNumber("Aa"));
        System.out.println(directoryArray.getNumber("AB"));

        directoryArray.putNumber("", "123456");

        directoryArray.getData();
        System.out.println(directoryArray.getDataCount());


    }
}
