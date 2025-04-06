package tugas;

public class LingkaranMain {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran(5);
        Lingkaran l2 = l1;
        Lingkaran l3 = new Lingkaran(7);

        System.out.println(l1.getJari2()); // 5
        System.out.println(l2.getJari2()); // 5
        System.out.println(l3.getJari2()); // 7

        l2 = l3;
        System.out.println(l1.getJari2()); // 5
        System.out.println(l2.getJari2()); // 7
        System.out.println(l3.getJari2()); // 7
    }
}
