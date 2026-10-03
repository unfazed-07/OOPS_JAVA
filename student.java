public class student {
    public static void main (String []args) {

        Studentt s1 = new Studentt("Divyansh Sharma", 40, 7.93);

        s1.display();
    }
}

class Studentt {
    String name;
    int rollno;
    double cgpa;


    public Studentt(String name, int rollno, double cgpa) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Name is null or blank");
        if ( rollno == 0)  throw new  IllegalArgumentException("rollno is null or 0");
        if ( cgpa == 0) throw new  IllegalArgumentException("cgpa is null or 0");
        this.name = name;
        this.rollno = rollno;
        this.cgpa = cgpa;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Rollno: " + rollno);
        System.out.println("CGPA: " + cgpa);
    }

}
