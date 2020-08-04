import org.junit.Test;

import static org.junit.Assert.*;

public class CircularBufferTest {

    CircularBuffer cb = new CircularBuffer();

    @Test
    public void create_new_buffer_should_empty() {
        boolean result = cb.isEmpty();
        assertTrue("Buffer busy", result);
    }

    @Test
    public void create_new_buffer_with_default_size_should_10() {
        for(int i=0; i<10; i++) {
            cb.writeData("A" + i);
        }
        boolean result = cb.isFull();
        assertTrue("Buffer not full", result);
    }

    @Test
    public void write_A_B_to_buffer_should_read_A_B() {
        cb.writeData("A");
        cb.writeData("B");
        assertEquals("A", cb.readData());
        assertEquals("B", cb.readData());
    }

    @Test
    public void write_A_to_buffer_one_time_should_read_A_at_eleventh_time() {
        cb.writeData("A");
        for (int i = 0; i <= 10; i++) {
            if (i == 10) {
                assertEquals("A", cb.readData());
            }
        }
    }

    @Test
    public void write_A_one_time_should_not_empty() {
        cb.writeData("A");
        boolean result = cb.isEmpty();
        assertFalse("Buffer empty", result);
    }

    @Test
    public void write_1_to_10_then_read_first_time_and_eleventh_time_should_be_same() {
        String first = "";
        String eleventh = "";
        for(int i = 1; i <= 10; i++) {
            cb.writeData(String.valueOf(i));
        }
        for(int i = 1; i <= 11; i++) {
            String data = cb.readData();
            if (i == 1) {
                first = data;
            }
            if (i == 11) {
                eleventh = data;
            }
        }
        assertTrue("Not the same", first.equals(eleventh));
    }

    @Test
    public void set_buffer_size_to_11_when_write_A_10_times_should_not_full() {
        CircularBuffer cb = new CircularBuffer(11);
        for(int i = 1; i <= 10; i++) {
            cb.writeData("A");
        }
        assertFalse("Fulled", cb.isFull());
    }

    @Test
    public void read_without_write_before_should_return_null() {
        assertNull("Not null", cb.readData());
    }
}