package com.sams.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Student Entity Class
 * 
 * Represents a student in the academic system with personal information,
 * enrollment details, and academic performance metrics.
 * 
 * @author Bhavithran S
 * @version 1.0
 * @since 2024-12-01
 */
public class Student {
    
    // ==================== Instance Variables ====================
    
    /** Unique identifier for student (e.g., STU0001) */
    private String studentId;
    
    /** Student's full name */
    private String name;
    
    /** Student's email address */
    private String email;
    
    /** Student's contact phone number */
    private String phone;
    
    /** Date when student enrolled */
    private LocalDate enrollmentDate;
    
    /** Student's current cumulative GPA (0.0 - 4.0) */
    private double gpa;
    
    /** List of courses student has enrolled in */
    private List<String> enrolledCourses;
    
    /** List of grades received in courses */
    private List<Double> courseGrades;
    
    // ==================== Constructors ====================
    
    /**
     * Default Constructor
     * Initializes student with default values
     */
    public Student() {
        this.studentId = "";
        this.name = "";
        this.email = "";
        this.phone = "";
        this.enrollmentDate = LocalDate.now();
        this.gpa = 0.0;
        this.enrolledCourses = new ArrayList<>();
        this.courseGrades = new ArrayList<>();
    }
    
    /**
     * Parameterized Constructor
     * 
     * @param studentId Unique student identifier
     * @param name Student's full name
     * @param email Student's email address
     * @param phone Student's contact number
     */
    public Student(String studentId, String name, String email, String phone) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.enrollmentDate = LocalDate.now();
        this.gpa = 0.0;
        this.enrolledCourses = new ArrayList<>();
        this.courseGrades = new ArrayList<>();
    }
    
    /**
     * Full Constructor
     * 
     * @param studentId Unique student identifier
     * @param name Student's full name
     * @param email Student's email address
     * @param phone Student's contact number
     * @param enrollmentDate Date of enrollment
     */
    public Student(String studentId, String name, String email, String phone, LocalDate enrollmentDate) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.enrollmentDate = enrollmentDate;
        this.gpa = 0.0;
        this.enrolledCourses = new ArrayList<>();
        this.courseGrades = new ArrayList<>();
    }
    
    // ==================== Getters ====================
    
    /**
     * Gets the student's unique identifier
     * 
     * @return Student ID
     */
    public String getStudentId() {
        return studentId;
    }
    
    /**
     * Gets the student's full name
     * 
     * @return Student's name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Gets the student's email address
     * 
     * @return Student's email
     */
    public String getEmail() {
        return email;
    }
    
    /**
     * Gets the student's phone number
     * 
     * @return Student's phone number
     */
    public String getPhone() {
        return phone;
    }
    
    /**
     * Gets the student's enrollment date
     * 
     * @return Enrollment date
     */
    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }
    
    /**
     * Gets the student's cumulative GPA
     * 
     * @return GPA (0.0 - 4.0)
     */
    public double getGPA() {
        return gpa;
    }
    
    /**
     * Gets the list of enrolled courses
     * 
     * @return List of course codes
     */
    public List<String> getEnrolledCourses() {
        return new ArrayList<>(enrolledCourses);
    }
    
    /**
     * Gets the list of course grades
     * 
     * @return List of grades
     */
    public List<Double> getCourseGrades() {
        return new ArrayList<>(courseGrades);
    }
    
    // ==================== Setters ====================
    
    /**
     * Sets the student's identifier
     * 
     * @param studentId Student ID to set
     */
    public void setStudentId(String studentId) {
        if (studentId != null && !studentId.trim().isEmpty()) {
            this.studentId = studentId;
        }
    }
    
    /**
     * Sets the student's name
     * 
     * @param name Student's name to set
     */
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }
    
    /**
     * Sets the student's email address
     * 
     * @param email Email address to set
     */
    public void setEmail(String email) {
        if (email != null && !email.trim().isEmpty()) {
            this.email = email;
        }
    }
    
    /**
     * Sets the student's phone number
     * 
     * @param phone Phone number to set
     */
    public void setPhone(String phone) {
        if (phone != null && !phone.trim().isEmpty()) {
            this.phone = phone;
        }
    }
    
    /**
     * Sets the student's GPA
     * Valid range: 0.0 to 4.0
     * 
     * @param gpa GPA to set
     */
    public void setGPA(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        }
    }
    
    /**
     * Sets the enrollment date
     * 
     * @param enrollmentDate Enrollment date to set
     */
    public void setEnrollmentDate(LocalDate enrollmentDate) {
        if (enrollmentDate != null && !enrollmentDate.isAfter(LocalDate.now())) {
            this.enrollmentDate = enrollmentDate;
        }
    }
    
    // ==================== Business Methods ====================
    
    /**
     * Adds a course to the student's enrollment
     * 
     * @param courseCode Course code to add
     * @return true if successfully added, false otherwise
     */
    public boolean addCourse(String courseCode) {
        if (courseCode != null && !courseCode.trim().isEmpty()) {
            if (!enrolledCourses.contains(courseCode)) {
                enrolledCourses.add(courseCode);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Removes a course from student's enrollment
     * 
     * @param courseCode Course code to remove
     * @return true if successfully removed, false otherwise
     */
    public boolean removeCourse(String courseCode) {
        return enrolledCourses.remove(courseCode);
    }
    
    /**
     * Checks if student is enrolled in a specific course
     * 
     * @param courseCode Course code to check
     * @return true if enrolled, false otherwise
     */
    public boolean isEnrolledIn(String courseCode) {
        return enrolledCourses.contains(courseCode);
    }
    
    /**
     * Adds a grade for a course
     * 
     * @param grade Grade to add (0.0 - 4.0)
     * @return true if successfully added, false otherwise
     */
    public boolean addGrade(double grade) {
        if (grade >= 0.0 && grade <= 4.0) {
            courseGrades.add(grade);
            calculateGPA();
            return true;
        }
        return false;
    }
    
    /**
     * Calculates the student's cumulative GPA
     * 
     * @return Calculated GPA
     */
    public double calculateGPA() {
        if (courseGrades.isEmpty()) {
            this.gpa = 0.0;
            return 0.0;
        }
        
        double sum = 0.0;
        for (double grade : courseGrades) {
            sum += grade;
        }
        this.gpa = sum / courseGrades.size();
        
        // Round to 2 decimal places
        this.gpa = Math.round(this.gpa * 100.0) / 100.0;
        
        return this.gpa;
    }
    
    /**
     * Gets the academic standing based on GPA
     * 
     * @return Academic standing status
     */
    public String getAcademicStanding() {
        if (gpa >= 3.5) {
            return "Dean's List";
        } else if (gpa >= 2.0) {
            return "Good Standing";
        } else if (gpa >= 1.0) {
            return "Academic Probation";
        } else {
            return "Academic Suspension";
        }
    }
    
    /**
     * Updates student information
     * 
     * @param name New name
     * @param email New email
     * @param phone New phone number
     */
    public void updateInfo(String name, String email, String phone) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
        if (email != null && !email.trim().isEmpty()) {
            this.email = email;
        }
        if (phone != null && !phone.trim().isEmpty()) {
            this.phone = phone;
        }
    }
    
    /**
     * Gets the number of courses enrolled
     * 
     * @return Number of enrolled courses
     */
    public int getCourseCount() {
        return enrolledCourses.size();
    }
    
    /**
     * Clears all course enrollments and grades
     * (Used when deleting student record)
     */
    public void clearRecords() {
        enrolledCourses.clear();
        courseGrades.clear();
        gpa = 0.0;
    }
    
    // ==================== Utility Methods ====================
    
    /**
     * Converts student information to CSV format
     * 
     * @return CSV representation of student
     */
    public String toCSV() {
        return String.format("%s,%s,%s,%s,%s,%.2f",
                studentId, name, email, phone, enrollmentDate, gpa);
    }
    
    /**
     * Parses student information from CSV format
     * 
     * @param csvLine CSV line to parse
     * @return Student object
     */
    public static Student fromCSV(String csvLine) {
        String[] parts = csvLine.split(",");
        if (parts.length >= 6) {
            Student student = new Student();
            student.setStudentId(parts[0].trim());
            student.setName(parts[1].trim());
            student.setEmail(parts[2].trim());
            student.setPhone(parts[3].trim());
            student.setEnrollmentDate(LocalDate.parse(parts[4].trim()));
            student.setGPA(Double.parseDouble(parts[5].trim()));
            return student;
        }
        return null;
    }
    
    /**
     * Returns a formatted string representation of the student
     * 
     * @return String representation
     */
    @Override
    public String toString() {
        return String.format(
                "Student{" +
                "ID='%s', " +
                "Name='%s', " +
                "Email='%s', " +
                "Phone='%s', " +
                "Enrolled='%s', " +
                "GPA=%.2f, " +
                "Status='%s'" +
                "}",
                studentId, name, email, phone, enrollmentDate, gpa, getAcademicStanding()
        );
    }
    
    /**
     * Checks equality based on student ID
     * 
     * @param obj Object to compare
     * @return true if same student ID
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return studentId.equals(student.studentId);
    }
    
    /**
     * Hash code based on student ID
     * 
     * @return Hash code
     */
    @Override
    public int hashCode() {
        return studentId.hashCode();
    }
}
