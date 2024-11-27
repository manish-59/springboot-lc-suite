package models;

public class NodeRandomPtr {

    public int val;
    public NodeRandomPtr next;
    public NodeRandomPtr random;

    public NodeRandomPtr(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
