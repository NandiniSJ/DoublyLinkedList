public class Main {
    public static void main(String[] args) {
       DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        list.add(25,2);
       //list.displayForward();
        list.displayBackward();

    }
}