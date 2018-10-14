/** An SLList is a list of Intergers, which hides the terrible truch
 * of the nakedness within.
*/
public class IntNode {
    public int item;
    public IntNode next;

    public IntNode(int f, IntNode n) {
        item = f;
        next = n;
    }
}