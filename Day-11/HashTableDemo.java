import java.util.*;
//package Collections.map;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable h = new Hashtable();
        h.put(new temp(5), "A");
        h.put(new temp(2), "B");
        h.put(new temp(6), "C");
        h.put(new temp(15), "D");
        h.put(new temp(23), "E");
        h.put(new temp(16), "F");
        System.out.println(h);
    }
}

class temp {
    int i;

    temp(int i) {
        this.i = i;
    }

    public int hashCode() {
        return 2 * i;
    }

    public String toString() {
        return i + "";
    }
}
