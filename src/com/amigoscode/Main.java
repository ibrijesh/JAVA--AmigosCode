package com.amigoscode;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        // Creating a File
        File file = createFile("src/foo.txt");
        writeToFile(file, true, "Cristiano");

    }

    private static void writeToFile(File file, boolean append, String content) {
        try {
            FileWriter fileWriter = new FileWriter(file, append);
            PrintWriter writer = new PrintWriter(fileWriter);
            writer.println(content);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    private static File createFile(String path) {

        try {
            File file = new File(path);

            /* creating new file */
            if (!file.exists())
                file.createNewFile();
            return file;

        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new IllegalStateException(e);
        }

    }

}