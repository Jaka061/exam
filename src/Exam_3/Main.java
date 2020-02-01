package Exam_3;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Roundable[] apple = new Apple[10];
        Roundable[] apple1 = new Apple[20];
        Roundable[] tBall = new TBall[50];
        Roundable[] tBall1 = new TBall[3];

        Cylindricalable cola = new Cola();
        Cylindricalable water = new Water();
        Flatable book = new Book ();
        Flatable folder = new Folder();

        LinkedList<Bag> bag1 = new LinkedList<Bag>();
        bag1.add(new Bag(book,cola,apple1));

        LinkedList<Bag> bag2 = new LinkedList<Bag>();
        bag1.add(new Bag(folder,water,tBall));

        LinkedList<Bag> bag3 = new LinkedList<Bag>();
        bag1.add(new Bag(folder,cola,apple,tBall1));
    }
}
