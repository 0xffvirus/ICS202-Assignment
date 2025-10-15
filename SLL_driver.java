public class SLL_driver {
    public static void main(String[] args) {
        SLL<Integer> list = new SLL<>();

        System.out.println("== Init ==");
        System.out.println("isEmpty: " + list.isEmpty());
        System.out.println("size: " + list.size());
        System.out.println("list: " + list);

        list.addToHead(7);
        list.addToTail(14);
        list.addToTail(21);
        list.addToHead(3);

        System.out.println("\n== After Add ==");
        System.out.println("list: " + list);
        System.out.println("isEmpty: " + list.isEmpty());
        System.out.println("size: " + list.size());

        System.out.println("\n== Contains ==");
        System.out.println("contains 14: " + list.contains(14));
        System.out.println("contains 42: " + list.contains(42));

        System.out.println("\n== Search ==");
        System.out.println("search 21: " + list.search(21));
        System.out.println("search 100: " + list.search(100));

        System.out.println("\n== Delete ==");
        System.out.println("deleteFromHead: " + list.deleteFromHead());
        System.out.println("deleteFromTail: " + list.deleteFromTail());
        list.delete(14);
        System.out.println("after deletions list: " + list);

        list.addToTail(100);
        list.addToHead(2);

        System.out.println("\n== Reverse ==");
        System.out.println("before: " + list);
        list.reverse();
        System.out.println("after: " + list);

    }
}
