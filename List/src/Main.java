
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(88);
        list.remove(1);
        list.remove(1);
        list.set(0, 88);
        System.out.println("LIST : " + list.toString());
        System.out.println("Size : " + list.size());
        System.out.println("Capacity : " + list.getCapacity());
        int index = 13;
        System.out.println(index + ".index : " + list.get(index));
        int value = 88;
        System.out.println(value + " > index : " + list.indexOf(value));
        System.out.println(value + " > last index : " + list.lastIndexOf(value));
        System.out.println("Array is empty : " + list.isEmpty());
        System.out.println("(toArray()) New Array : " + Arrays.toString(list.toArray()));
        list.clear();
        System.out.println("LIST : " + list.toString());
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println("LIST : " + list.toString());

        MyList<Integer> sublist = list.sublist(0, 3);
        System.out.println("Sublist : " + sublist.toString());

        int data = 10;
        System.out.println("Is it on the " + data + " list ? >> " + list.contains(data));
        data = 77;
        System.out.println("Is it on the " + data + " list ? >> " + list.contains(data));

    }
}
