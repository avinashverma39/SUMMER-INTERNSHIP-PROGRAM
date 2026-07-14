package DAY_19;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class SerializeStudent {

    public static void main(String[] args) {

        try {
            // Create a new student object
            fileHendling student = new fileHendling(10112, "John Doe", "Computer Science");
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.dat"));
            out.writeObject(student);
            out.close();
            System.out.println("Student object serialized successfully.");

            // Display student details
            student.displayDetails();
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
