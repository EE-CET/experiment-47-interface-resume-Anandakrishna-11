import java.util.Scanner;

interface Resume {
    // Declare method
    void biodata();
}

class Teacher implements Resume {
    // Attributes
    String name;
    String qualification;
    int experience;

    // Implement biodata() method
    public void biodata() {
        System.out.println("Name: " + name);
        System.out.println("Qualification: " + qualification);
        System.out.println("Experience: " + experience + " years");
    }
}

public class InterfaceResume {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create Teacher object
        Teacher teacher = new Teacher();

        // Read input
        teacher.name = sc.nextLine();
        teacher.qualification = sc.nextLine();
        teacher.experience = sc.nextInt();

        // Call biodata method
        teacher.biodata();

        sc.close();
    }
}
