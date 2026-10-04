package constructor;
public class Student {
    public static void main(String[] args) {
        client s1 = new client();
        client s2 = new client("Divyansh Sharma");
        client s3 = new client("Divyansh", 40);
        client s4 = new client("Divyansh", 40, 7.93);
        s1.display(); s2.display();
        s3.display(); s4.display();
    }
}
class client {
    String name;
    int rollno;
    double cgpa;

    public client() {
        this.name = "Unknown";
        this.rollno = 0;
        this.cgpa = 0.00;
    }
    public client(String name) {
        this.name = name;
        this.rollno = 0;
        this.cgpa = 0.00;
    }
    public client(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
        this.cgpa = 0.00;
    }
    public client(String name, int rollno, double cgpa) {
        this.name = name;
        this.rollno = rollno;
        this.cgpa = cgpa;
    }
    public void display() {
        System.out.println("Name: "+ name+ "| Roll No: "+ rollno+ "| CGPA: "+ cgpa);
    }
}

