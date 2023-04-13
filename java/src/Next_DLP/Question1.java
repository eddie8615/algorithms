package Next_DLP;

public class Question1 {
    public static void main(String[] args){
        DoublyLinkedList d = new DoublyLinkedList();
        d.addFirst(new DoublyLinkedList.Node(1));
        d.addFirst(new DoublyLinkedList.Node(12));
        d.addFirst(new DoublyLinkedList.Node(3));
        d.addFirst(new DoublyLinkedList.Node(4));
        d.addLast(new DoublyLinkedList.Node(10));
        d.delete(d.tail.prev);
        System.out.println(d.getLast());

    }


    static class DoublyLinkedList{
        Node head;
        Node tail;

        public DoublyLinkedList(){

        }

        public void addFirst(Node node){
            if(this.head == null){
                this.head = node;
                this.tail = node;
                return;
            }
            this.head.prev = node;
            node.next = this.head;
            this.head = node;
        }

        public void addLast(Node node){
            if(this.head == null){
                this.head = node;
                this.tail = node;
                return;
            }

            this.tail.next = node;
            node.prev = this.tail;
            this.tail = node;

        }

        public void delete(Node node){
            if(head == null && tail == null)
                return;
            if(this.head == node)
                this.head = node.next;
            if(node.next != null){
                node.next.prev = node.prev;
            }
            if(node.prev != null){
                node.prev.next = node.next;
            }

        }

        public int getLast(){
            return this.tail.value;
        }

        public int getFirst(){
            return this.head.value;
        }

        public void printList(){
            Node curr = this.head;
            while(curr != null){
                System.out.println(curr.value);
                curr = curr.next;
            }
        }

        static class Node{
            int value;
            Node prev;
            Node next;

            public Node(){

            }

            public Node(int value){
                this.value = value;
            }

            public Node(int value, Node prev, Node next){
                this.value = value;
                this.prev = prev;
                this.next = next;}

        }
    }
}
