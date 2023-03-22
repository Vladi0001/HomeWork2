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
        System.out.println("Домашнее задание к уроку Переменные. Урок 2.");
        System.out.println("Задача 1 и 2.");
        byte a = 67;
        System.out.println("Значение переменной byte " + a + ".");
        short b = 569;
        System.out.println("Значение переменной short " + b + ".");
        short h = -159;
        System.out.println("Значение переменной short 2 " + h + ".");
        short j = 27897;
        System.out.println("Значение переменной short 3 " + j + ".");
        long d = 987_678_965_549L;
        System.out.println("Значение переменной long " + d + ".");
        float e = 27.12F;
        System.out.println("Значение переменной float " + e + ".");
        double f = 2.786;
        System.out.println("Значение переменной double " + f + ".");
        System.out.println("Задача 3.");
        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        short site = 480;
        int summ = lp + as + ea;
        int rich = site / summ;
        System.out.println("На каждого ученика рассчитано " + rich + " листов бумаги.");
        System.out.println("Задача 4.");
        byte min = 2;
        int but = 16;
        int min2 = 20 / min;
        int zwan = but * min2;
        int stunde = zwan * 3;
        int tag = 24 * stunde;
        long drieTag = tag * 3;
        long monat = tag * 30;
        System.out.println("За 20 минут машина произвела " + zwan + " штук бутылок.");
        System.out.println("За сутки машина произвела " + tag + " штук бутылок.");
        System.out.println("За трое суток машина произвела " + drieTag + " штук бутылок.");
        System.out.println("За месяц (30 дней) машина произвела " + monat + " штук бутылок.");
        System.out.println("Задача 5.");
        byte wies = 2;
        byte braun = 4;
        int summWB = wies + braun;
        int summ2 = 120;
        int klas = summ2 / summWB;
        int wiesB = klas * wies;
        int braunB = klas * braun;
        System.out.println("В школе, где " + klas + " классов, нужно " + wiesB + " банок белой краски и " + braunB+ " банок коричневой краски");
        System.out.println("Задача 6.");
        byte banan = 5;
        short milch = 200;
        byte ice = 2;
        byte ie = 4;
        int bananGramm = 80;
        int milchGramm = 105;
        int iceGramm = 100;
        int ieGramm = 70;
        int bananSumme = banan * bananGramm;
        int milchSumme = milchGramm + milchGramm;
        int iceSumme = ice * iceGramm;
        int ieSumme = ie * ieGramm;
        long allesSumme = bananSumme + milchSumme + iceSumme + ieSumme;
        int killo = 1000;
        long ost = allesSumme - killo;

        System.out.println( allesSumme + " граммов съедает спортсмен за завтраком.");
        System.out.println( "1 киллограмм и " + ost + " граммов съедает спортсмен за завтраком.");
        System.out.println("Задача 7.");
        byte killogramm = 7;
        int kgramm = killo * killogramm;
        short grammDown = 250;
        short grammDown2 = 500;
        int tag1 = kgramm / grammDown;
        int tag2 = kgramm / grammDown2;
        System.out.println(tag1 + " дней потребуется, если скидывать по " + grammDown + " грамм в день.");
        System.out.println(tag2 + " дней потребуется, если скидывать по " + grammDown2 + " грамм в день.");
        int tagSr = tag1 + tag2 / 2;
        System.out.println(tagSr + " дней потребуется в среднем, чтобы добиться результата.");
        System.out.println("Задача 8.");
        float moneyUp = 0.10F;
        int mascha = 67760;
        int denis = 83690;
        int kris = 76230;
        byte yahre = 12;
        float maschaUp = mascha * moneyUp;
        float maschaZp = mascha + maschaUp;
        int maschaYahre = mascha * yahre;
        float maschaYahre2 = maschaUp * yahre;
        float razni = maschaYahre - maschaYahre2;
        System.out.println("Маша теперь получает " + maschaZp + " рублей. Годовой доход вырос на " + razni + " рублей.");
        float denisUp = denis * moneyUp;
        float denisZp = denis + denisUp;
        int denisYahre = denis * yahre;
        float denisYahre2 = denisUp * yahre;
        float razni2 = denisYahre - denisYahre2;
        System.out.println("Денис теперь получает " + denisZp + " рублей. Годовой доход вырос на " + razni2 + " рублей.");
        float krisUp = kris * moneyUp;
        float krisZp = kris + krisUp;
        int krisYahre = kris * yahre;
        float krisYahre2 = krisUp * yahre;
        float razni3 = maschaYahre - maschaYahre2;
        System.out.println("Кристина теперь получает " + krisZp + " рублей. Годовой доход вырос на " + razni3 + " рублей.");







    }
}