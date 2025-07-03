package javaonlypractice;

public class java9 {

   static class Student {
        private String name;
        private int rollNumber;
        private char grade;
        public String getName() {
            return name;
        }
        public void setName(String name1) {
            name = name1;
        }
        public int getRollNumber() {
            return rollNumber;
        }
        public void setRollNumber(int rollNumber1) {
            rollNumber = rollNumber1;
        }
        public char getGrade() {
            return grade;
        }
        public void setGrade(char grade1) {
            grade = grade1;
        }
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Alice");
        student.setRollNumber(101);
        student.setGrade('A');
        System.out.println("Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Grade: " + student.getGrade());
    }
}
