public class Test {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.AddBack(1);
        list.AddBack(2);
        list.AddBack(4);
        list.AddBack(6);

        int val = list.removeBack();
        System.out.println(val);
    }
}