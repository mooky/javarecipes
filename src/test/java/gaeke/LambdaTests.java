package gaeke;

import org.junit.Test;

import java.io.File;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class LambdaTests {

    @Test
    public void ShouldFilterFiles() {

        File directory = new File("D:/java_code/scratch/src/main/java");


        long count = Stream.of(directory.list((file, name) -> name.endsWith(".java")))
                .peek(System.out::println)
                .count();

        assertEquals(count, 1);
    }

    @Test
    public void ConflictingTestCase() {

    }


}
