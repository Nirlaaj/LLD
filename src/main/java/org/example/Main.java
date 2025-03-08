package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Manager m = new Manager();
        m.setBenfit("Multiple");
        Employee e = m;
        System.out.println(e);
        ((Manager) e).getBenfit();

    }
}