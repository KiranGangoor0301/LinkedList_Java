public class SingleLLFun {
    public static void main(String[] args) {
        SingleLinkedList list= new SingleLinkedList();
        list.insertFirst(78);
        list.insertFirst(7);
        list.insertFirst(8);
        // list.insertFirst(90);
        list.insertLast(87);
        // list.insertMiddle(34, 1);
        System.out.println(list.deleteAtFirst());
        list.display();
    }
}
