// Zadanie 8: Interfejs rozszerzajacy inne interfejsy
interface Readable {
    void read();
}

interface Writable {
    void write(String content);
}

interface ReadWrite extends Readable, Writable {
}

class TextDocument implements ReadWrite {
    private String text = "";

    @Override
    public void write(String content) {
        this.text = content;
    }

    @Override
    public void read() {
        System.out.println("Tresc dokumentu: " + text);
    }
}

public class Zadanie8_ReadWrite {
    public static void main(String[] args) {
        TextDocument doc = new TextDocument();
        doc.write("Prosty dokument tekstowy.");
        doc.read();
    }
}
