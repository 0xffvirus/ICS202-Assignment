// Name: Bahaa Mamdouh Najjar, ID: 202372990

public class SLL<T> {

    private class SLLNode<T> {
        private T info;
        private SLLNode<T> next;

        public SLLNode() {
            this(null, null);
        }

        public SLLNode(T el) {
            this(el, null);
        }

        public SLLNode(T el, SLLNode<T> ptr) {
            info = el;
            next = ptr;
        }
    }

    protected SLLNode<T> head, tail;

    public SLL() {
        head = new SLLNode<T>(null);
        tail = head;
    }

    public boolean isEmpty() {
        return head.next == null;
    }

    public void addToHead(T el) {
        SLLNode<T> newNode = new SLLNode<T>(el, head.next);
        head.next = newNode;
        if (tail == head)
            tail = newNode;
    }

    public void addToTail(T el) {
        tail.next = new SLLNode<T>(el);
        tail = tail.next;
    }

    public T deleteFromHead() {
        if (isEmpty())
            return null;
        SLLNode<T> nodeToDelete = head.next;
        T el = nodeToDelete.info;
        head.next = nodeToDelete.next;
        if (nodeToDelete == tail)
            tail = head;
        return el;
    }

    public T deleteFromTail() {
        if (isEmpty())
            return null;
        T el = tail.info;
        if (head.next == tail) {
            head.next = null;
            tail = head;
        } else {
            SLLNode<T> tmp;
            for (tmp = head.next; tmp.next != tail; tmp = tmp.next)
                ;
            tail = tmp;
            tail.next = null;
        }
        return el;
    }

    public void delete(T el) {
        if (!isEmpty()) {
            SLLNode<T> pred, tmp;
            for (pred = head, tmp = head.next; tmp != null && !tmp.info.equals(el); pred = pred.next, tmp = tmp.next)
                ;
            if (tmp != null) {
                pred.next = tmp.next;
                if (tmp == tail)
                    tail = pred;
            }
        }
    }

    @Override
    public String toString() {
        String str = "[ ";
        SLLNode<T> tmp = head.next;
        while (tmp != null) {
            str += tmp.info + " ";
            tmp = tmp.next;
        }
        return str + "]";
    }

    public boolean contains(T el) {
        SLLNode<T> tmp = head.next;
        while (tmp != null) {
            if (tmp.info != null && tmp.info.equals(el))
                return true;
            tmp = tmp.next;
        }
        return false;
    }

    public int size() {
        if (isEmpty())
            return 1;

        int count = 1;
        SLLNode<T> p = head.next;
        while (p != null) {
            count++;
            p = p.next;
        }

        return count;
    }

    public SLLNode<T> search(T el) {
        SLLNode<T> tmp = head.next;
        while (tmp != null) {
            if (tmp.info != null && tmp.info.equals(el))
                return tmp;
            tmp = tmp.next;
        }
        return null;
    }

    public void reverse() {
        if (isEmpty() || head.next.next == null)
            return;

        SLLNode<T> prev = null;
        SLLNode<T> current = head.next;
        SLLNode<T> next = null;

        tail = current;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head.next = prev;
    }
}