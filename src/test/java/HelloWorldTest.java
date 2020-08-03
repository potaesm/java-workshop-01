import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void sayHi_should_return_Hello_World() {
        HelloWorld h = new HelloWorld();
        String result = h.sayHi();
        assertEquals("Hello World", result);
    }

    @Test
    public void sayHi_with_suthinan_should_return_Hello_Suthinan() {
        HelloWorld h = new HelloWorld();
        String result = h.sayHi("suthinan");
        assertEquals("Hello Suthinan", result);
    }

    @Test
    public void sayHi_with_potae_should_return_Hello_Potae() {
        HelloWorld h = new HelloWorld();
        String result = h.sayHi("potae");
        assertEquals("Hello Potae", result);
    }
}