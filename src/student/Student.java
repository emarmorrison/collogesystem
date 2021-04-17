package student;

public class Student {
    String collegeName;
    String courseName;
    int result;

    public Student(String collegeName, String courseName, int result) {
        this.collegeName = collegeName;
        this.courseName = courseName;
        this.result = result;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
