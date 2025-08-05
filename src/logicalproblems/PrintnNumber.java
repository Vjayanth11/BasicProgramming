package logicalproblems;
import java.util.stream.IntStream;

public class PrintnNumber{
    public static void main(String[] args) {
        IntStream.range(1, 100).forEach(System.out::println);
    }

}