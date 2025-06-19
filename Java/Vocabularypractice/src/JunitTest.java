import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class JunitTest {
    @Test
    public void testPractice_withWrongAnswer() {
        String simulatedInput = "cat\n0\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        Function func = new Function();

        HashMap<String, String> vocab = new HashMap<>();
        vocab.put("Hund", "dog");

        func.practice(vocab);

        HashMap<String, String> errors = func.getErrorList();
        assertEquals(1, errors.size());
        assertEquals("dog", errors.get("Hund"));
    }

    @Test
    public void testPractice_withCorrectAnswer() {
        String simulatedInput = "dog\n0\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        Function func = new Function();

        HashMap<String, String> vocab = new HashMap<>();
        vocab.put("Hund", "dog");

        func.practice(vocab);

        HashMap<String, String> errors = func.getErrorList();
        assertTrue(errors.isEmpty());
    }

}
