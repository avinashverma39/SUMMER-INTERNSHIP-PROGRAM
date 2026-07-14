package DAY_19;

import java.io.*;
import java.util.ArrayList;

public class DeserializeStudent {
  // Revers the process of serialization by reading the byte stream from the file and converting it back into a list of Student objects. It reads the serialized data from the "student.dat" file, deserializes it, and displays the details of each student.
    public static void main(String[] args) {

        try {
            // Deserialize the ArrayList of Student objects from a file
            FileInputStream fileIn = new FileInputStream("student.dat");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            ArrayList<fileHendling> students = (ArrayList<fileHendling>) in.readObject();
            in.close();

            // Display the deserialized student details
            for (fileHendling s : students) {
                s.displayDetails();
            }
        }

        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
