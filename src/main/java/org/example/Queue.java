package org.example;

import java.util.Random;
import java.util.Scanner;

public class Queue implements QueueInterface {

    @Override
    public void fillArray(Scanner scanner, QueueArray queueArray) {
        double start = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i <= 1000; i++) {
            queueArray.add(random.nextInt(-500, 500));
        }
        double end = System.currentTimeMillis();
        double time = end - start;
        System.out.println("Часу витрачено: " + time);
    }

    @Override
    public void fillLinkedList(Scanner scanner, QueueLinkList queueLinkList) {
        double start = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i <= 500; i++) {
            queueLinkList.add(random.nextInt(0, 500));
        }
        for (int i = 0; i <= 500; i++) {
            queueLinkList.add(random.nextInt(-500, 0));
        }
        double end = System.currentTimeMillis();
        double time = end - start;
        System.out.println("Часу витрачено: " + time);
    }

    public void addNumberToArray(Scanner scanner, QueueArray queueArray) {
        double start = System.currentTimeMillis();
        int num = scanner.nextInt();
        queueArray.add(num);
        double end = System.currentTimeMillis();
        double time = end - start;
        System.out.println("Часу витрачено: " + time);
    }

    public void addNumberToLinkedList(Scanner scanner, QueueLinkList queueLinkList){
        double start = System.currentTimeMillis();
        int number = scanner.nextInt();
        queueLinkList.add(number);
        double end = System.currentTimeMillis();
        double time = end - start;
        System.out.println("Часу витрачено: " + time);
    }
}
