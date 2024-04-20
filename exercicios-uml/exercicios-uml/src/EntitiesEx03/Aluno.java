package EntitiesEx03;

public class Aluno {

    public String nome;
    public double grade1;
    public double grade2;
    public double grade3;

    public double finalGrade() {
        return grade1 + grade2 + grade3;
    }

    public double missiongPoints() {
        if (finalGrade() < 60.0) {
            return 60.0 - finalGrade();
        }
        else  {
            return 0.0;
        }
    }
}
