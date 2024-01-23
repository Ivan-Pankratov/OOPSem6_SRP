package org.example;
import java.io.IOException;

import static org.example.LookInConsol.inputFromConsole;
import static org.example.WriterJson.saveToJson;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Введите заказ:");
        Order order = new Order("", "", 0, 0);
        inputFromConsole(order);
        saveToJson(order);
    }

}