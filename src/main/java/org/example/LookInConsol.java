package org.example;

import java.util.Scanner;

/**
 * Класс, считыванния информации из консоли
 */

public class LookInConsol {

    private static String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    public static void inputFromConsole(Order order){
        order.setClientName( prompt("Client name: "));
        order.setProduct(prompt("Product: "));
        order.setQnt(Integer.parseInt(prompt("Quantity: ")));
        order.setPrice(Integer.parseInt(prompt("Price: ")));
    }
}
