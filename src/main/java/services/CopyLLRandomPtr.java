package services;

import models.NodeRandomPtr;

import java.util.HashMap;

public class CopyLLRandomPtr {

    //138

    public static NodeRandomPtr copyRandomList(NodeRandomPtr head) {
        if (head == null) return null;

        HashMap<NodeRandomPtr, NodeRandomPtr> oldToNew = new HashMap<>();

        NodeRandomPtr curr = head;
        while (curr != null) {
            oldToNew.put(curr, new NodeRandomPtr(curr.val));
            curr = curr.next;
        }

        curr = head;
        while (curr != null) {
            oldToNew.get(curr).next = oldToNew.get(curr.next);
            oldToNew.get(curr).random = oldToNew.get(curr.random);
            curr = curr.next;
        }

        return oldToNew.get(head);
    }
}
