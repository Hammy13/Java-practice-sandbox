package person;

public class Student {

    //below are an example variables, more specifically instance variables
    private String name;
    private String year;
    private int grade;

    public Student(String name, String year, int grade) {
        this.name = name;
        this.year = year;
        this.grade = grade;
    }

    /*
    mutators and accessors usually follow a naming convention of get<variablename> and set<variablename>
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
