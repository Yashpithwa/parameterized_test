package com.example.junit_day1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FormServiceTest {

    FormService service = new FormService();

    @Test
    void testValidForm() {
        String result = service.submitForm("Yash", 22);
        assertEquals("Form submitted", result);
    }

    @Test
    void testUnderageUser() {
        String result = service.submitForm("Yash", 15);
        assertEquals("Underage", result);
    }

    @Test
    void testEmptyNameThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            service.submitForm("", 20);
        });
    }
}
