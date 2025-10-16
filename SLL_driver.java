// Name: Bahaa Mamdouh Najjar, ID: 202372990

public class SLL_driver {
    public static void main(String[] args) {
        SLL<Integer> list = new SLL<>();

        System.out.println("== Init ==");
        System.out.println("isEmpty: " + list.isEmpty());
        System.out.println("size: " + list.size());
        System.out.println("list: " + list);

        list.addToHead(20);
        list.addToTail(12);
        list.addToTail(29);
        list.addToHead(17);

        System.out.println("\n----------Initialization-----------");
        System.out.println("list: " + list);
        System.out.println("isEmpty: " + list.isEmpty());
        System.out.println("size: " + list.size());

        System.out.println("\n----------Contains-----------");
        System.out.println("contains 12: " + list.contains(12));
        System.out.println("contains 13: " + list.contains(13));

        System.out.println("\n----------Search-----------");
        System.out.println("search 29: " + list.search(29));
        System.out.println("search 13: " + list.search(13));

        System.out.println("\n----------Delete-----------");
        System.out.println("deleteFromHead: " + list.deleteFromHead());
        System.out.println("deleteFromTail: " + list.deleteFromTail());
        System.out.println("delete: 12");
        list.delete(12);
        System.out.println("after deletions list: " + list);

        System.out.println("\n----------Add-----------");
        System.out.println("add: 14 to tail");
        list.addToTail(14);
        System.out.println("add: 7 to head");
        list.addToHead(7);
        System.out.println("list: " + list);

        System.out.println("\n----------Reverse-----------");
        System.out.println("before reverse: " + list);
        list.reverse();
        System.out.println("after reverse: " + list);

    }
}
