public class Main {
    public static void main(String[] args) {
        //First exercise
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog + "\n" + cat + "\n" + paper);
        //Second exercise
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog + "\n" + cat + "\n" + paper);
        //Third exercise
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog + "\n" + cat + "\n" + paper);
        //Fourth exercise
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        //Fifth exercise
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        //Sixth exercise
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        var differenceWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println(totalWeight + "\n" + differenceWeight);
        //Seventh exercise
        var firstDifferenceWeight = secondBoxerWeight - firstBoxerWeight;
        var secondDifferenceWeight = secondBoxerWeight % firstBoxerWeight;
        System.out.println(firstDifferenceWeight + "\n" + secondDifferenceWeight);
        //Eighth exercise
        var totalTime = 640;
        var onePersonTime = 8;
        var employeesNumber = totalTime / onePersonTime;
        System.out.println("Всего работников в компании — " + employeesNumber + " человек");
        employeesNumber = employeesNumber + 94;
        var newTotalTime = onePersonTime * employeesNumber;
        System.out.println("Если в компании работает " + employeesNumber + " человек, то всего " + newTotalTime + " часов работы может быть поделено между сотрудниками");
    }
}