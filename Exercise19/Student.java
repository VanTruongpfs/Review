package Exercise19;

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.Date;

public class Student {
    private String name;
    private String StudentID;
    private Date date;
    private ArrayList<Subject> scoreList;
    /*
    this is a constructor of class Student. There are 4 field
     */
    public Student(String name, String StudentID, Date date, ArrayList<Subject> scoreList) {
        this.name = name;
        this.StudentID = StudentID;
        this.date = date;
        this.scoreList = scoreList;

    }

}
