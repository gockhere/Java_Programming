package day26_statics.studentTask;



import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup { //students group has a student

    public String groupName ;
    public int groupId;

    public ArrayList<Student> students=new ArrayList<>();

    public StudentsGroup(String groupName, int groupId) { // creates the studentsGroup by setting the groupName and groupId
        this.groupName = groupName;
        this.groupId = groupId;
        //students=new ArrayList<>(); //size :0
    }

    public void addStudent(Student student){ //takes one student object , and adds it to the arraylist of students
        students.add(student);

    }

    public void addStudents(Student [] students){
        this.students.addAll(Arrays.asList(students));
    }

    public void addStudent(String name, int age, char gender, String id){
        //Student student=new Student(name,age,gender,id);

        students.add(new Student (name,age,gender,id));

    } // takes name age gender and id of students info, creates student object by using the given info, then adds the student object to arraylist

    public void removeStudents(String id){
        students.removeIf(p -> p.id.equals(id));
    }// takes the id and then removes the student object with the specified id from arraylist of students


    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", number of students=" + students.size() +
                '}';
    }








}

/*
Create a custom class named StudentsGroup
	            Attributes:
	                groupName, groupId, students (ArrayList<Students>)

	            Add a constructor that can set the groupId and groupName
	                    initialize students arraylist in the constructor's body

	            Methods:
	                addStudent(Student): adds the specified student to the students arrayList

	                removeStudent(id): removes the student with the specified id from the students arraylist

	                toString(): displays the groupName, groupId and total number of students when a group object is passed in the print statement
 */