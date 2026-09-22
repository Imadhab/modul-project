package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {
    @Test
    void hasMinLength_ReturnTrue() {
        boolean result = PasswordValidator.hasMinLength("Hello123", 8);

        assertTrue(result);
    }

    @Test
    void hasMinLength_ReturnFalse(){
        boolean result = PasswordValidator.hasMinLength("Hello", 8);

        assertFalse(result);
    }

    @Test
    void containDigit_ReturnTrue(){
        boolean result = PasswordValidator.containsDigit("Hello123");

        assertTrue(result);
    }
    @Test
    void containDigit_ReturnFalse(){
        boolean result = PasswordValidator.containsDigit("Hello");

        assertFalse(result);
    }


    @Test
    void containsUpperAndLower_ReturnTrue(){
        boolean result = PasswordValidator.containsUpperAndLower("Hello123");

        assertTrue(result);
    }

    @Test
    void containsUpperAndLower_ReturnFalse(){
        boolean result = PasswordValidator.containsUpperAndLower("hello");

        assertFalse(result);
    }

    @Test
    void isCommonPassword_ReturnTrue(){
        boolean result = PasswordValidator.isCommonPassword("password");

        assertTrue(result);
    }

    @Test
    void isCommonPassword_ReturnFalse(){
        boolean result = PasswordValidator.isCommonPassword("MyPassword123");

        assertFalse(result);
    }

    @Test
    void containsSpecialChar_ReturnTrue(){
        boolean result = PasswordValidator.containsSpecialChar("Hello123@", "!@#$%");

        assertTrue(result);
    }

    @Test
    void isValid_ReturnTrue() {
        boolean result = PasswordValidator.isValid("Hello123");

        assertTrue(result);
    }

    @Test
    void isValid_ReturnFalse() {
        boolean result = PasswordValidator.isValid("hello");

        assertFalse(result);
    }

    @Test
    void isValid_ReturnTrue_WithSpecialChar() {
        boolean result = PasswordValidator.isValid("Hello@123");

        assertTrue(result);
    }


    //3 TDD Ablauf
    // 3.1
    @Test
    void hasMinLength_ReturnFalse_WhenLengthIs7() {
        boolean result = PasswordValidator.hasMinLength("1234567", 8);

        assertFalse(result);
    }

    @Test
    void hasMinLength_ReturnTrue_WhenLengthIs9() {
        boolean result = PasswordValidator.hasMinLength("123456789", 8);

        assertTrue(result);
    }

    @Test
    void hasMinLength_ReturnFalse_WhenPasswordIsEmpty() {
        boolean result = PasswordValidator.hasMinLength("", 8);

        assertFalse(result);
    }

    @Test
    void hasMinLength_ReturnFalse_WhenPasswordIsNull() {
        boolean result = PasswordValidator.hasMinLength(null, 8);

        assertFalse(result);
    }
    // 3.2
    @Test
    void containsDigit_ReturnFalse_WhenNoDigit() {
        boolean result = PasswordValidator.containsDigit("Hello");

        assertFalse(result);
    }

    @Test
    void containsDigit_ReturnTrue_WhenOneDigit() {
        boolean result = PasswordValidator.containsDigit("Hello1");

        assertTrue(result);
    }

    @Test
    void containsDigit_ReturnTrue_WhenMultipleDigits() {
        boolean result = PasswordValidator.containsDigit("Hello123");

        assertTrue(result);
    }

    @Test
    void containsDigit_ReturnTrue_WhenOnlyDigits() {
        boolean result = PasswordValidator.containsDigit("123456");

        assertTrue(result);
    }

    // 3.3
    @Test
    void containsUpperAndLower_ReturnFalse_OnlyUppercase() {
        boolean result = PasswordValidator.containsUpperAndLower("HELLO");

        assertFalse(result);
    }

    @Test
    void containsUpperAndLower_ReturnFalse_OnlyLowercase() {
        boolean result = PasswordValidator.containsUpperAndLower("hello");

        assertFalse(result);
    }

    @Test
    void containsUpperAndLower_ReturnTrue_Mixed() {
        boolean result = PasswordValidator.containsUpperAndLower("Hello");

        assertTrue(result);
    }

    @Test
    void containsUpperAndLower_ReturnFalse_OneLetter() {
        boolean result = PasswordValidator.containsUpperAndLower("A");

        assertFalse(result);
    }

    // 3.4

    @Test
    void isCommonPassword_ReturnTrue_Passwort1() {
        boolean result = PasswordValidator.isCommonPassword("Passwort1");

        assertTrue(result);
    }

    @Test
    void isCommonPassword_ReturnTrue_RegardlessOfCase() {
        boolean result = PasswordValidator.isCommonPassword("PASSWORD");

        assertTrue(result);
    }






}
