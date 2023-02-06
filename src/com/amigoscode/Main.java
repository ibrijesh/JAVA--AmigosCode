package com.amigoscode;


import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args)  {
        // Checked Exceptions  (if not handled program will not run)

        try{
            File file = new File("src/ABC/foo.txt");   // invalid file path.

            if(!file.exists())
               file.createNewFile();
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }

    }

}