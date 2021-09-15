package com.company;

public class Tester {

    public void test() {
        Ball ball1 = new Ball(5, "Red");
        Ball ball2 = new Ball(7.3, "Blue");
        Ball ball3 = new Ball(10.1, "Green");
        System.out.println(ball1.toString());
        System.out.println(ball2.toString());
        System.out.println(ball3.toString());

        Book book1 = new Book(300, "War and Piece");
        Book book2 = new Book(190, "Harry Potter");
        Book book3 = new Book(480, "The Master and Margarita");
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
    }

}
