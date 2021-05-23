/*
    Copyright 2021 <Dustin McClure>
    Project Name: CS140_Java
    Sub-project: Exercises
    File Name: StripHTMLTags.java
    Author: Dustin McClure
    Lab: Chapter 6 - Exercise 12
    Modified Date: 05/22/2021
*/
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.regex.Pattern;

public class StripHTMLTags
{
    public static void main(String[] args) throws FileNotFoundException
    {
        stripHtmlTags(new Scanner(new File("frankzappasmustache_github_io.html")));
    }

    public static void stripHtmlTags(Scanner in)
    {
        Pattern pattern = Pattern.compile("\\<.*.\\>");
        do {
            System.out.println(in.skip(pattern));
        } while(in.hasNextLine() == true);
    }
}
