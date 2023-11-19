package main;

import definition.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bt = new BinarySearchTree();
        //Display total number of possible binary search tree with key 5
        System.out.println("Total number of possible Binary Search Trees with given key: " + bt.numOfBST(5));
    }
}