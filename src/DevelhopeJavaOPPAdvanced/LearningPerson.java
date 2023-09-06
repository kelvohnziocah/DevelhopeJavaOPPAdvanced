package DevelhopeJavaOPPAdvanced;

interface LearningPerson {
    public abstract void studyAtHome();
}
interface TeachingPerson{
    public abstract void teachToOtherPeople();
}
class CollegePerson {
    String name;
    String surname;
    int collegeId;

    public CollegePerson(String name, String surname, int collegeId) {
        this.name = name;
        this.surname = surname;
        this.collegeId = collegeId;
    }

    public void goToCollege() {
        System.out.println("Name: " + name + " Surname: " + surname + " College ID: " + collegeId);
    }
}
    class Student extends CollegePerson implements LearningPerson{
        int academicYear;
        public Student(String name, String surname, int id, int year) {
            super(name, surname, id);
            this.academicYear = year;
        }
        @Override
        public void studyAtHome(){
            System.out.println("Student can learn");
        }
    }
    class Professor extends CollegePerson implements TeachingPerson{
    String teachingSubject;
        public Professor(String name, String surname, int id, String subject) {
            super(name, surname, id);
            this.teachingSubject = subject;
        }

        public void teachToOtherPeople(){
        System.out.println("Can Teach");
    }
    }
    class Assistant extends CollegePerson implements TeachingPerson, LearningPerson{
    boolean isGoingToBeAPhD;

        public Assistant(String name, String surname, int id, boolean willBeAPhD) {
            super(name, surname, id);
            this.isGoingToBeAPhD = willBeAPhD;
        }

        public void studyAtHome(){
        System.out.println("Can learn");
    }
        public void teachToOtherPeople(){
            System.out.println("Can also Teach");
        }
    }


