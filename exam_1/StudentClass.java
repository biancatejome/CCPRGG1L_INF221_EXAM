public class StudentClass {
        String surname;
        String firstName;
        Character middleInitial;
        String dateOfBirth;
        String studentNumber;
        String studentEmailAddress;
        boolean iAmAwesome;
    
        public void sayIntroduction() {
            System.out.println("Hello! I am a student of National University, Manila campus ");
        }
        public void sayMyStudentNumber() {
            System.out.println("Student number: " + studentNumber);
        }
        public void sayMyEmailAddress() {
            System.out.println("Student Email Address:  " + studentEmailAddress);
        }
        public void amIAwesome () {
            System.out.println("Am I awesome:  " + iAmAwesome);
        }
 }
