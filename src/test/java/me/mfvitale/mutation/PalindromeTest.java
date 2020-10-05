package me.mfvitale.mutation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {

    @Test
    @DisplayName("Passing noon to isPalindrome must return true")
    public void when_pal() {
        Palindrome fb = new Palindrome();
        assertTrue(fb.isPalindrome("noon"));
    }
}