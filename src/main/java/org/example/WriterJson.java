package org.example;


import java.io.FileWriter;
import java.io.IOException;

/**
 * Класс реализующий запись в файл .json
 */
public class WriterJson {


    public static void saveToJson(Order order) throws IOException {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\"" + order.getClientName() + "\",\n");
            writer.write("\"product\":\"" + order.getProduct() + "\",\n");
            writer.write("\"qnt\":" + order.getQnt() + ",\n");
            writer.write("\"price\":" + order.getPrice() + "\n");
            writer.write("}\n");
            writer.flush();
        }

    }

}
