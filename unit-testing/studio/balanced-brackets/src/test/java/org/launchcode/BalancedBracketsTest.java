package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void balancedBracketsAssertedAsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void balancedBracketsReturnsTrue() {
        String testCase = "[]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testCase);

        assertEquals(true, result);
    }

    @Test
    public void doubleLeftBracketsAssertedAsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
    }

    @Test
    public void doubleRightBracketsAssertedAsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]"));
    }

    @Test
    public void bracketLaunchCodeBracketEqualsTrue() {
        String testCase = "[LaunchCode]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testCase);

        assertEquals(true, result);
    }

    @Test
    public void singleBracketsLaunchCode() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]LaunchCode"));
    }

    @Test
    public void unbalancedBracketsLaunchCodeAssertFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]LaunchCode["));
    }

    @Test
    public void unbalancedBracketsAssertFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void unbalancedBracketsCodeAssertFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void balancedBracketCode() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void unbalancedBracketsAtEnd() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]["));
    }

    @Test
    public void moreThanTwoBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
    }
}