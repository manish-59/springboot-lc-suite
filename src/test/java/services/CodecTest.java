package services;

import org.junit.jupiter.api.Test;
import models.TreeNode;

public class CodecTest {

    @Test
    public void testCodec(){

        TreeNode tn = TreeBuilder.buildTree(new Integer[]{1,2,3,null,null,4,5});
        String tnStr = Codec.serialize(tn);
        System.out.println(tnStr);
        TreeNode strTn = Codec.deserialize(tnStr);
        String tnStr2 = Codec.serialize(strTn);
        System.out.println(tnStr2);
    }
}
