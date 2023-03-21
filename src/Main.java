public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1-3");

        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);

        System.out.println("Задача 4-5");

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задача 6-7");

        var box1 = 78.2;
        System.out.println("Вес первого боксёра " + box1 + " кг.");
        var box2 = 82.7;
        System.out.println("Вес второго боксёра " + box2 + " кг.");
        var sumBox = box1 + box2;
        System.out.println("Общий вес двух бойцов " + sumBox + " кг.");
        var rasBox = box1 - box2;
        System.out.println("Разница двух бойцов  " + rasBox + " кг.");
        var rasBox2 = box2 % box1;
        System.out.println("Второй боец тяжелее первого на  " + rasBox2 + " кг.");

        System.out.println("Задача 8");
        System.out.println("Пункт 1");
        var stund = 640;
        var stund1 = 8;
       var man = stund / stund1;
        System.out.println("Всего работников в компании " + man + " человек.");
        System.out.println("Пункт 2");
        var man1 = man + 94;
        var stund2 = man1 * stund1;
        System.out.println("Если в компании работает " + man1 + " человека, то всего " + stund2 + " часа работы может быть поделено между сотрудниками.");





    }
}