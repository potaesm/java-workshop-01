public class CircularBuffer {
    private int initialBufferSize = 10;
    private int bufferSize;
    private String[] buffer;
    private int readPointer;
    private int writePointer;

    public CircularBuffer() {
        buffer = new String[initialBufferSize];
        bufferSize = initialBufferSize;
    }

    public boolean isEmpty() {
        return bufferSize == 10;
    }

    public void writeData(String input) {
        bufferSize--;
        this.buffer[writePointer++] = input;
    }

    public boolean isFull() {
        return bufferSize == 0;
    }

    public String readData() {
        if (readPointer == initialBufferSize) {
            readPointer = 0;
        }
        return this.buffer[readPointer++];
    }

    public void setBufferSize(int input) {
        initialBufferSize = input;
        buffer = new String[input];
        bufferSize = input;
    }
}
