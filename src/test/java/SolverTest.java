import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolverTest {

    private Path inputPath = Path.of("");

    @Test
    public void testSolve() throws IOException {
        List<String> inputData = Files.readAllLines(inputPath);

        assertEquals("sas","");
    }
}
