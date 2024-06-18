public class LinkedListExample {

        public static void main(String[] args) {
            // crear el primer nodo (cabez "head" de la lista)
            Node head = new Node (1);
            //segundo nodo
            head.next = new Node (2);
            head.next.next = new Node (3);
            head.next.next.next = new Node (4);
            head.next.next.next.next = new Node (5);

            //Acceder a la posicion 2
            Node current = head; // Comienza desde la cabeza de la lista
            for (int i = 0; i < 2; i++){
                current = current.next;

            }

            // Imprimir el dato del nodo de la posicion 2
            System.out.println("Elemento de la lista enlazada 2: " + current.data);

            //iterar sobre la lista enlazada e imprimir cada elemento
            current = head; //reinicio la cabeza de la lista
            int position = 0; // voy a llevar la cuenta de la posicion
            while (current != null){
                //imprimo el dato del nodo actual y su posicion en la lista
                System.out.println("Elemento en la posicion: " + position + ": " + current.data);
                current = current.next; // avanzo al siguiente nodo
                position++;
            }

        }
    }

