package me.mfvitale.mutation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {

    @Test
    @DisplayName("Passing noon to isPalindrome must return true")
    public void when_pal() {
        Palindrome fb = new Palindrome();
        assertTrue(fb.isPalindrome("noon"));
    }

    @Test
    @DisplayName("Passing empty string to isPalindrome must return true")
    public void when_empty_pal() {
        Palindrome fb = new Palindrome();
        assertTrue(fb.isPalindrome(""));
    }

    @Test
    @DisplayName("Passing mario string to isPalindrome must return false")
    public void when_not_pal() {
        Palindrome fb = new Palindrome();
        assertFalse(fb.isPalindrome("mario"));
    }

    @Test
    @DisplayName("Passing neon string to isPalindrome must return false")
    public void whenNearPalindrom_thanReject(){
        Palindrome palindromeTester = new Palindrome();
        assertFalse(palindromeTester.isPalindrome("neon"));
    }
}