// Файл: XMLHandler.java

// Клас для обробки документів у форматі XML
public class XMLHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("Відкриваємо XML-документ");
    }

    @Override
    public void create() {
        System.out.println("Створюємо новий XML-документ");
    }

    @Override
    public void change() {
        System.out.println("Редагуємо XML-документ");
    }

    @Override
    public void save() {
        System.out.println("Зберігаємо XML-документ");
    }
}
