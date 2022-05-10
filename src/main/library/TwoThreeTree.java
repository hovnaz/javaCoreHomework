//package main.library;
//
///**
// * 2-3 Tree node implementation
// */
//public class TwoThreeTree {
//    public NodeTwoThree root;
//
//
//    public void add(int value) {
//        root = NodeTwoThree.addRecursive(root, value);
//    }
//}
//
//class DataTwoThree{
//    /** Constructor builds a leaf node with one data item */
//    DataTwoThree(int value) {
//        parent = prev;
//        dataOne = toAdd;
//    }
//}
//
//class NodeTwoThree {
//    //    values node
//    Integer lkey;
//    Integer rkey;
//
//    private NodeTwoThree left;   // Pointer to left child
//    private NodeTwoThree center; // Pointer to middle child
//    private NodeTwoThree right;  // Pointer to right child
//
//
//    NodeTwoThree(int value) {
//        lkey = value;
//        left = null;
//        center = null;
//        right = null;
//    }
//
//    public static NodeTwoThree addRecursive(NodeTwoThree current, int value ) {
//        if (current == null) return new NodeTwoThree(value);
//
//        if (current.lkey > value ){
////            current.left
//
//        }
//
//        System.out.println(current.lkey);
////        if (current.left)
//        return current;
//
//    }
//
//
//
//    protected void insert(int item) {
//        int diff = dataOne.compare(item);
//
//        //Node is a leaf
//        if ((left == null) && (mid == null) && (right == null)) {
//            if (this.dataTwo == null) {   //Leaf has only one data item
//                if (diff <= 0) {    //New item is larger than dataOne
//                    this.dataTwo = item;
//                } else {            //New item is smaller than dataOne
//                    this.dataTwo = dataOne;
//                    this.dataOne = item;
//                }
//            } else {                //Leaf has two items and must be split
//                splitLeaf(item);
//
//                if (parent != null) {
//                    this.parent.pushUp(this);
//                }
//            }
//
//            return;
//        }
//
//        //Not a leaf, continue traversal
//        if (diff > 0) {       //New item is smaller than dataOne and the smallest
//            left.insert(item);
//        }                     //New item is larger or equal to dataOne and this node
//        else if (dataTwo == null) {      //is a 2-node
//            right.insert(item);
//        } else {              //This node is a 3-node
//            diff = dataTwo.compare(item);
//
//            if (diff > 0) {   //New item is smaller than dataTwo
//                mid.insert(item);
//            } else {          //New item is larger than dataTwo and the largest
//                right.insert(item);
//            }
//        }
//    }
//
//
//
//}