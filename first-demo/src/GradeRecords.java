import person.Student;

public class GradeRecords {

    public static void main(String[] args) {
        //Array is an example of a non primitive data type
        Student[] students = new Student[5];

        //Using the constructor of the Student Class we set the values associated with the Student Class
        students[0] = new Student("John", "3rd", 70);
        students[1] = new Student("Joe", "3rd", 45);
        students[2] = new Student("Brian", "2nd", 0);
        students[3] = new Student("Karen", "4th", 78);
        students[4] = new Student("Matilda", "3rd", 88);

        //Using a for loop we iterate through the array and evaluate the grades
        //How it works
        //We use a conditional operator "<" to check if the index is still less than the length of students
        //if true we use the increment operator to increase the value of index by 1 then execute the block of code
        //else we exit the loop and move on
        for (int index = 0; index < students.length; index++) {
            //In here we simply make sure there is no 0 in the grade and the lowest grade is 40

            //declare a student variable
            Student student = students[index];

            System.out.println("Checking student " + student.getName() + " grade!");

            //declare a student grade variable and
            //use the accessor in the class to get the current student's grade
            int grade = student.getGrade();

            //check if the student's grade is less than 40 if so change it to 40
            if(grade < 40) {
               student.setGrade(40);
               System.out.println("Student " + student.getName() + " in year " + student.getYear() +  " has been changed to 40!");
            }
        }

        //Note: the for loop above can be changed into a for each loop.
    }
}
