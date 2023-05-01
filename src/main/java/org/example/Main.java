package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run(){
        QueueInterface queue = new Queue();
        Scanner scanner = new Scanner(System.in);
        QueueLinkList queueLinkList = new QueueLinkList();
        QueueArray queueArray = new QueueArray();
        loop:
        while (true){
            menu();
            System.out.println("\nВведіть номер опції нижче:");
            int option = scanner.nextInt();
            switch (option){
                case 1 -> queue.fillArray(scanner, queueArray);
                case 2 -> queue.addNumberToArray(scanner,queueArray);
                case 3 -> System.out.println(queueArray.remove());
                case 4 -> System.out.println(queueArray);
                case 5 -> queue.fillLinkedList(scanner, queueLinkList);
                case 6 -> queue.addNumberToLinkedList(scanner, queueLinkList);
                case 7 -> System.out.println(queueLinkList.remove());
                case 8 -> System.out.println(queueLinkList);
                case 9 -> {break loop;}
            }
        }
    }

    private void menu() {
        System.out.println("1: Заповнити масив");
        System.out.println("2: Додати число до масиву");
        System.out.println("3: Видалити число з масиву");
        System.out.println("4: Вивести відсортований масив");
        System.out.println("5: Заповнити зв'язний список");
        System.out.println("6: Додати число до зв'язного списку");
        System.out.println("7: Видалити число зі зв'язного списку");
        System.out.println("8: Вивести відсортований зв'зяний список");
        System.out.println("9: Вийти");
    }
}