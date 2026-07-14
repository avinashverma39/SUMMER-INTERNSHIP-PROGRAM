package DAY_19;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.IOException;

// SerializeStudent
// This program demonstrates how to serialize a list of Student objects into a byte stream and save it to a file. as a byte stream and save it to a file. It creates an ArrayList of Student objects, serializes them, and writes them to a file named "student.dat". It also displays the details of each student after serialization.

//Send over the details of each student after serialization.
//objects -----> Byte stream -----> File
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
