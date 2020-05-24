package xyz.nobaday.designpattern.strategy;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeSet;

public class AppTest {

    public static void main(String[] args) {
        TreeSet<Object> set = new TreeSet<Object>(new Comparator<Object>() {
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });

        LinkedList<Object> linkedList = new LinkedList<Object>();
        linkedList.sort(new Comparator<Object>() {
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });
    }
}
