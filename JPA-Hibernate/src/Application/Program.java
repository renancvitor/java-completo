package Application;

import Domain.People;

public class Program {

    public static void main(String[] args) {

        People p1 = new People(1, "Carl Red", "carl@gmail.com");
        People p2 = new People(2, "Joe White", "joe@gmail.com");
        People p3 = new People(3, "Anna Orange", "anna@gmail.com");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
