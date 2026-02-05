package com.mystring;

public class MyString {
    private String value;

    public MyString(String value) {
        this.value = value;
    }

    public int length() {
        return value.length();
    }

    public void print() {
        System.out.println("MyString value: " + value);
    }
}
