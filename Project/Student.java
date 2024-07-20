public class Student {
    // Attributes of Student class
    private int enrollmentID;
    private String courseName;
    private String studentName;
    private String dateOfBirth;
    private String dateOfEnrollment;
    private int courseDuration;
    private double tuitionFee;

    /*
     * Constructor that accepts four parameters which are the
     * dateOfBirth,studentName,
     * courseDuration and tuitionfee
     **/

    public Student(String dateOfBirth, String studentName, int courseDuration, double tuitionFee) {
        // Intialize
        this.dateOfBirth = dateOfBirth;
        this.studentName = studentName;
        this.courseDuration = courseDuration;
        this.tuitionFee = tuitionFee;
        this.courseName = "";// courseName initializing with empty string
        this.dateOfEnrollment = "";// dateOfenrollment initializing with empty string
        this.enrollmentID = 0;// Initializing enrollmentID with Zero

    }

    // accessor method/getter method of courseDuration
    public int getCourseDuration() {
        return courseDuration;
    }

    // accessor method/getter method of tuitionFee
    public double getTuitionFee() {
        return tuitionFee;
    }

    // accessor method/getter method of enrollmentID
    public int getEnrollmentID() {
        return enrollmentID;
    }

    // accessor method/getter method of studentName
    public String getStudentName() {
        return studentName;
    }

    // accessor method/getter method of dateOfBirth
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    // accessor method/getter method of courseName
    public String getCourseName() {
        return courseName;
    }

    // accessor method/getter method of dateOfEnrollment
    public String getDateOfEnrollment() {
        return dateOfEnrollment;
    }

    // Setter method stores the value to the instance

    // setter/mutator method of courseName
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    // setter/mutator method of enrollmentID
    public void setEnrollmentID(int enrollmentID) {
        this.enrollmentID = enrollmentID;
    }

    // setter/mutator method of dateOfEnrollment
    public void setDateOfEnrollment(String dateOfEnrollment) {
        this.dateOfEnrollment = dateOfEnrollment;
    }

    // setter/mutator method of dateOfBirth
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // setter/mutator method of studentName
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    // setter/mutator method of tutitionFee
    public void setTuitionFee(double tuitionFee) {
        this.tuitionFee = tuitionFee;
    }

    // setter/mutator method of courseDuration
    public void setCourseDuration(int courseDuration) {
        this.courseDuration = courseDuration;
    }

    // display method of enrollmentID, courseName, studentName, dateOfBirth,
    // courseDuration, tuitionFee and dateOfEnrollment
    public void display() {
        if (enrollmentID == 0 || dateOfBirth == "" || courseName == "" || studentName == ""
                || courseDuration == 0 || tuitionFee == 0 || dateOfEnrollment == "") {

            System.out.println("Due to insuffient details Student details cannot be display");

        } else {
            System.out.println("Enrollment ID :" + enrollmentID);
            System.out.println("Name of the course :" + courseName);
            System.out.println("Name of the Student :" + studentName);
            System.out.println("Date of Birth :" + dateOfBirth);
            System.out.println("Duration of Course :" + courseDuration);
            System.out.println("Fee for Tutition :" + tuitionFee);
            System.out.println("Date of Enrollment :" + dateOfEnrollment);
        }
    }
}
