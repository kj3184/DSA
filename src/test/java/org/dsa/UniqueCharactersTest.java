package org.dsa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UniqueCharactersTest {

    @Test
    void isUnique() {

        assertTrue(UniqueCharacters.isUnique("abcd"));

        assertFalse(UniqueCharacters.isUnique("abcda"));
    }
}
