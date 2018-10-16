public class SLList {
    /** Note: Please do not mess with first. */
    public IntNode first;

    public SLList(int x) {
        first = new IntNode(x,null);
    }

    public void addFirst(int x) {
        first = new IntNode(x, first);
    }

    /** return the first item in the list. */
    public int getFirst() {
        return first.item;
    }
    public static void main(String[] args) {
        /** Create a list of integer, namely 10 */
        SLList L = new SLList(10);
        L.addFirst(10);
        L.addFirst(15);
        System.out.println(L.getFirst());
        
    }
}