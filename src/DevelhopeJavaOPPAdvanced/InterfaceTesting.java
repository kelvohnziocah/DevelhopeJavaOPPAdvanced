package DevelhopeJavaOPPAdvanced;

public class InterfaceTesting {
    public static void main( String[] args){
        Student student = new Student("Kelvin", "Nzioka", 12, 2);
        Professor professor = new Professor("Anita", "Kaluku", 14, "philosophy 1");
        Assistant assistant = new Assistant("Judy", "Kaluku", 19, true);
        student.goToCollege();
        student.studyAtHome();
        professor.goToCollege();
        professor.teachToOtherPeople();
        assistant.goToCollege();
        assistant.studyAtHome();
        assistant.teachToOtherPeople();
    }
}
