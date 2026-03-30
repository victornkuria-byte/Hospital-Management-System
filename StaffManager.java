import java.io.*;
import java.util.*;

public class StaffManager {
    public ArrayList<Person> myList = new ArrayList<>(); // Use ArrayList instead of List interface

    public void addStaff(Person p) {
        myList.add(p);
    }

    public void saveToFile() throws IOException {
        FileWriter fw = new FileWriter("hospital_data.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        for (int i = 0; i < myList.size(); i++) {
            Person p = myList.get(i);
            if (p instanceof Doctor) {
                Doctor d = (Doctor) p;
                bw.write("DOCTOR," + d.getName() + "," + d.getId() + "," + d.department + "," + d.spec);
            } else if (p instanceof Nurse) {
                Nurse n = (Nurse) p;
                bw.write("NURSE," + n.getName() + "," + n.getId() + "," + n.department);
            } else if (p instanceof Administrator) {
                bw.write("ADMIN," + p.getName() + "," + p.getId());
            }
            bw.newLine();
        }
        bw.close(); // manual close instead of try-with-resources
    }

    public void loadFromFile() throws Exception {
        File f = new File("hospital_data.txt");
        if (!f.exists())
            return;

        Scanner s = new Scanner(f);
        while (s.hasNextLine()) {
            String line = s.nextLine();
            String[] data = line.split(",");

            if (data[0].equals("DOCTOR")) {
                myList.add(new Doctor(data[1], Integer.parseInt(data[2]), data[3], data[4]));
            } else if (data[0].equals("NURSE")) {
                myList.add(new Nurse(data[1], Integer.parseInt(data[2]), data[3]));
            } else if (data[0].equals("ADMIN")) {
                myList.add(new Administrator(data[1], Integer.parseInt(data[2])));
            }
        }
        s.close();
    }
}