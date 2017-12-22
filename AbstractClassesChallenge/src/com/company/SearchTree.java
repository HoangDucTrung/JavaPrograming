package com.company;

public class SearchTree implements NodeList {
    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            this.root = newItem;
            return true;
        }
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if (comparison <0) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                }
                else {
                    currentItem.setNext(newItem);
                    return true;
                }
            }
            else if (comparison >0) {
                if (currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                }
                else {
                    currentItem.setPrevious(newItem);
                    return true;
                }
            }
            else {
                System.out.println(newItem.getValue() + " is already presendt, not added");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }
        ListItem currenItem = this.root;
        ListItem parentItem = currenItem;

        while (currenItem != null) {
            int comparison = (currenItem.compareTo(item));
            if (comparison<0){
                parentItem = currenItem;
                currenItem = currenItem.next();
            }
            else if (comparison>0) {
                parentItem = currenItem;
                currenItem = currenItem.previous();
            }
            else {
                performRemoval(currenItem,parentItem);
                return true;
            }
        }
        return false;
    }

    private void performRemoval(ListItem item, ListItem parent) {
        if (item.next() == null) {
            if (parent.next() == item ) {
                parent.setNext(item.previous());
            }
            else if (parent.previous() == item ) {
                parent.setPrevious(item.previous());
            }
            else {
                this.root = item.previous();
            }
        }
        else if (item.previous() == null ) {
            if (parent.next() == item ) {
                parent.setNext(item.next());
            }
            else if (parent.previous() == item ) {
                parent.setPrevious(item.next());
            }
            else {
                this.root = item.next();
            }
        }
        else {
            ListItem current = item.next();
            ListItem leftmostParent = item;
            while (current.previous() != null) {
                leftmostParent = current;
                current = current.previous();
            }
            item.setValue(current.getValue());
            if (leftmostParent == item) {
                item.setNext(current.next());
            }
            else {
                leftmostParent.setPrevious(current.next());
            }
        }
    }

    @Override
    public void traverse(ListItem root) {
        if (root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
//        if (root != null) {
//            System.out.println(root.getValue());
//            traverse(root.next());
//        }
    }
}
