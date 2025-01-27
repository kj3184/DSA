package org.dsa;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class LetterCombinationsTest {

    @Test
    void testGenerateCombinations23() {
        List<String> resultOutput = List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        assertLinesMatch(resultOutput, LetterCombinations.generateCombinations("23"));
    }
}
