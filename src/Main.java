// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
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

}