package com.amigoscode;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract public class ExtractorReport {

    public abstract Pattern getPattern();

    public abstract String getReportName();


    public String parse(String path) throws FileAlreadyExistsException, FileNotFoundException {

        String out = "";

        File file = new File(path);
        Scanner scanner = new Scanner(file);

        if (scanner.hasNext())
            scanner.nextLine();
        else
            return "Empty File";

        while (scanner.hasNext()) {
            String nextLine = scanner.nextLine();
            Matcher matcher = getPattern().matcher(nextLine);

            boolean matches = matcher.matches();

            if (matches)
                out += nextLine + "\n";
        }

        return out.isBlank() ? "Empty File" : out;

    }

    public void parseAndSendReport(String path) throws FileNotFoundException, FileAlreadyExistsException {
        System.out.println("Starting report: " + getReportName() + " ...");
        String report = parse(path);
        System.out.println(report);
        System.out.println("sent report");
    }
}
