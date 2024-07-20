public class Regular extends Student {
    //attributes of Regular class
    private int numOfModules;
    private int numOfCreditHours;
    private double daysPresent;
    private boolean isGrantedScholarship;

    /*Constructor that accepts ten parameters which are enrollmentID,dateOfBirth, courseName,
    studentName, dateOfEnrollment, courseDuration, tuitionFee, numOfModules, numOfCreditHours and daysPresent**/
    public Regular(int enrollmentID, String dateOfBirth, String courseName,
                   String studentName, String dateOfEnrollment, int courseDuration,
                   double tuitionFee, int numOfModules, int numOfCreditHours, double daysPresent) {
        super(dateOfBirth,studentName,courseDuration, tuitionFee);// Calling constructor from parent class
        // Calling setter method from parent class
        super.setCourseName(courseName);
        super.setEnrollmentID(enrollmentID);
        super.setDateOfEnrollment(dateOfEnrollment);
        //initialize
        this.numOfModules = numOfModules;
        this.numOfCreditHours = numOfCreditHours;
        this.daysPresent = daysPresent;
        this.isGrantedScholarship =false;//assigning isGrantedScholarship as false
    }

    //accessor method/getter method of numOfModules
    public int getNumOfModules() {
        return numOfModules;
    }

    //accessor method/getter method of numOfModules
    public int getNumOfCreditHours() {
        return numOfCreditHours;
    }

    //accessor method/getter method of numOfModules
    public double getDaysPresent() {
        return daysPresent;
    }

    //accessor method/getter method of numOfModules
    public boolean getIsGrantedScholarship() {
        return isGrantedScholarship;
    }

    /*Setter method stores the value to the instance

     * Mutator method/setter method of numOfModules**/
    public void setNumOfModules(int numOfModules){
        this.numOfModules=numOfModules;
    }

    //Mutator method/setter method of numOfCreditHours
    public void setNumOfCreditHours(int numOfCreditHours){
        this.numOfCreditHours=numOfCreditHours;
    }

    //Mutator method/setter method of daysPresent
    public void setDaysPresent(double daysPresent){
        this.daysPresent=daysPresent;
    }

    //Mutator method/setter method of isGrantedScholarship
    public void setIsGrantedScholarship(boolean isGrantedScholarship){
        this.isGrantedScholarship=isGrantedScholarship;
    }


    /*. This method accepts the number of days present as a parameter. This method calculates the present percentage
        and returns an attendance grade from A to E **/
    public String presentPercentage(double daysPresent) {
        int totalDays=super.getCourseDuration()*30;
        double presentPercentage = (daysPresent / totalDays)*100;
        String grade;
        if(presentPercentage>=80 && presentPercentage <= 100){
            grade = "A";
            isGrantedScholarship=true;

        }
        else if(presentPercentage>=60 &&presentPercentage<=79){
            grade ="B";
            isGrantedScholarship=false;
        }
        else if(presentPercentage>=40 && presentPercentage<=59){
            grade ="C";
            isGrantedScholarship=false;
        }
        else if(presentPercentage>=20 && presentPercentage<=39){
            grade ="D";
            isGrantedScholarship=false;
        }
        else if(presentPercentage >= 0 && presentPercentage < 20){
            grade ="E";
            isGrantedScholarship=false;
        }else{
            grade = "";
        }
        return grade;

    }

    /*There is a method named grantCertificate which accepts three
    parameters which are courseName, enrollmentId and dateofEnrollement as
    parameters**/
    public void grantCertificate(String courseName,int enrollmentID,String dateOfEnrollment){

        System.out.println(getStudentName()+"has graduate from"+ getCourseName() +"with enrollmentId"+enrollmentID+
                "date of enrollment was"+dateOfEnrollment);
        if(isGrantedScholarship==true){
            System.out.println("Congratulations ! Scholarship has been granted ");
        }
        else{
            System.out.println("Scholarship has not been granted due to insufficient grade ");
        }

    }

    //Method with display all the details of Regular
    public void display() {
        super.display();//calls the method named display() from parent class
        System.out.println("Number of modules: " + numOfModules);
        System.out.println("Number of credit hours: " + numOfCreditHours);
        System.out.println("Days present: " + daysPresent);
    }
}
