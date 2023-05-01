package org.example;

import java.util.Random;
import java.util.Scanner;

public class Queue implements QueueInterface {

    @Override
    public void fillArray(Scanner scanner, QueueArray queueArray) {
        Random random = new Random();
        for (int i = 0; i <= 1000; i++) {
            queueArray.add(random.nextInt(-500, 500));
        }
    }

    @Override
    public void fillLinkedList(Scanner scanner, QueueLinkList queueLinkList) {
        Random random = new Random();
        for (int i = 0; i <= 500; i++) {
            queueLinkList.add(random.nextInt(0, 500));
        }
        for (int i = 0; i <= 500; i++) {
            queueLinkList.add(random.nextInt(-500, 0));
        }
    }

    public void addNumberToArray(Scanner scanner, QueueArray queueArray) {
        int num = scanner.nextInt();
        queueArray.add(num);
    }

    public void addNumberToLinkedList(Scanner scanner, QueueLinkList queueLinkList){
        int number = scanner.nextInt();
        queueLinkList.add(number);
    }
}
