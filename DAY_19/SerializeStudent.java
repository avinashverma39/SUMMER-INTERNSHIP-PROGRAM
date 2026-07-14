package DAY_19;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.IOException;

public class SerializeStudent {

    public static void main(String[] args) {

        try {

            ArrayList<fileHendling> students = new ArrayList<>();
            // Create a new student object
            students.add(new fileHendling(10112, "John Doe", "Computer Science"));
            students.add(new fileHendling(10113, "Jane Smith", "Mathematics"));
            students.add(new fileHendling(10114, "Alice Johnson", "Physics"));
            // Serialize the ArrayList of Student objects to a file
            
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.dat"));
            out.writeObject(students);
            out.close();
            System.out.println("Student objects serialized successfully.");

            // Display student details
            for (fileHendling s : students) {
                s.displayDetails();
            }
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
