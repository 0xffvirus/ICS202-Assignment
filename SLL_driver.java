public class SLL_driver {
    public static void main(String[] args) {
        SLL<Integer> list = new SLL<>();
        System.out.println(list.isEmpty());
        list.addToHead(1);
        list.addToHead(2);
        list.addToHead(3);
        System.out.println(list);
        list.deleteFromHead();
        System.out.println(list);
        list.reverse();
        System.out.println(list);
    }
}
