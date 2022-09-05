public class App {
    public static void main(String[] args) {

        StudentClass Me = new StudentClass();

        Me.surname = "Tejome"; 
        Me.firstName = "Jan Bianca";
        Me.middleInitial = 'O';
        Me.dateOfBirth = "01/02/2004";
        Me.studentNumber = 2022102430;
        Me.studentEmailAddress = "tejomejo@students.national-u.edu.ph";
        Me.iAmAwesome = true;
    
        Me.sayIntroduction();
        Me.sayMyStudentNumber();
        Me.sayMyEmailAddress();
        Me.amIAwesome();
    } 
} 
