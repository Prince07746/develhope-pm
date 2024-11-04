package StreamJava.Stream1;


import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.stream.Stream;

public class Streams {
    public static Path file;
    static {
        file = Paths.get("src","StreamJava","Stream1","file.txt").toAbsolutePath();
    }

    public static void main(String[] args){

      try(Stream<String> lines = Files.lines(file)) {

            lines.forEach(System.out::println);
            // lines.forEach(line-> { System.out.println(line); });

      } catch (IOException e){
          System.out.println(e.getMessage());
      }


    }
}
