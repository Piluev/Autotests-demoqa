import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JUnitExamples {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Here is beforeAll");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("    Here is beforeEach");
    }

    @Test
    void FirstTest() {
        System.out.println("        Here is FirstTest()");
    }

    @Test
    void SecondTest() {
        System.out.println("        Here is SecondTest()");
    }
}
