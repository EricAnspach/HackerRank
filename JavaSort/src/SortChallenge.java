import java.util.*;
import java.util.Comparator;

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

class Checker implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {

        if (o2.getCgpa() == o1.getCgpa()) {
            if (o1.getFname().equalsIgnoreCase(o2.getFname())) {
                return o1.getId() - o2.getId();
            } else {
                return o1.getFname().compareTo(o2.getFname());
            }

        } else {
            double d = o2.getCgpa() - o1.getCgpa();
            if(d < 0) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}

public class Solution
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();

        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Collections.sort(studentList, new Checker());

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}