package com.neilson.problems;

import com.neilson.commons.singlelinkedlist.List;
import com.neilson.commons.utils.ListUtils;

import org.junit.*;

/**
 * Created by neilson on 1/4/15.
 */
public class Problem32 {
    @Test
    public void reverseInPairs() {
        List l1 = ListUtils.createList(1,2,3,4,5,6);
        l1.invert(l1.head);
        l1.toString();
    }
}
