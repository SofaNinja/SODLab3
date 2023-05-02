package org.example;

public class QueueLinkList {

    private Link first;
    private Link last;
    private int size;

    public QueueLinkList() {
        first = null;
        last = null;
        size = 0;
    }

    boolean isEmpty() {
        return first == null;
    }

    public void add(int value) {
        Link node = new Link(value, null, null);
        if (size == 0){
            first = node;
            last = node;
        }
        else {
            Link number = first;
            if (value >= 0) {
                while (number.getData() <= value) {
                    number = number.getNext();
                    if (number == null) break;
                }
                if (number == null) {
                    last.setNext(node);
                    node.setPrev(last);
                    last = node;
                } else if (value > 0) {
                    node.setPrev(number.getPrev());
                    node.setNext(number);
                    if (number.getPrev() == null) first = node;
                    else number.getPrev().setNext(node);
                    number.setPrev(node);
                }
            }
            else {
                number = last;
                while (number.getData() <= value) {
                    number = number.getPrev();
                    if (number == null) break;
                }
                if (number == null) {
                    first.setPrev(node);
                    node.setNext(first);
                    first = node;
                } else {
                    node.setNext(number.getNext());
                    node.setPrev(number);
                    if (number.getNext() == null) last = node;
                    else number.getNext().setPrev(node);
                    number.setNext(node);
                }
            }
        }
        size++;
    }

    public int remove() {
        double start = System.currentTimeMillis();
        if (isEmpty()) {
            return 0;
        }
        Link temp = first;
        first = first.getNext();
        if (first != null) {
            first.setPrev(null);
        } else {
            last = null;
        }
        size = size - 1;
        double end = System.currentTimeMillis();
        double time = end - start;
        System.out.println("\nЧасу витрачено: " + time);
        return temp.getData();
    }

    public String toString() {
        double start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("[");
        Link current = first;
        while (current != null) {
            int data = current.getData();
            sb.append(data);
            if (current!=last) sb.append(", ");
            current = current.getNext();
        }
        sb.append("]");
        double end = System.currentTimeMillis();
        double time = end - start;
        System.out.println("Часу витрачено: " + time);
        return sb.toString();
    }
}