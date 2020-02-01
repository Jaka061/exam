import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Exam_1 {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i <=100 ; i++) {
            list.add(i);
        }

        LinkedHashSet<Integer> list1 = new LinkedHashSet<>();
        System.out.println(list);

        for (int i = 0; i <=100 ; i++) {
            if ( i % 5 == 0 && i % 2 ==0){
                list1.add(list.get(i));
            }
        }
        for (int i = 0; i <100 ; i++) {
            if( i % 2 ==0 )
            list1.add(list.get(i));
        }
        System.out.println(list1);
    }
}
