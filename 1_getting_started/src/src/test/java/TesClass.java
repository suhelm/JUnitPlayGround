import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class TesClass {

    @Test
    @DisplayName("ClassToTest.Addition()")
    @Order(1)   // will gurantee the order of execution
    public void TestAddition(){
        ClassToTest cl=new ClassToTest();
        Assertions.assertEquals(5, cl.addition(2,3));
        Assertions.assertNotEquals(3, cl.addition(2,3));
        Assertions.assertTrue(5==cl.addition(2,3),() -> "true" );
        Assertions.assertFalse(3==cl.addition(2,3),() -> "false" );
    }

}
