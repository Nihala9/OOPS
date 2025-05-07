interface Student {
    int score = 30;
    void displayScore();
}

interface Sports {
    int score = 20;
    void displaySportScore();
}

class Result implements Student, Sports {
    public void displayScore() {
        System.out.println("Academic score is :" + Student.score);
    }

    public void displaySportScore() {
        System.out.println("Sports score is :" + Sports.score);
    }
}

public class SprtStdtRslt {
    public static void main(String args[]) {
        Result r = new Result();
        r.displayScore();
        r.displaySportScore();
    }
}
