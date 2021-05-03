package week4;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import acm.program.ConsoleProgram;


public class WordCount extends ConsoleProgram
{
  @Override
  public void run()
  {
    int lines = 0;
    int words = 0;
    int chars = 0;
    BufferedReader rd = openFileReader("File: ");
    try
    {
      while (true)
      {
        String line = rd.readLine();
        if (line == null)
        {
          break;
        }
        lines++;
        words += countWords(line);
        chars += line.length();
      }
      rd.close();
    }
    catch (IOException ex)
    {
      println("An I/O exception has occurred");
    }
    println("Lines = " + lines);
    println("Words = " + words);
    println("Chars = " + chars);
  }

  private int countWords(String line)
  {
    return 0;
  }

  /**
   * Asks the user for the name of an input file and returns a
   * BufferedReader attached to its contents. If the file does
   * not exist, the user is given another chance to try.
   */
  private BufferedReader openFileReader(String prompt)
  {
    BufferedReader rd = null;
    while (rd == null)
    {
      String name = readLine(prompt);
      try
      {
        rd = new BufferedReader(new FileReader(name));
      }
      catch (IOException ex)
      {
        println("Can't open that file.");
      }
    }
    return rd;
  }
}
