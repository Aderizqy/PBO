package tugas;

public class StudentMain {
    public static void main(String[] args) {
        Student x = new Student();
        Student y = x;
        x.setNrp("01");
        y.setNrp("02");
        System.out.println(x.getNrp()); // 02

        Student z = new Student();
        z.setNrp("03");
        x = z;
        System.out.println(x.getNrp()); // 03
        System.out.println(y.getNrp()); // 02
    }
}
