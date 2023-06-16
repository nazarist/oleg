import java.util.HashMap;
import java.util.Scanner;

public class Mens {
    private HashMap<String, String> men1;// створюємо пусті змінні для кожного чоловіка
    private HashMap<String, String> men2;
    private HashMap<String, String> men3;
    private HashMap<String, String> men4;




    private HashMap<String, String> create()// фопмує і повертає чоговіка
    {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> men = new HashMap<String, String>();//створюєм екземпляр одного чоговіка кожен раз коли ми його викликаємо створюватиме нового чоловіка

        System.out.print("name: ");//вставляємо в асоціативний масив дані
        men.put("name", sc.next());
        System.out.print("email: ");
        men.put("email", sc.next());
        System.out.print("foot size: ");
        men.put("foot", sc.next());

        Helpers.line();

        return men; //і повертаємо сформованого чоговіка з даними
    }

    public Mens()
    {
        this.men1 = this.create();// метод create сформував нового чоловіка і повернув його екземпляр і ми його присвоїли першій змінній
        this.men2 = this.create();// і знову формуємо нового чоговіка і повертаєм в змінну новий екземпляр
        this.men3 = this.create();// і так далі
        this.men4 = this.create();
    }






    // після construct(конструктора який створив всіх чоловіків) ми можемо отримати їх через гетер
    public HashMap<String, String> getMen1() {
        return men1;
    }


    public HashMap<String, String> getMen2() {
        return men2;
    }

    public HashMap<String, String> getMen3() {
        return men3;
    }

    public HashMap<String, String> getMen4() {
        return men4;
    }


    // тут ми перезаписуємо foot інійіалізованого чоговіка новими даними які ми впишемо
    public void setFootMen1(String foot) {
        // викликаємо чоловіка і перезаписуємо, просто викликаєм знову метод .put і в той самик ключ встановлюєм нове значення
        this.men1.put("foot",foot);
    }

    public void setFootMen2(String foot) {
        this.men2.put("foot", foot);
    }
    public void setFootMen3(String foot) {
        this.men3.put("foot", foot);
    }

    public void setFootMen4(String foot) {
        this.men4.put("foot", foot);
    }
}
