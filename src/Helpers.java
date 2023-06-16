import java.util.HashMap;
import java.util.Map;

public class Helpers
{

    public static void line()
    {
        for (int i = 0; i < 40; i++){
            System.out.print("_");
        }
        System.out.println(" ");
    }

    // приймаємо одноно чоловіка і виводимо його на екран по черзі виводивши його ключі і дані
    public static void displayMen(HashMap<String, String> men/*<-- ось він*/)
    {
        // тут ми в змінну "е" присвоюємо один елемент при кожній ітерації через ":" всі дані з "men" якого ми прийняли, витягнувши дані "men.entrySet()"
        for (Map.Entry<String,String> e/*<-- ось вона */ : men.entrySet()){
            System.out.println(e.getKey() +" = "+ e.getValue());
        }

        Helpers.line();// виводимо лінію
    }
}
