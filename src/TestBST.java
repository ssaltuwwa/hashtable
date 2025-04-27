public class TestBST {
    public static void main(String[] args) {
        BST<Integer, String> tree = new BST<>();

        // Добавляем элементы
        tree.put(50, "Root");
        tree.put(30, "Left");
        tree.put(70, "Right");
        tree.put(20, "Left Left");
        tree.put(40, "Left Right");
        tree.put(60, "Right Left");
        tree.put(80, "Right Right");

        System.out.println("Size of BST: " + tree.size());

        System.out.println("\nIn-order traversal:");
        for (var elem : tree) {
            System.out.println("Key is " + elem.getKey() + " and value is " + elem.getValue());
        }

        // Тест поиска
        System.out.println("\nGet key 40: " + tree.get(40)); // Expected: Left Right
        System.out.println("Get key 90: " + tree.get(90)); // Expected: null

        // Тест удаления
        System.out.println("\nDeleting key 30...");
        tree.delete(30);

        System.out.println("\nIn-order traversal after deleting 30:");
        for (var elem : tree) {
            System.out.println("Key is " + elem.getKey() + " and value is " + elem.getValue());
        }

        System.out.println("\nSize of BST after deletion: " + tree.size());
    }
}
