/** Array based list. 
 * @author Yansy, powerd by Josh Hug.
*/

//         0 1  2 3 4 5 6 7
// items: [3 6 -1 0 0 0 0 0 ...]
// size: 3

/* Invariants:
 * addList: The next item want to add, will go into position size. 
 * getLast: The item will want to return is in position size-1.
 * size: The number of items in the list shoule be size. */
public class AList<Item> {
    private Item[] items;
    private int size;
    /** Create a empty list. */
    public AList() {
        // items = new Item[100];
        items = (Item[]) new Object[100];
        size = 0;
    }
    /** Resizing the underline arrayto the target capacity. */
    private void resize(int capaity) {
        Item[] a = (Item[]) new Object[capaity];
        System.arraycopy(items, 0, a, 0, size);
        items = a;
    }

    public void addList(Item x) {
        if (size == items.length) {
            resize(size+1);
        }
        items[size] = x;
        size = size + 1;
    }

    public Item getLast() {
        return items[size-1];
    }

    public int getSize() {
        return size;
    }

    public Item get(int i) {
        return items[i];
    }

    public Item removeLast() {
        // int returnItem = items[size-1]; //not readable.
        Item x = getLast();
        // items[size] = 0; // it's unnecessary.
        items[size] = null;
        size = size-1;
        return x;
    }
}
