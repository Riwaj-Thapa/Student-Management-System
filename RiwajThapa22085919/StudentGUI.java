import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class StudentGUI {
    private static ArrayList<Student> arrayList = new ArrayList<Student>();

    private boolean enrollmentID_Check(int enrollmentID) {
        for (Student student : arrayList) {
            if (student.getEnrollmentID() == enrollmentID) {
                return true;
            }
        }
        return false;
    }

    public void creatingGUI() {
        // Create a new frame
        JFrame frame = new JFrame("Student Management System");

        // Declare
        String years[] = { "Select year", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998",
                "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011",
                "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024",
                "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037",
                "2038", "2039", "2040" };
        String months[] = { "Select month", "January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December" };
        String days[] = { "Select day", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13",
                "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30",
                "31", "32" };

        // Create a big label at the top
        JLabel titleLabel = new JLabel("Student Details");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 35));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Create mainPanel to hold titleLabel and subPanel
        JPanel mainPanel = new JPanel(new BorderLayout());

        // Create subPanel to hold panels side by side
        JPanel subPanel = new JPanel(new GridLayout(1, 2, 5, 0)); // Horizontal spacing between panels
        // Create and configure panel1
        JPanel panel1 = new JPanel();
        JLabel panel2 = new JLabel();

        GridBagLayout layout1 = new GridBagLayout();
        panel1.setLayout(layout1);
        GridBagConstraints gbc1 = new GridBagConstraints();
        gbc1.insets = new Insets(5, 5, 5, 5);

        GridBagLayout layout2 = new GridBagLayout();
        panel2.setLayout(layout2);
        GridBagConstraints gbc2 = new GridBagConstraints();
        gbc2.insets = new Insets(5, 5, 5, 5);

        // First Panel
        // Row1
        JLabel nameLabel = new JLabel("Student Name:");
        gbc1.gridx = 0;
        gbc1.gridy = 0;
        panel1.add(nameLabel, gbc1);
        JTextField nameTextField = new JTextField(25);
        gbc1.gridx = 2;
        panel1.add(nameTextField, gbc1);

        // Row 2
        JLabel enrollmentIDLabel = new JLabel("Enrollment ID  :");
        gbc1.gridx = 0;
        gbc1.gridy = 1;
        panel1.add(enrollmentIDLabel, gbc1);
        JTextField enrollmentIDTextField = new JTextField(25);
        gbc1.gridx = 2;
        panel1.add(enrollmentIDTextField, gbc1);

        // Row 3
        JLabel dateOfEnrollment = new JLabel("Enrollment Date:");
        gbc1.gridx = 0;
        gbc1.gridy = 2;
        panel1.add(dateOfEnrollment, gbc1);
        JComboBox<String> yearsComboBox2 = new JComboBox<>(years);
        JComboBox<String> monthsComboBox2 = new JComboBox<>(months);
        JComboBox<String> daysComboBox2 = new JComboBox<>(days);
        gbc1.gridx = 1;
        panel1.add(yearsComboBox2, gbc1);
        gbc1.gridx = 2;
        panel1.add(monthsComboBox2, gbc1);
        gbc1.gridx = 3;
        panel1.add(daysComboBox2, gbc1);

        // Row 4
        JLabel courseNameLabel = new JLabel("Course Name:");
        gbc1.gridx = 0;
        gbc1.gridy = 3;
        panel1.add(courseNameLabel, gbc1);
        JTextField courseNameTextField = new JTextField(25);
        gbc1.gridx = 2;
        panel1.add(courseNameTextField, gbc1);

        // Row 5
        JLabel courseDurationLabel = new JLabel("Course Duration (months) :");
        gbc1.gridx = 0;
        gbc1.gridy = 4;
        panel1.add(courseDurationLabel, gbc1);
        JTextField courseDurationTextField = new JTextField(25);
        gbc1.gridx = 2;
        panel1.add(courseDurationTextField, gbc1);

        // Row 6
        JLabel dateOfBirth = new JLabel("Birth Date :");
        gbc1.gridx = 0;
        gbc1.gridy = 5;
        panel1.add(dateOfBirth, gbc1);
        JComboBox<String> yearsComboBox1 = new JComboBox<>(years);
        JComboBox<String> monthsComboBox1 = new JComboBox<>(months);
        JComboBox<String> daysComboBox1 = new JComboBox<>(days);
        gbc1.gridx = 1;
        panel1.add(yearsComboBox1, gbc1);
        gbc1.gridx = 2;
        panel1.add(monthsComboBox1, gbc1);
        gbc1.gridx = 3;
        panel1.add(daysComboBox1, gbc1);

        // Row 7
        JLabel numDaysPresentLabel = new JLabel(" Days Present:");
        gbc1.gridx = 0;
        gbc1.gridy = 6;
        panel1.add(numDaysPresentLabel, gbc1);
        JTextField numDaysPresentTextField = new JTextField(25);
        gbc1.gridx = 2;
        panel1.add(numDaysPresentTextField, gbc1);

        // Row 8
        JButton addRegularButton = new JButton("Add Regular Student");
        addRegularButton.setPreferredSize(new Dimension(180, 35));
        gbc1.gridx = 1;
        gbc1.gridy = 7;
        gbc1.gridwidth = 2;
        panel1.add(addRegularButton, gbc1);

        // Row 9
        JButton addDropoutButton = new JButton("Add Dropout Student");
        addDropoutButton.setPreferredSize(new Dimension(180, 35));
        gbc1.gridx = 1;
        gbc1.gridy = 8;
        gbc1.gridwidth = 2;
        panel1.add(addDropoutButton, gbc1);

        // Row 10
        JButton removeDropoutStudent = new JButton("Remove DropoutStudent");
        removeDropoutStudent.setPreferredSize(new Dimension(180, 35));
        gbc1.gridx = 1;
        gbc1.gridy = 9;
        gbc1.gridwidth = 2;
        panel1.add(removeDropoutStudent, gbc1);

        // Row 11
        JButton billsOfDropoutStudent = new JButton("Bills of Dropout Student");
        billsOfDropoutStudent.setPreferredSize(new Dimension(180, 35));
        gbc1.gridx = 1;
        gbc1.gridy = 10;
        gbc1.gridwidth = 2;
        panel1.add(billsOfDropoutStudent, gbc1);

        // Second Panel
        // Row 1
        JLabel numModulesLabel = new JLabel("Num 0f Modules:");
        gbc2.gridx = 0;
        gbc2.gridy = 0;
        panel2.add(numModulesLabel, gbc2);
        JTextField numModulesTextField = new JTextField(25);
        gbc2.gridx = 2;
        panel2.add(numModulesTextField, gbc2);

        // Row 2
        JLabel numMonthsAttendedLabel = new JLabel("Months Attended:");
        gbc2.gridx = 0;
        gbc2.gridy = 1;
        panel2.add(numMonthsAttendedLabel, gbc2);
        JTextField numMonthsAttendedTextField = new JTextField(25);
        gbc2.gridx = 2;
        panel2.add(numMonthsAttendedTextField, gbc2);

        // Row 3
        JLabel dateOfDropout = new JLabel("Dropout Date :");
        gbc2.gridx = 0;
        gbc2.gridy = 2;
        panel2.add(dateOfDropout, gbc2);
        JComboBox<String> yearsComboBox3 = new JComboBox<>(years);
        JComboBox<String> monthsComboBox3 = new JComboBox<>(months);
        JComboBox<String> daysComboBox3 = new JComboBox<>(days);
        gbc2.gridx = 1;
        panel2.add(yearsComboBox3, gbc2);
        gbc2.gridx = 2;
        panel2.add(monthsComboBox3, gbc2);
        gbc2.gridx = 3;
        panel2.add(daysComboBox3, gbc2);

        // Row 4
        JLabel tuitionFeeLabel = new JLabel("Tuition Fee:");
        gbc2.gridx = 0;
        gbc2.gridy = 3;
        panel2.add(tuitionFeeLabel, gbc2);
        JTextField tuitionFeeTextField = new JTextField(25);
        gbc2.gridx = 2;
        panel2.add(tuitionFeeTextField, gbc2);

        // Row 5
        JLabel numCreditHoursLabel = new JLabel(" Credit Hours:");
        gbc2.gridx = 0;
        gbc2.gridy = 4;
        panel2.add(numCreditHoursLabel, gbc2);
        JTextField numCreditHoursTextField = new JTextField(25);
        gbc2.gridx = 2;
        panel2.add(numCreditHoursTextField, gbc2);

        // Row 6
        JLabel numRemainingModulesLabel = new JLabel("Remaining Modules:");
        gbc2.gridx = 0;
        gbc2.gridy = 5;
        panel2.add(numRemainingModulesLabel, gbc2);
        JTextField numRemainingModulesTextField = new JTextField(25);
        gbc2.gridx = 2;
        panel2.add(numRemainingModulesTextField, gbc2);

        // Row 7
        JLabel remainingAmountLabel = new JLabel("Remaining Amount:");
        gbc2.gridx = 0;
        gbc2.gridy = 6;
        panel2.add(remainingAmountLabel, gbc2);
        JTextField remainingAmountTextField1 = new JTextField(25);
        gbc2.gridx = 2;
        panel2.add(remainingAmountTextField1, gbc2);

        // Row 8
        JButton percentageCalculate = new JButton("Present Percentage");
        percentageCalculate.setPreferredSize(new Dimension(180, 35));
        gbc2.gridx = 1;
        gbc2.gridy = 7;
        gbc2.gridwidth = 2;
        panel2.add(percentageCalculate, gbc2);

        // Row 9
        JButton grantCertificate = new JButton("Grant Certificate");
        grantCertificate.setPreferredSize(new Dimension(180, 35));
        gbc2.gridx = 1;
        gbc2.gridy = 8;
        gbc2.gridwidth = 2;
        panel2.add(grantCertificate, gbc2);

        // Row 10
        JButton clearButton = new JButton("Clear Button");
        clearButton.setPreferredSize(new Dimension(180, 35));
        gbc2.gridx = 1;
        gbc2.gridy = 9;
        gbc2.gridwidth = 2;
        panel2.add(clearButton, gbc2);

        // Row 11
        JButton displayInformation = new JButton(" Display ");
        displayInformation.setPreferredSize(new Dimension(180, 35));
        gbc2.gridx = 1;
        gbc2.gridy = 10;
        gbc2.gridwidth = 2;
        panel2.add(displayInformation, gbc2);

        addRegularButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Try-Catch
                try {
                    // Get the enrollment ID from the text field
                    int enrollmentID = Integer.parseInt(enrollmentIDTextField.getText());
                    // Check if the enrollment ID already exists
                    if (enrollmentID_Check(enrollmentID)) {
                        JOptionPane.showMessageDialog(frame,
                                "Student with Enrollment ID " + enrollmentID + " already exists.");

                    } else {
                        // Get student and course information from text fields
                        String studentName = nameTextField.getText();
                        String courseName = courseNameTextField.getText();
                        // Check if course name is empty
                        if (courseName.isEmpty()) {
                            JOptionPane.showMessageDialog(frame, "Error :- !! Fill up the Text Field and ComboBox !!");
                        } else {
                            int courseDuration;
                            double tuitionFee;
                            int numOfModules;
                            int numOfCreditHours;
                            double daysPresent;
                            // Try to parse numeric values for course information

                            try {
                                courseDuration = Integer.parseInt(courseDurationTextField.getText());
                                tuitionFee = Double.parseDouble(tuitionFeeTextField.getText());
                                numOfModules = Integer.parseInt(numModulesTextField.getText());
                                numOfCreditHours = Integer.parseInt(numCreditHoursTextField.getText());
                                daysPresent = Double.parseDouble(numDaysPresentTextField.getText());
                            } catch (NumberFormatException ex) {
                                JOptionPane.showMessageDialog(frame,
                                        "Error: Please enter valid numeric values for course duration, tuition fee, number of modules, number of credit hours, and days present.");
                                return;
                            }
                            // Check if course information values are positive
                            if (courseDuration <= 0 || tuitionFee <= 0 || numOfModules <= 0 || numOfCreditHours <= 0
                                    || daysPresent <= 0) {
                                JOptionPane.showMessageDialog(frame,
                                        "Error: Please enter positive values for course duration, tuition fee, number of modules, number of credit hours, and days present.");
                            } else {

                                // Get the selected data from the combo boxes
                                int selectedMonthIndex1 = monthsComboBox1.getSelectedIndex();
                                int selectedYearIndex1 = yearsComboBox1.getSelectedIndex();
                                int selectedDaysIndex1 = daysComboBox1.getSelectedIndex();
                                int selectedMonthIndex2 = monthsComboBox2.getSelectedIndex();
                                int selectedYearIndex2 = yearsComboBox2.getSelectedIndex();
                                int selectedDaysIndex2 = daysComboBox2.getSelectedIndex();
                                // Check if valid dates are selected

                                if (selectedMonthIndex1 != 0 && selectedYearIndex1 != 0 && selectedDaysIndex1 != 0 &&
                                        selectedMonthIndex2 != 0 && selectedYearIndex2 != 0
                                        && selectedDaysIndex2 != 0) {
                                    // Extract selected date components

                                    String selectedYear1 = (String) yearsComboBox1.getSelectedItem();
                                    String selectedMonth1 = (String) monthsComboBox1.getSelectedItem();
                                    String selectedDay1 = (String) daysComboBox1.getSelectedItem();
                                    String dateOfBirth = selectedYear1 + " " + selectedMonth1 + " " + selectedDay1
                                            + " ";
                                    String selectedYear2 = (String) yearsComboBox2.getSelectedItem();
                                    String selectedMonth2 = (String) monthsComboBox2.getSelectedItem();
                                    String selectedDay2 = (String) daysComboBox2.getSelectedItem();
                                    String dateOfEnrollment = selectedYear2 + " " + selectedMonth2 + " " + selectedDay2
                                            + " ";

                                    // Create a Regular student object
                                    Regular regularStudent = new Regular(enrollmentID, dateOfBirth, courseName,
                                            studentName, dateOfEnrollment, courseDuration, tuitionFee, numOfModules,
                                            numOfCreditHours, daysPresent);

                                    // Add the student to the list
                                    arrayList.add(regularStudent);
                                    JOptionPane.showMessageDialog(frame,
                                            " Congratulation !! Regular Student has been added ");

                                } else {
                                    JOptionPane.showMessageDialog(frame, "Error:- !!! Please select a valid Date !!! ");
                                }
                            }
                        }

                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Error fill the valid numeric value ");
                }

            }
        }

        );
        addDropoutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Try-Catch
                try {
                    // Get the enrollment ID from the text field
                    int enrollmentID = Integer.parseInt(enrollmentIDTextField.getText());
                    // Check if the enrollment ID already exists for regular students
                    if (enrollmentID_Check(enrollmentID)) {
                        JOptionPane.showMessageDialog(frame,
                                "Regular Student with Enrollment ID " + enrollmentID + " already exists.");
                    } else {
                        String studentName = nameTextField.getText();
                        String courseName = courseNameTextField.getText();

                        int courseDuration;
                        double tuitionFee;
                        int numOfRemainingModules;
                        int numOfMonthsAttended;
                        // Try to parse numeric values for course information

                        try {
                            courseDuration = Integer.parseInt(courseDurationTextField.getText());
                            tuitionFee = Double.parseDouble(tuitionFeeTextField.getText());
                            numOfRemainingModules = Integer.parseInt(numRemainingModulesTextField.getText());
                            numOfMonthsAttended = Integer.parseInt(numMonthsAttendedTextField.getText());
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(frame,
                                    "Error: Please enter valid numeric values for course duration, tuition fee,num of Remaining Modules and num of Months Attended");
                            return;
                        }
                        // Check if course information values are positive

                        if (courseDuration <= 0 || tuitionFee <= 0 || numOfRemainingModules <= 0
                                || numOfMonthsAttended <= 0) {
                            JOptionPane.showMessageDialog(frame,
                                    "Error: Please enter positive values for course duration, tuition fee, number of modules, number of credit hours, and days present.");
                        } else {

                            // Get the selected data from the combo boxes
                            int selectedMonthIndex1 = monthsComboBox1.getSelectedIndex();
                            int selectedYearIndex1 = yearsComboBox1.getSelectedIndex();
                            int selectedDaysIndex1 = daysComboBox1.getSelectedIndex();
                            int selectedMonthIndex2 = monthsComboBox2.getSelectedIndex();
                            int selectedYearIndex2 = yearsComboBox2.getSelectedIndex();
                            int selectedDaysIndex2 = daysComboBox2.getSelectedIndex();
                            int selectedMonthIndex3 = monthsComboBox3.getSelectedIndex();
                            int selectedYearIndex3 = yearsComboBox3.getSelectedIndex();
                            int selectedDaysIndex3 = daysComboBox3.getSelectedIndex();
                            // Check if valid dates are selected for enrollment and dropout

                            if (selectedMonthIndex1 != 0 && selectedYearIndex1 != 0 && selectedDaysIndex1 != 0 &&
                                    selectedMonthIndex2 != 0 && selectedYearIndex2 != 0 && selectedDaysIndex2 != 0 &&
                                    selectedMonthIndex3 != 0 && selectedYearIndex3 != 0 && selectedDaysIndex3 != 0) {
                                // Extract selected date components

                                String selectedYear1 = (String) yearsComboBox1.getSelectedItem();
                                String selectedMonth1 = (String) monthsComboBox1.getSelectedItem();
                                String selectedDay1 = (String) daysComboBox1.getSelectedItem();
                                String dateOfBirth = selectedYear1 + " " + selectedMonth1 + " " + selectedDay1 + " ";
                                String selectedYear2 = (String) yearsComboBox2.getSelectedItem();
                                String selectedMonth2 = (String) monthsComboBox2.getSelectedItem();
                                String selectedDay2 = (String) daysComboBox2.getSelectedItem();
                                String dateOfEnrollment = selectedYear2 + " " + selectedMonth2 + " " + selectedDay2
                                        + " ";
                                String selectedYear3 = (String) yearsComboBox3.getSelectedItem();
                                String selectedMonth3 = (String) monthsComboBox3.getSelectedItem();
                                String selectedDay3 = (String) daysComboBox3.getSelectedItem();
                                String dateOfDropout = selectedYear3 + " " + selectedMonth3 + " " + selectedDay3 + " ";

                                // Create a Dropout student object
                                Dropout dropoutStudent = new Dropout(enrollmentID, courseName, dateOfEnrollment,
                                        dateOfBirth,
                                        studentName, courseDuration, tuitionFee, numOfRemainingModules,
                                        numOfMonthsAttended, dateOfDropout);
                                // Add the Dropout student to the list
                                arrayList.add(dropoutStudent);
                                JOptionPane.showMessageDialog(frame,
                                        " Congratulation !! Dropout Student has been added ");
                                Integer.parseInt(enrollmentIDTextField.getText());

                            } else {
                                JOptionPane.showMessageDialog(frame, "Error:- !!! Please select a valid Date !!! ");
                            }
                        }
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Error :- !! Fill up the Text Field and ComboBox !!");
                }
            }

        });
        displayInformation.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create a StringBuilder to hold the information
                StringBuilder info = new StringBuilder("Student Information:\n\n");
                // Loop through each student in the arrayList
                for (Student student : arrayList) {
                    // Check if the student is a Regular or Dropout
                    if (student instanceof Regular) {
                        info.append("Regular Student\n");
                    } else if (student instanceof Dropout) {
                        info.append("Dropout Student\n");
                    }
                    // Append common student information
                    info.append("Student Name : ").append(student.getStudentName()).append("\n");
                    info.append("Enrollment ID : ").append(student.getEnrollmentID()).append("\n");
                    info.append("Date of Birth :").append(student.getDateOfBirth()).append("\n");
                    info.append("Date of Enrollment : ").append(student.getDateOfEnrollment()).append("\n");
                    // Append specific information based on the student type
                    if (student instanceof Regular) {
                        Regular regularStudent = (Regular) student;
                        info.append("Course Name : ").append(regularStudent.getCourseName()).append("\n");
                        info.append("Course Duration : ").append(regularStudent.getCourseDuration()).append("\n");
                        info.append("Days Present : ").append(regularStudent.getDaysPresent()).append("\n\n\n");
                    } else if (student instanceof Dropout) {
                        Dropout dropoutStudent = (Dropout) student;
                        info.append("Remaining Modules : ").append(dropoutStudent.getNumOfRemainingModules())
                                .append("\n");
                        info.append("Months Attended : ").append(dropoutStudent.getNumOfMonthsAttended()).append("\n");
                        info.append("Date of Dropout :").append(dropoutStudent.getDateOfDropout()).append("\n\n\n");
                        info.append("\n");
                    }
                }
                // Create a JTextArea to display the information
                JTextArea textArea = new JTextArea(info.toString());
                textArea.setEditable(false);
                // Create a scrollable pane for the JTextArea
                JScrollPane scrollPane = new JScrollPane(textArea);
                scrollPane.setPreferredSize(new Dimension(400, 400));
                // Show the information in a JOptionPane dialog
                JOptionPane.showMessageDialog(frame, scrollPane, "Student Information",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Clear When this button is pressed, the values from text fields are cleared.
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                // Clear the text fields
                nameTextField.setText("");
                enrollmentIDTextField.setText("");
                tuitionFeeTextField.setText("");
                numModulesTextField.setText("");
                numCreditHoursTextField.setText("");
                numRemainingModulesTextField.setText("");
                numMonthsAttendedTextField.setText("");
                numDaysPresentTextField.setText("");
                courseNameTextField.setText("");
                courseDurationTextField.setText("");
                remainingAmountTextField1.setText("");

                // Reset combo boxes
                yearsComboBox1.setSelectedIndex(0);
                monthsComboBox1.setSelectedIndex(0);
                daysComboBox1.setSelectedIndex(0);
                yearsComboBox2.setSelectedIndex(0);
                monthsComboBox2.setSelectedIndex(0);
                daysComboBox2.setSelectedIndex(0);
                yearsComboBox3.setSelectedIndex(0);
                monthsComboBox3.setSelectedIndex(0);
                daysComboBox3.setSelectedIndex(0);
            }
        });

        percentageCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create an instance of the StudentGUI class
                StudentGUI studentGUI = new StudentGUI();
                // Call the presentPercentage method of the StudentGUI instance
                studentGUI.presentPercentage();
            }
        });

        grantCertificate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create an instance of the StudentGUI class
                StudentGUI studentGUI = new StudentGUI();
                // Call the grantCertificate method of the StudentGUI instance
                studentGUI.grantCertificatee();
            }
        });

        billsOfDropoutStudent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create an instance of the StudentGUI class
                StudentGUI studentGUI = new StudentGUI();
                // Call the billsOfDropoutStudent method of the StudentGUI instance
                studentGUI.billsPayable();
            }
        });

        removeDropoutStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create an instance of the StudentGUI class
                StudentGUI studentGUI = new StudentGUI();
                // Call the removeDropoutStudent method of the StudentGUI instance
                studentGUI.removeDropoutStudents();
            }
        });

        // Adding panel1 and panel2 to subPanel
        subPanel.add(panel1);
        subPanel.add(panel2);
        // Adding titleLabel to the top (NORTH) of the mainPanel
        mainPanel.add(titleLabel, BorderLayout.NORTH);
        // Adding subPanel to the center of the mainPanel
        mainPanel.add(subPanel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1800, 1200);
        frame.add(mainPanel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Create an instance of the StudentGUI class
        StudentGUI obj = new StudentGUI();
        // Call the creatingGUI method of the StudentGUI instance
        obj.creatingGUI();

    }

    public void presentPercentage() {

        // Create a new JFrame for the percentage calculation interface
        JFrame frame2 = new JFrame();
        // Create a JPanel to hold components
        JPanel panel3 = new JPanel();
        // Create a GridBagLayout for the panel
        GridBagLayout layout5 = new GridBagLayout();
        panel3.setLayout(layout5);
        GridBagConstraints gbc5 = new GridBagConstraints();
        gbc5.insets = new Insets(5, 5, 5, 5);
        // Create and add components to the panel
        JLabel enrollmentIDLabel1 = new JLabel("Enrollment ID  :");
        panel3.add(enrollmentIDLabel1, gbc5);
        gbc5.gridx = 0;
        gbc5.gridy = 0;
        JTextField enrollmentIDTextField1 = new JTextField(25);
        gbc5.gridx = 1;
        panel3.add(enrollmentIDTextField1, gbc5);
        JLabel numDaysPresentLabel = new JLabel(" Days Present:");
        gbc5.gridx = 0;
        gbc5.gridy = 1;
        panel3.add(numDaysPresentLabel, gbc5);
        JTextField numDaysPresentTextField1 = new JTextField(25);
        gbc5.gridx = 1;
        panel3.add(numDaysPresentTextField1, gbc5);

        JButton persentPercentage = new JButton("percentageCalculate ");
        gbc5.gridy = 2;
        gbc5.gridx = 0;
        gbc5.gridwidth = 2;
        panel3.add(persentPercentage, gbc5);

        // ActionListener for the percentage calculation button
        persentPercentage.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Try-Catch block to handle exceptions
                try {
                    // Get input values
                    int enrollmentID2 = Integer.parseInt(enrollmentIDTextField1.getText());
                    double numOfDaysPresent = Double.parseDouble(numDaysPresentTextField1.getText());
                    // Flag to check if a regular student was found
                    boolean regular = false;
                    // Iterate through the arrayList to find the student
                    for (Student student : arrayList) {
                        if (student instanceof Regular && student.getEnrollmentID() == enrollmentID2) {
                            // Cast the student to Regular type
                            Regular regularStudent = (Regular) student;
                            // Calculate the grade based on percentage
                            String grade = regularStudent.presentPercentage(numOfDaysPresent);
                            if (!grade.isEmpty()) {
                                JOptionPane.showMessageDialog(frame2, " GRADE Obtained : " + grade);
                            } else {
                                JOptionPane.showMessageDialog(frame2, "Invalid input");
                            }
                            // Mark that a regular student was found
                            regular = true;
                            break;
                        }
                    }
                    // If a regular student wasn't found
                    if (!regular) {
                        JOptionPane.showMessageDialog(frame2,
                                "!! Regular student with Enrollment ID " + enrollmentID2 + " not found !!");
                    }

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame2,
                            "!! Error Please fill up the given form correctly to calculate present Grade !!");
                }
            }

        });
        // Add the panel3 to the frame2
        frame2.add(panel3);
        // Set the frame2 to be visible
        frame2.setVisible(true);
        // Set the size of frame2
        frame2.setSize(700, 500);
    }

    // Method for granting certificates
    public void grantCertificatee() {
        // Create a new JFrame for the certificate granting interface
        JFrame frame = new JFrame();
        // Create a new JPanel to hold the components
        JPanel panel4 = new JPanel();
        // Create a GridBagLayout for the panel
        GridBagLayout layout6 = new GridBagLayout();
        panel4.setLayout(layout6);
        GridBagConstraints gbc6 = new GridBagConstraints();
        gbc6.insets = new Insets(5, 5, 5, 5);
        // Arrays for year, month, and day options
        String years2[] = { "Select year", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998",
                "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011",
                "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024",
                "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037",
                "2038", "2039", "2040" };
        String months2[] = { "Select month", "January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December" };
        String days2[] = { "Select day", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13",
                "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30",
                "31", "32" };
        // Create and add components to the panel
        JLabel enrollmentIDLabel3 = new JLabel("Enrollment ID  :");
        panel4.add(enrollmentIDLabel3, gbc6);

        gbc6.gridx = 0;
        gbc6.gridy = 0;
        JTextField enrollmentIDTextField3 = new JTextField(25);
        gbc6.gridx = 2;
        panel4.add(enrollmentIDTextField3, gbc6);

        JLabel courseName3 = new JLabel(" Course Name :");
        gbc6.gridx = 0;
        gbc6.gridy = 1;
        panel4.add(courseName3, gbc6);
        JTextField courseNameTextField3 = new JTextField(25);
        gbc6.gridx = 2;
        panel4.add(courseNameTextField3, gbc6);

        JLabel dateOfEnrollment2 = new JLabel("Enrollment Date:");
        gbc6.gridx = 0;
        gbc6.gridy = 2;
        panel4.add(dateOfEnrollment2, gbc6);

        JComboBox yearsComboBox4 = new JComboBox(years2);
        JComboBox monthsComboBox4 = new JComboBox(months2);
        JComboBox daysComboBox4 = new JComboBox(days2);
        gbc6.gridx = 1;
        panel4.add(yearsComboBox4, gbc6);
        gbc6.gridx = 2;
        panel4.add(monthsComboBox4, gbc6);
        gbc6.gridx = 3;
        panel4.add(daysComboBox4, gbc6);

        JButton grantCertificate = new JButton("Grant Certificate:");
        grantCertificate.setPreferredSize(new Dimension(180, 35));
        gbc6.gridx = 1;
        gbc6.gridy = 5;
        gbc6.gridwidth = 2;
        panel4.add(grantCertificate, gbc6);

        // ActionListener for the grant certificate button
        grantCertificate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (enrollmentIDTextField3.getText().equals("") || courseNameTextField3.getText().equals("")
                        || yearsComboBox4.getSelectedIndex() == 0 ||
                        monthsComboBox4.getSelectedIndex() == 0 || daysComboBox4.getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(frame, "Please Fill The Textfield");
                } else {
                    try {
                        // Get input values
                        String enrollmentId = enrollmentIDTextField3.getText();
                        String courseName = courseNameTextField3.getText();
                        String dateOfEnrollment = yearsComboBox4.getSelectedItem() + "-"
                                + monthsComboBox4.getSelectedItem() + "-" + daysComboBox4.getSelectedItem();

                        // Type Conversion
                        int enrollmentId3 = Integer.parseInt(enrollmentId);
                        boolean scholarship = false;
                        for (Student student : arrayList) {
                            if (student instanceof Regular && student.getEnrollmentID() == enrollmentId3) {
                                // Cast student to Regular type
                                Regular regularStudent = (Regular) student;
                                // Call the grantCertificate method
                                regularStudent.grantCertificate(courseName, enrollmentId3, dateOfEnrollment);
                                if (regularStudent.getIsGrantedScholarship() == true) {
                                    JOptionPane.showMessageDialog(frame,
                                            "EnrollmentID " + enrollmentIDTextField3.getText() + " has graduated in "
                                                    + courseNameTextField3.getText() + " and date of enrollment was "
                                                    + daysComboBox4.getSelectedItem() + "-"
                                                    + monthsComboBox4.getSelectedItem() + "-"
                                                    + yearsComboBox4.getSelectedItem());
                                    JOptionPane.showMessageDialog(frame, "Scholarship has been granted ");
                                } else {
                                    JOptionPane.showMessageDialog(frame,
                                            "EnrollmentID " + enrollmentIDTextField3.getText() + " has graduated in "
                                                    + courseNameTextField3.getText() + " and date of enrollment was "
                                                    + daysComboBox4.getSelectedItem() + "-"
                                                    + monthsComboBox4.getSelectedItem() + "-"
                                                    + yearsComboBox4.getSelectedItem());
                                    JOptionPane.showMessageDialog(frame,
                                            "Scholarship has not been granted due to insufficient GRADE ");
                                }

                                scholarship = true;
                                break;
                            }
                        }
                        if (!scholarship) {
                            JOptionPane.showMessageDialog(frame, "Enrollment ID not found.");

                        }
                    } catch (Exception e1) {
                        JOptionPane.showMessageDialog(frame, "Invalid");
                    }
                }
            }
        });

        // Add the panel4 to the frame
        frame.add(panel4);
        // Set the frame to be visible
        frame.setVisible(true);
        // Set the size of the frame
        frame.setSize(700, 500);
    }

    // Method for handling bills payable
    public void billsPayable() {
        // Create a new JFrame for the bills payable interface
        JFrame frame = new JFrame();
        // Create a new JPanel to hold the components
        JPanel panel5 = new JPanel();
        // Create a GridBagLayout for the panel
        GridBagLayout layout7 = new GridBagLayout();
        panel5.setLayout(layout7);
        GridBagConstraints gbc7 = new GridBagConstraints();
        gbc7.insets = new Insets(5, 5, 5, 5);
        // Create and add components to the panel
        JLabel enrollmentID5 = new JLabel("Enrollment ID:");
        panel5.add(enrollmentID5, gbc7);
        gbc7.gridx = 0;
        gbc7.gridy = 0;

        JTextField enrollmentTextField2 = new JTextField(25);
        gbc7.gridx = 1;
        gbc7.gridwidth = 2;
        panel5.add(enrollmentTextField2, gbc7);

        JButton billsPayable = new JButton("Bills Payable:");
        billsPayable.setPreferredSize(new Dimension(180, 35));
        gbc7.gridy = 1;
        gbc7.gridx = 1;
        gbc7.gridwidth = 2;
        panel5.add(billsPayable, gbc7);
        JTextField remainingAmountTextFeild1 = new JTextField(25);
        // ActionListener for the bills payable button
        billsPayable.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (enrollmentTextField2.getText().equals("")) {
                    JOptionPane.showMessageDialog(frame, "Please enter id to check");
                } else {
                    try {
                        // Get input value
                        String enrollmentId = enrollmentTextField2.getText();

                        // Type Conversion
                        int enrollmentIdd = Integer.parseInt(enrollmentId);

                        boolean billpay = false;
                        for (Student dropoutStudent : arrayList) {
                            if (dropoutStudent instanceof Dropout
                                    && dropoutStudent.getEnrollmentID() == enrollmentIdd) {
                                // Cast student to Dropout type
                                Dropout student = (Dropout) dropoutStudent;
                                // Call the billsPayable method
                                ((Dropout) dropoutStudent).billsPayable();
                                // Set the remaining amount in the text field
                                remainingAmountTextFeild1
                                        .setText(((Dropout) dropoutStudent).getRemainingAmount() + "0");
                                if (((Dropout) dropoutStudent).getHasPaid() == true) {
                                    JOptionPane.showMessageDialog(frame, "Bill has been paid");
                                } else {
                                    JOptionPane.showMessageDialog(frame, "Bill has to paid");
                                }
                                billpay = true;
                                break;
                            }
                        }
                        if (!billpay) {
                            JOptionPane.showMessageDialog(frame, "Dropout Student with Enrollment ID "
                                    + enrollmentTextField2.getText() + " not found.");

                        }
                    } catch (Exception e1) {
                        JOptionPane.showMessageDialog(frame, "Invalid input. Please enter valid numbers.");
                    }

                }
            }
        });
        // Add the panel5 to the frame
        frame.add(panel5);
        // Set the frame to be visible
        frame.setVisible(true);
        // Set the size of the frame
        frame.setSize(700, 500);
    }

    // Method for removing dropout students
    public void removeDropoutStudents() {
        // Create a new JFrame for the remove dropout students
        JFrame frame = new JFrame();
        // Create a new JPanel to hold the components
        JPanel panel6 = new JPanel();
        // Create a GridBagLayout for the panel
        GridBagLayout layout8 = new GridBagLayout();
        panel6.setLayout(layout8);
        GridBagConstraints gbc8 = new GridBagConstraints();
        gbc8.insets = new Insets(5, 5, 5, 5);
        // Creating and adding components to the panel
        JLabel enrollmentID6 = new JLabel("Enrollment ID:");
        panel6.add(enrollmentID6, gbc8);
        gbc8.gridx = 0;
        gbc8.gridy = 0;

        JTextField enrollmentTextField3 = new JTextField(25);
        gbc8.gridx = 1;
        gbc8.gridwidth = 2;
        panel6.add(enrollmentTextField3, gbc8);

        JButton removeDropoutStudents = new JButton("Remove Dropout");
        removeDropoutStudents.setPreferredSize(new Dimension(180, 35));
        gbc8.gridy = 1;
        gbc8.gridx = 1;
        gbc8.gridwidth = 2;
        panel6.add(removeDropoutStudents, gbc8);

        // ActionListener for the remove dropout students button
        removeDropoutStudents.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Try catch
                try {
                    String enrollmentId = enrollmentTextField3.getText();

                    int enroll = Integer.parseInt(enrollmentId);
                    boolean found = false;
                    for (Student removeStudent : arrayList) {
                        if (removeStudent instanceof Dropout && removeStudent.getEnrollmentID() == enroll) {
                            Dropout dropout = (Dropout) removeStudent;
                            dropout.removeStudent();
                            if (dropout.getHasPaid() == false) {
                                arrayList.remove(removeStudent);
                                JOptionPane.showMessageDialog(frame,
                                        "Dropout student with the given Enrollment ID removed successfully!");
                            } else {
                                JOptionPane.showMessageDialog(frame, "No need to remove");
                            }
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        JOptionPane.showMessageDialog(frame,
                                "Dropout Student with Enrollment ID " + enrollmentTextField3.getText() + " not found.");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid input. Please enter valid numbers.");
                }
            }
        });
        frame.add(panel6);
        frame.setVisible(true);
        frame.setSize(700, 500);
    }
}
