public class App {
    public static void main(String[] args) throws Exception {
        Node firts = new Node(19);
        Node segundo = new Node(12);
        Node tercero = new Node(4);

        firts.next = segundo;
        segundo.next = tercero;

        ListaSimple list1 = new ListaSimple();
        list1.addQueue(0);
        list1.addQueue(5);
        list1.addQueue(29);
        list1.addQueue(18);
        list1.addQueue(3);
        list1.addQueue(6);
        list1.traversal();

        ListaSimple list2 = new ListaSimple();
        list2.addStack(0);
        list2.addStack(5);
        list2.addStack(29);
        list2.addStack(18);
        list2.addStack(3);
        list2.addStack(6);
        list2.traversal();
    }
}
