package com.example.digitsum;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DigitsumApplicationTests {
    Implementation sut = new Implementation();
    @Test
    public void testdigitsum() {
        var result= sut.calcDigitSum(1234);
        var expected= 10;
        assertEquals(expected,result);
    }

}
