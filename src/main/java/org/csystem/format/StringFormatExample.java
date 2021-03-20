package org.csystem.format;

public class StringFormatExample {

    public static void main(String[] args) {
        Person person =  new Person("Burak", 1);
        System.out.println(person.toString());
    }
}


class Person {
    private String name;
    private int no;

    Person (String name, int no)
    {
        this.name = name;
        this.no = no;
    }

    public String toString ()
    {
        return String.format("[%d]%s", no, name);
    }
}
