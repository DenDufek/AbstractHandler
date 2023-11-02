// Файл: DocumentHandlerDemo.java

public class DocumentHandlerDemo {
    public static void main(String[] args) {
        AbstractHandler xmlHandler = new XMLHandler();
        AbstractHandler txtHandler = new TXTHandler();
        AbstractHandler docHandler = new DOCHandler();

        // Визначення документу і робота з ним
        AbstractHandler document = xmlHandler; // Можна змінити на txtHandler або docHandler
        document.open();
        document.create();
        document.change();
        document.save();
    }
}
