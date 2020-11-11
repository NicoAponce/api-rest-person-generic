package springproject.restperson;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RestPersonApplicationTests {

    @Test
    void sum() {
        int expect = 5;
        int num1 = 3;
        int num2 = 2;
        int result = RestPersonApplication.sum(num1, num2);
        Assertions.assertEquals(expect, result);

    }

}
