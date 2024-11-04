package StreamJava;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;


public class JavaStream {

    public static void main(String[] args){

        List<String> myList = Arrays.asList("moi","toi","elle");
        List<Integer> myListInteger = Arrays.asList(1,2,3,4,5,6,7,8);

        List<String> keywords = Arrays.asList("j", "oi", "elle");

        // a stream to  order sorting
        Stream<String> filtering = myList.stream().sorted();

        // filter only word that contains "o"
        Stream<String> filtering2 = myList.stream().filter(word->word.contains("o"));

        // this filet will look for all word in keyword that match any part of ou myList
        Stream<String> filtering3 = myList.stream().filter(word->keywords.stream().anyMatch(word::contains));


        // -------------------------------------------------------------------------------------------------

        // this will multiply all number in the list by two
        Stream<Integer> filteringInteger1 = myListInteger.stream().map(n->n * 2);
        // only leave the numbers divisible by 2
        Stream<Integer> filteringInteger2 = myListInteger.stream().filter(n->n % 2 == 0);


        // -------------------------------------------------------------------------------------------------



        // store the filtering and make it as a list
        List<String> myListStreamed = filtering3.toList();
        // store the filtering make it as a list of Integer
        List<Integer> myListIntegerStreamed = filteringInteger2.toList();



        // output the result of filtering
        System.out.println(myListStreamed.toString());
        // output the result of mapping Integer
        System.out.println(myListIntegerStreamed.toString());


    }
}
