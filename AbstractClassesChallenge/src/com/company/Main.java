package com.company;

public class Main {

    public static void main(String[] args) {
        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());

        String stringData = "84945452448 84945452233 84945455566 84945458899 84945451234 84945455678 84945452222 84945453333 84945456666";
        String[] data = stringData.split(" ");
        for (String s: data) {
            tree.addItem(new Node(s));
        }

        tree.traverse(tree.getRoot());
    }
}
