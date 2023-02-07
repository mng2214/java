import java.util.HashMap;

public class test1 {
    public static void main(String[] args) {

        String[] fruits = {"Apple", "Banana", "Peach", "Apple", "Orange", "Strawberry", "Banana", "Apple", "Cherry", "Orange"};
        HashMap<String, Integer> map = new HashMap<>();

        for (String fruit : fruits) {
            map.put(fruit, !map.containsKey(fruit) ? 1 : map.get(fruit) + 1);
        }
        System.out.println(map);

    }
}
