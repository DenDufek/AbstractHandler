// Файл: DOCHandler.java

// Клас для обробки документів у форматі DOC
public class DOCHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("Відкриваємо документ формату DOC");
    }

    @Override
    public void create() {
        System.out.println("Створюємо новий документ формату DOC");
    }

    @Override
    public void change() {
        System.out.println("Редагуємо документ формату DOC");
    }

    @Override
    public void save() {
        System.out.println("Зберігаємо документ формату DOC");
    }
}
