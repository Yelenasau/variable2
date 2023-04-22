public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int a = 50000;
        byte b = 3;
        short c = 1000;
        long d = 1000000;
        float e = 20.45666F;
        double f = 6.555777888;
        System.out.println("Значение переменной " + "a" + " c типом " + "int" + " равно " + a);
        System.out.println("Значение переменной " + "b" + " c типом " + "byte" + " равно " + b);
        System.out.println("Значение переменной " + "c" + " c типом " + "short" + " равно " + c);
        System.out.println("Значение переменной " + "d" + " c типом " + "long" + " равно " + d);
        System.out.println("Значение переменной " + "e" + " c типом " + "float" + " равно " + e);
        System.out.println("Значение переменной " + "f" + " c типом " + "double" + " равно " + f);
    }

    public static void task2() {
        System.out.println("Задача 2");
        float fada = 27.12F;
        long bad = 987678965549L;
        float fad = 2.786F;
        short sad = 569;
        short sed = -159;
        short sqd = 27897;
        byte bqd = 67;
    }

    public static void task3() {
        System.out.println("Задача 3");
        byte LP = 23;
        byte AS = 27;
        byte EA = 32;
        short vsegoBumagi = 480;
        byte listovKagdomu = (byte) (vsegoBumagi / (LP + AS + EA));
        System.out.println("На каждого учееника рассчитано " + listovKagdomu + " листов бумаги");
    }

    public static void task4() {
        System.out.println("Задача 4");
        byte minBut = 16;
        byte min = 2;
        byte vMin = (byte) (minBut / min);
        byte dvadzat = 20;
        byte chas = 60;
        short sutki = 1440;
        short troeSutok = 4320;
        int mesyc = 43200;
        byte zaDvadzat = (byte) (vMin * dvadzat);
        short zaSutki = (short) (vMin * sutki);
        int zaTroeSutok = (int) (vMin * troeSutok);
        int zaMesjaz = (int) (vMin * mesyc);
        System.out.println("За " + dvadzat + " минут машина произвела " + zaDvadzat + " штук бутылок");
        System.out.println("За " + sutki + " минут машина произвела " + zaSutki + " штук бутылок");
        System.out.println("За " + troeSutok + " минут машина произвела " + zaTroeSutok + " штук бутылок");
        System.out.println("За " + mesyc + " минут машина произвела " + zaMesjaz + " штук бутылок");
    }

    public static void task5() {
        System.out.println("Задача 5");
        byte belNaOdin = 2;
        byte korNaOdin = 4;
        byte vsegoBanok = 120;
        byte vsegoClassov = (byte) ((byte) vsegoBanok / (belNaOdin + korNaOdin));
        byte belVsego = (byte) (vsegoClassov * belNaOdin);
        byte korVsego = (byte) (vsegoClassov * korNaOdin);
        System.out.println("В школе, где" + vsegoClassov + " классов, нужно " + belVsego + " банок белой краски, и " + korVsego + " банок коричневой краски");
    }

    public static void task6() {
        System.out.println("Задача 6");
        byte banana = 80;
        byte milk = 105;
        byte ice = 100;
        byte eggs = 70;
        int gramm = banana * 5 + milk * 2 + ice * 2 + eggs * 4;
        float kg = gramm / 1000f;
        System.out.println("Количество грамм в завтраке: " + gramm);
        System.out.println("Количество килограмм в завтраке: " + kg);
    }

    public static void task7() {
        System.out.println("Задача 7");
        byte sbrosiit = 7;
        float min = 0.250f;
        float max = 0.500f;
        byte zaMin = (byte) (sbrosiit / min);
        byte zaMax = (byte) (sbrosiit / max);
        byte srednee = (byte) ((byte) (zaMax + zaMin) / 2);
        System.out.println("За " + zaMin + " дней, если будет худеть на " + min + " kg");
        System.out.println("За " + zaMax + " дней, если будет худеть на " + max + " kg");
        System.out.println("Потребуется " + srednee + " дней в среднем,чтобы добиться результата похудения");

    }

    public static void task8() {
        System.out.println("Задача 8");
        int zpMasha = 67760;
        int zpDenis = 83690;
        int zpKristina = 76230;
        int newMasha = (int) (zpMasha * 0.1 + zpMasha);
        int razMasha = (int) (newMasha * 12 - zpMasha * 12);
        System.out.println("Маша теперь получает " + newMasha + " рублей. Годовой доход вырос на " + razMasha + " рублей");
        int newDenis = (int) (zpDenis * 0.1 + zpDenis);
        int razDenis = (int) (newDenis * 12 - zpDenis * 12);
        System.out.println("Денис теперь получает " + newDenis + " рублей. Годовой доход вырос на " + razDenis + " рублей");
        int newKristina = (int) (zpKristina * 0.1 + zpKristina);
        int razKristina = (int) (newKristina * 12 - zpKristina * 12);
        System.out.println("Кристина теперь получает " + newKristina + " рублей. Годовой доход вырос на " + razKristina + " рублей");
}
}