package com.amigoscode;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // Creating a File

        try {
            File file = new File("src/foo.txt");

            /* creating new file */
            if (!file.exists())
                file.createNewFile();

            /* Deleting new File */
            if (file.exists())
                file.delete();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}