public class LinkedList {
    Node head;

    // metodo para agregar un nodo al final de la lista
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
        }
    }
    //borrar un nodo por su valor

    public void delete(int data) {
        if (head == null) return;

        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }
        if (current.next == null) {
            current.next = current.next.next;
        }


    }






    public void printList() {}
}
