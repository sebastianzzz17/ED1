public class ListaSimple extends Lista{

    

    @Override
    void addQueue(int theDat) {
        Node newNode = new Node(theDat);
        if (first == null) {
            first = newNode;
        } else {
            Node aux = first;
            while (aux.next != null){
                aux = aux.next;
            }
            aux.next = newNode;
        }
    }

    @Override
    void addStack(int theDat) {
        Node newNode = new Node(theDat);
        if (first == null) {
            first = newNode;
        } else {
            newNode.next = first;                      
        }
        first = newNode;  
    }

    @Override
    void traversal() {
        if (first == null) {
            System.out.println("Empty List");
        } else {
            System.out.println("Elements: ");
            Node aux = first;
            while(aux!= null) {
                System.out.print(aux.data+"|");
                aux = aux.next;
            }
            System.out.println();
        }
        
    }

    @Override
    public void delete(int theDat) {
        // TODO Auto-generated method stub
    }

    @Override
    public Node search(int theDat) {
        // TODO Auto-generated method stub
        return null;
    }
    

}
