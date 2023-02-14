package com.amigoscode;


import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;

public class Main {

    public static void main(String[] args) throws FileAlreadyExistsException, FileNotFoundException {
        // Abstract Keyword

        // Number Extractor
        new NumberExtractorReport().parseAndSendReport("src/data.txt");

        // Email Extractor
        new EmailExtractorReport().parseAndSendReport("src/data.txt");

    }

}