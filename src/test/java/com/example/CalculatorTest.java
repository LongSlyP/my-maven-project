package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        // Kiểm tra xem 2 + 3 có đúng bằng 5 không
        assertEquals(5, calculator.add(2, 3), "Phép cộng phải trả về kết quả chính xác");
    }
    @Test
    public void testWindowsPathIssue() {
        String filePath = "src\\test\\resources\\data.txt";

        java.io.File file = new java.io.File(filePath);

        assertTrue(file.exists(), "File phải tồn tại");
    }
}