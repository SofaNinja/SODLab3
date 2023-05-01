package org.example;

import java.util.Scanner;

public interface QueueInterface {
    void fillArray(Scanner scanner, QueueArray hs);
    void fillLinkedList(Scanner scanner, QueueLinkList h);
    void addNumberToArray(Scanner scanner, QueueArray queueArray);
    void addNumberToLinkedList(Scanner scanner, QueueLinkList queueLinkList);
}
