package services;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
class NodeDLL {
    int val;
    NodeDLL next;
    NodeDLL prev;
    Set<String> keys;
    NodeDLL(int val) {
        this.val = val;
        next = null;
        prev = null;
        keys = new HashSet<>();
    }
}
class AllOne {

    Map<String, NodeDLL> map;
    NodeDLL head, tail;

    public AllOne() {
        map = new HashMap<>();
        head = new NodeDLL(0);
        tail = new NodeDLL(0);
        head.next = tail;
        tail.prev = head;
    }

    public void inc(String key) {
        if(!map.containsKey(key)) {
            if(head.next == tail || head.next.val > 1) {
                insert(head, new NodeDLL(1));
            }
            head.next.keys.add(key);
            map.put(key, head.next);
        } else {
            NodeDLL curr = map.get(key);
            curr.keys.remove(key);
            if(curr.next == tail || curr.next.val > curr.val + 1) {
                insert(curr, new NodeDLL(curr.val + 1));
            }
            curr.next.keys.add(key);
            map.put(key, curr.next);
            if(curr.keys.isEmpty()) {
                remove(curr);
            }
        }
    }

    public void dec(String key) {
        if(!map.containsKey(key)) return;

        NodeDLL curr = map.get(key);
        curr.keys.remove(key);
        if(curr.val > 1) {
            if(curr.prev == head || curr.prev.val < curr.val - 1) {
                insert(curr.prev, new NodeDLL(curr.val - 1));
            }
            curr.prev.keys.add(key);
            map.put(key, curr.prev);
        } else {
            map.remove(key);
        }
        if(curr.keys.isEmpty()) {
            remove(curr);
        }
    }

    public String getMaxKey() {
        return tail.prev == head ? "" : tail.prev.keys.iterator().next();
    }

    public String getMinKey() {
        return head.next == tail ? "" : head.next.keys.iterator().next();
    }

    public NodeDLL insert(NodeDLL node, NodeDLL nextNode) {
        nextNode.next = node.next;
        nextNode.prev = node;
        node.next.prev = nextNode;
        node.next = nextNode;
        return nextNode;
    }

    public void remove(NodeDLL node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}