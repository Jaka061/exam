import java.util.LinkedList;

public class Exam_2 {
    public static void main(String[] args) {

        LinkedList<Person> person = new LinkedList<>();
        for (int i = 0; i < 8; i++) {
            person.add(i, new Person("Tom", "Viktor", "Ivanovich"));

        }
    }
}
