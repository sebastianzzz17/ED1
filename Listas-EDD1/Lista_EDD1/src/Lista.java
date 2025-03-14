public abstract class Lista {
    protected Node first;

    abstract void addStack(int theDat);
    abstract void addQueue(int theDat);
    abstract void traversal ();
    abstract Node search(int theDat);
    abstract void delete(int theDat);

    public Node getFirst() {
        return first;
    }
    public void setFirst(Node first) {
        this.first = first;
    }

    
}
