import java.util.Collection;

public class CustomCollectionImp implements CustomCollection {
    private Node head;
    private Node tail;
    private int size;


    @Override
    public boolean add(Object str) {
        Node newNode = new Node((String) str, null, null);
        if (head != null) {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        } else {
            head = tail = newNode;
        }
        size++;
        return true;
    }

    @Override
    public boolean addAll(Collection strColl) {
        if (strColl.isEmpty()) {
            System.out.println("The collection is empty!");
            return false;
        }
        Node current = new Node();
        if (head != null) {
            current = head;
            while (current.next != null) {
                current = current.next;
            }
        } else {
            head = tail = current;
        }
        for (Object obj : strColl) {
            if (head.value == null) {
                current.value = (String) obj;
                continue;
            }
            Node node = new Node((String) obj, null, current);
            current.setNext(node);
            current = current.next;
            size++;
        }
        return true;
    }

    @Override
    public boolean delete(int index) {
        checkIndex(index);
        Node current = head;
        int counter = 0;
        while (current != null) {
            if (counter == index) {
                delete(current.value);
                return true;
            }
            current = current.next;
            counter++;
        }
        return false;
    }

    @Override
    public boolean delete(Object str) {
        Node current = head;
        for (int i = 0; i < size; i++) {
            if (current.value.equals(str)) {
                if (current == tail) {
                    tail.previous.next = null;
                } else if (current == head) {
                    current.next.previous = null;
                    head = head.next;
                } else {
                    current.previous.next = current.next;
                    current.next.previous = current.previous;
                }
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public Object get(int index) {
        checkIndex(index);
        int counter = 0;
        Node current = head;
        while (current.next != null && counter < index) {
            current = current.getNext();
            counter++;
        }
        return current;
    }

    @Override
    public boolean contains(Object str) {
        Node current = head;
        while (current.next != null) {
            if (current.value.equals(str)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    @Override
    public boolean clear() {
        head = tail = null;
        size = 0;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean trim() {
        return false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node current = head;
        while (current != null) {
            stringBuilder.append(current);
            stringBuilder.append(" ");
            current = current.getNext();
        }
        return stringBuilder.toString();
    }

    private void checkIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index must be less than " + size + " and bigger than 0.");
        }
    }

    private class Node {
        private String value;
        private Node next;
        private Node previous;

        public Node(String value, Node next, Node previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }

        public Node() {
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPrevious() {
            return previous;
        }

        public void setPrevious(Node previous) {
            this.previous = previous;
        }

        @Override
        public String toString() {
            return value;
        }
    }
}
