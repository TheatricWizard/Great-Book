package users;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Loads files into the program as objects.
 * @author Dt
 */
public class ReadDatabase {

    /**
     * users loaded from files by the program.
     */
    public static ArrayList<Person> users = new ArrayList<Person>();

    /**ScanDatabase looks at the database file and creates on object and adds it to the array for every filename it finds**/
    public static void ScanDatabase() throws IOException {

        File database = new File("database.txt");

        try {
            if (!database.exists()) {
                database.createNewFile();
            }
        } catch (IOException ex) {
            System.out.println("There was no database file and a database file could not be created");
        }
        Scanner scanDatabase = new Scanner(database);

        while (scanDatabase.hasNext()) {
            //This creates a file object from the filename found in the database
            File userFile = new File(scanDatabase.next());

            try {
                if (!userFile.exists()) {
                    userFile.createNewFile();
                }
            } catch (IOException ex) {
                System.out.println("The file referenced in the database does not exist and a file could not be created");
            }
            //This scans the first entry into the user file, then creates the correct type of user object based on that entry
            Scanner scanUserFile = new Scanner(userFile);
            if (scanUserFile.hasNext()) {
                String userType = scanUserFile.next();
                switch (userType.toLowerCase()) {
                    case "parent": {
                        users.add(new Parent(userFile));
                        break;
                    }
                    case "student": {

                        users.add(new Student(userFile));
                        break;
                    }
                    case "teacher": {
                        users.add(new Teacher(userFile));
                        break;
                    }
                    default: {
                        users.add(new Student("Error", "Error", "Error", "Error", 1));
                    }
                    break;
                }

            }
            scanUserFile.close();
        }
        scanDatabase.close();

    }
}
