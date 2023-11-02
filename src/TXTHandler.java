// Файл: TXTHandler.java

// Клас для обробки документів у форматі TXT
public class TXTHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("Відкриваємо текстовий документ");
    }

    @Override
    public void create() {
        System.out.println("Створюємо новий текстовий документ");
    }

    @Override
    public void change() {
        System.out.println("Редагуємо текстовий документ");
    }

    @Override
    public void save() {
        System.out.println("Зберігаємо текстовий документ");
    }
}
