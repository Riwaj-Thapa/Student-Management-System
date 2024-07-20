public class Dropout extends Student {
    //attributes of Dropout class
    private int numOfRemainingModules;
    private int numOfMonthsAttended;
    private String dateOfDropout;
    private int remainingAmount;
    private boolean hasPaid;

    /*Constructor that accepts ten parameters which are the enrollmentID, courseName, dateOfEnrollment, dateOfBirth,
                 studentName, courseDuration, tuitionFee, numOfRemainingModules, numOfMonthsAttended, dateOfDropout **/
    public Dropout(int enrollmentID, String courseName, String dateOfEnrollment, String dateOfBirth,
                   String studentName, int courseDuration, double tuitionFee, int numOfRemainingModules,
                   int numOfMonthsAttended, String dateOfDropout){
        //Calling the constructor from parent class i.e. Student
        super(dateOfBirth, studentName, courseDuration, tuitionFee);
        //Calling the setter methods from parent class
        super.setCourseName(courseName);
        super.setEnrollmentID(enrollmentID);
        super.setDateOfEnrollment(dateOfEnrollment);
        //Initializing
        this.numOfRemainingModules = numOfRemainingModules;
        this.numOfMonthsAttended = numOfMonthsAttended;
        this.dateOfDropout = dateOfDropout;
        this.remainingAmount = 0;//initializing with Zero
        this.hasPaid = false;//assigning hasPaid as false
    }

    //accessor method/getter method of numOfRemainingModules
    public int getNumOfRemainingModules() {
        return numOfRemainingModules;
    }

    //accessor method/getter method of numOfMonthsAttended
    public int getNumOfMonthsAttended() {
        return numOfMonthsAttended;
    }

    //accessor method/getter method of dateOfDropout
    public String getDateOfDropout() {
        return dateOfDropout;
    }

    //accessor method/getter method of remainingAmount
    public int getRemainingAmount() {
        return remainingAmount;
    }

    //accessor method/getter method of hasPaid
    public boolean getHasPaid() {
        return hasPaid;
    }

    //Setter method stores the value to the instance

    //setter/mutator method of numOfRemainingModules
    public void setNumOfRemainingModules(int numOfRemainingModules){
        this.numOfRemainingModules=numOfRemainingModules;
    }

    //setter/mutator method of numOfMonthsAttended
    public void setNumOfMonthsAttended(int numOfMonthsAttended){
        this.numOfMonthsAttended=numOfMonthsAttended;
    }

    //setter/mutator method of dateOfDropout
    public void setDateOfDropout(String dateOfDropout){
        this.dateOfDropout=dateOfDropout;
    }

    //setter/mutator method of remainingAmount
    public void setRemainingAmount(int remainingAmount){
        this.remainingAmount=remainingAmount;
    }

    //setter/mutator method of hasPaid
    public void setHasPaid(boolean hasPaid){
        this.hasPaid=hasPaid;
    }


    /*The method is used to calculate the pending tuition fee amount. The value of the pending tuition fee amount must be
      set to the attribute remainingAmount.If remainingAmount is Zero then haspaid is true**/
    public boolean billsPayable() {
        double remainingAmount = (getCourseDuration() - numOfMonthsAttended) * getTuitionFee();
        if(remainingAmount ==0){
            hasPaid=true;
        }else{
            hasPaid=false;
        }
        return false;
    }

    /*This is the method named removeStudent where if the value of hasPaid is true set
    the values of date of birth, coursename, student name, date of enrollment, course
    duration, tuition fee and date of drop out to an empty string.**/
    public void removeStudent() {
        if (hasPaid==true) {
            setDateOfBirth("");
            setCourseName("");
            setStudentName("");
            setDateOfEnrollment("");
            setCourseDuration(0);
            setTuitionFee(0);
            this.dateOfDropout="";
            setEnrollmentID(0);
            this.numOfRemainingModules = 0;
            this.numOfMonthsAttended = 0;
            this.remainingAmount=0;

        } else {
            System.out.println("All bills not cleared");
        }
    }

    //Method with display all the details of Regular
    public void display() {
        super.display();
        System.out.println("Num of remaining modules: " + numOfRemainingModules);
        System.out.println("Num of months attended: " + numOfMonthsAttended);
        System.out.println("Dropout date:"+dateOfDropout);
        System.out.println("Remaining Amount:"+remainingAmount);
    }
}