import java.util.Random;

public class TestHashTable {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, Integer> table = new MyHashTable<>(50);

        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            int id = random.nextInt(1000000);
            String name = "Name" + random.nextInt(1000000);
            MyTestingClass obj = new MyTestingClass(id, name);
            table.put(obj, i);
        }

        table.printBucketSizes();
    }
}
