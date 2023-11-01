// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //lessons 2 varible
        //task 1
        byte b = 127;
        short s = 300;
        int i = 5000000;
        long l = 999999999999999999L;
        float f =  3.123456f;
        double d = 1.9;
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);

        // task 2
        float floatVariable1 = 27.12f;
        long longVariable = 987678965549L;
        float floatVariable2 = (float)2.786;
        short shortVariable1 = 569;
        short shortVariable2 = -159;
        int intVariable = 27897;
        byte byteVariable = 67;


        //task 3
        byte studentsInLyudaClass, studentsInAnnaClass, studentsInKatyaClass;
        studentsInLyudaClass = 23;
        studentsInAnnaClass = 27;
        studentsInKatyaClass = 30;

        short papers = 480;

        int papersForStudent = papers / (studentsInLyudaClass + studentsInKatyaClass + studentsInAnnaClass);
        // or if you need float type
        // float papersForStudentFloatType =(float) papers / (studentsInLyudaClass + studentsInKatyaClass + studentsInAnnaClass);
        System.out.println("На каждого ученика рассчитано " + papersForStudent + " листов бумаги");

        // task 4
        byte perfomance = 16;
        byte perfomanceForMinute = (byte) (perfomance / 2);
        int perfomanceFor20Minutes = 20 * perfomanceForMinute;
        int perfomanceForOneDay = 24 * 60 * perfomanceForMinute;
        int perfomanceFor3Days = 24 * 3 * 60 * perfomanceForMinute;
        int perfomanceForOneMonth = 30 * 24 * 60 * perfomanceForMinute;
        System.out.println("За 20 минут машина произвела " + perfomanceFor20Minutes + " штук бутылок");
        System.out.println("За 1 день машина произвела " + perfomanceForOneDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + perfomanceFor3Days + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + perfomanceForOneMonth + " штук бутылок");

        //task 5
        byte totalColoursJar = 120;
        byte whiteJarNeedForClass = 2;
        byte brownJarNeedForClass = 4;

        byte classesInSchool = (byte) (totalColoursJar / (whiteJarNeedForClass + brownJarNeedForClass));

        byte brownJarPurchased = (byte) ((totalColoursJar / classesInSchool - whiteJarNeedForClass) * classesInSchool);
        byte whiteJarPurchased = (byte) ((totalColoursJar / classesInSchool - brownJarNeedForClass) * classesInSchool);
        System.out.println("В школе, где "+ classesInSchool +" классов, нужно "+ whiteJarPurchased +" банок белой краски и "+ brownJarPurchased +" банок коричневой краски");

        // task 6
        byte bananas = 5;
        short milk = 200;
        byte iceCream = 2;
        byte eggs = 4;
        //weight;
        byte banansWeight = 80;
        float milkWeightForML = 105/100f;
        byte iceCreamWeight = 100;
        byte eggWeight = 70;

        short totalWeightGrams = (short) (bananas * banansWeight + milk * milkWeightForML + iceCream * iceCreamWeight + eggs * eggWeight);
        float totalWeightKG =  totalWeightGrams / 1000f;
        System.out.println(totalWeightGrams);
        System.out.println(totalWeightKG);

        //task 7
        byte needLoseWeightInKG = 7;
        short lose250ForDay = 250;
        short lose500ForDay = 500;

        short needLoseWeightInGram = (short) (needLoseWeightInKG * 1000);

        byte needDaysMakeFormLose250 = (byte) (needLoseWeightInGram / lose250ForDay);
        byte needDaysMakeFormLose500 = (byte) (needLoseWeightInGram / lose500ForDay);
        byte averageDays = (byte) ((needDaysMakeFormLose250 + needDaysMakeFormLose500) / 2);
        System.out.println(needDaysMakeFormLose250);
        System.out.println(needDaysMakeFormLose500);
        System.out.println(averageDays);

        //task 8
        int salaryMasha = 67760, salaryDenis = 83690, salaryKristi = 76230;
        int salaryMashaUp = (int) (salaryMasha * 1.1), salaryDenisUp = (int) (salaryDenis * 1.1), salaryKristiUp = (int) (salaryKristi *1.1);

        int yearSalaryMashaBeforeUp = salaryMasha * 12, yearSalaryMashaAfterUp = salaryMashaUp * 12;
        int salaryDifferentMasha = yearSalaryMashaAfterUp - yearSalaryMashaBeforeUp;

        int yearSalaryDenisBeforeUp = salaryDenis * 12, yearSalaryDenisAfterUp = salaryDenisUp * 12;
        int salaryDifferentDenis = yearSalaryDenisAfterUp - yearSalaryDenisBeforeUp;

        int yearSalaryKristiBeforeUp = salaryKristi * 12, yearSalaryKristiAfterUp = salaryKristiUp * 12;
        int salaryDifferentKristi = yearSalaryKristiAfterUp - yearSalaryKristiBeforeUp;

        System.out.println("Маша теперь получает " + salaryMashaUp + " рублей. Годовой доход вырос на " + salaryDifferentMasha+ " рублей");
        System.out.println("Денис теперь получает " + salaryDenisUp + " рублей. Годовой доход вырос на " + salaryDifferentDenis+ " рублей");
        System.out.println("Кристина теперь получает " + salaryKristiUp + " рублей. Годовой доход вырос на " + salaryDifferentKristi+ " рублей");
        /*
        ifElseTask();
        //task 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // task 2
        dog += 4;
        cat += 4;
        paper += 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task 3

        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //task 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog/3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);

        //task 6
        var fighter1 = 78.2;
        var fighter2 = 82.7;

        var totalMass = fighter1 + fighter2;
        var differentMass = fighter2 - fighter1;

        System.out.println(totalMass);
        System.out.println(differentMass);

        //task 7
        var dfMass = fighter2 - fighter1;
        var dfMass1 = fighter2 % fighter1;

        //task 8
        var workHours = 640;
        var workTime = 8;
        var totalEmploeyr = workHours/workTime;
        System.out.println("Всего работников в компании — " + totalEmploeyr + " человек");

        var newEmployer = 94;
        var totalEmployerAfterUpdate = totalEmploeyr + newEmployer;
        var newWorkHours = totalEmployerAfterUpdate * workTime;
        System.out.println("Если в компании работает " + totalEmployerAfterUpdate + " человек, то всего " + newWorkHours + " часов работы может быть поделено между сотрудниками");

        //Дополнительные задачи по теме переменные
        variableTask();
    }
    public static void variableTask () {
        // дополнительные задачи по теме переменные 1.2
        //task 6
        int a = 12, b = 27, c = 44, d = 15, e = 9;
        int result = a * (b + (c - d * e));
        result *= -1;
        System.out.println(result);

        //task 7
        int a1 = 5, b1 = 7;
        b1 -= a1;
        a1 = b1 + a1;
        b1 = a1-b1;

        //task 8
        int a2 = 256, b2;
        b2 = (a2/10)%10;
        System.out.println(b2);
    }

    public static void ifElseTask(){
        //task 6
        int age = 24;
        int salary = 80000;
        int creditLimit = 0;

        if(age <= 23) {
            creditLimit = salary * 2;
            if(salary >= 50000 && salary < 80000) {
                creditLimit *= 1.2;
            } else if (salary >= 80000) {
                creditLimit *= 1.5;
            }
        } else if (age > 23) {
            creditLimit = salary * 3;
            if(salary >= 50000 && salary < 80000) {
                creditLimit *= 1.2;
            } else if (salary >= 80000) {
                creditLimit *= 1.5;
            }
        }

        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + creditLimit + " рублей");

         */
    }
}