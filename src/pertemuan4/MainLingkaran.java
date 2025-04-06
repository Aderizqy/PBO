package pertemuan4;

public class MainLingkaran {
    public static void main(String[] args) {

//        lingkaran l1 = new lingkaran(5.0);
//        lingkaran l2 = l1;
//        System.out.println("Jari-jari l1: " + l1.getJarijari());
//        System.out.println("Jari-jari l2: " + l2.getJarijari());
//        l2.setJarijari(10.0);
//        System.out.println("Jari-jari l1: " + l1.getJarijari());
//        System.out.println("Jari-jari l2: " + l2.getJarijari());

//        lingkaran l1 = new lingkaran(5.0);
//        lingkaran l2 = l1;
//        lingkaran l3 = new lingkaran(7.0);
//        System.out.println("Jari-jari l1: " + l1.getJarijari());
//        System.out.println("Jari-jari l2: " + l2.getJarijari());
//        System.out.println("Jari-jari l3: " + l3.getJarijari());
//        l2 = l3;
//        System.out.println("Jari-jari l1: " + l1.getJarijari());
//        System.out.println("Jari-jari l2: " + l2.getJarijari());
//        System.out.println("Jari-jari l3: " + l3.getJarijari());

//        lingkaran l1 = new lingkaran(5.0);
//        lingkaran l2 = l1;
//        lingkaran l3 = new lingkaran(7.0);
//        System.out.println("Jari-jari l1: " + l1.getJarijari());
//        System.out.println("Jari-jari l2: " + l2.getJarijari());
//        System.out.println("Jari-jari l3: " + l3.getJarijari());
//        l2 = null;
//        System.out.println("Jari-jari l1: " + l1.getJarijari());
//        System.out.println("Jari-jari l2: " + l2.getJarijari());
//        System.out.println("Jari-jari l3: " + l3.getJarijari());

//        lingkaran l1 = new lingkaran(5.0);
//        lingkaran l2 = l1;
//        lingkaran l3 = new lingkaran(7.0);
//        System.out.println("Jari-jari l1: " + l1.getJarijari());
//        System.out.println("Jari-jari l2: " + l2.getJarijari());
//        System.out.println("Jari-jari l3: " + l3.getJarijari());
//        l2 = null;
//        System.out.println("Jari-jari l1: " + l1.getJarijari());
//        if (l2 != null) System.out.println("Jari-jari l2: " + l2.getJarijari());
//        System.out.println("Jari-jari l3: " + l3.getJarijari());

//        lingkaran l1 = new lingkaran(5.0);
//        lingkaran l2 = l1;
//        lingkaran l3 = new lingkaran(7.0);
//        System.out.println("Jari-jari l1: " + l1.getJarijari());
//        System.out.println("Jari-jari l2: " + l2.getJarijari());
//        System.out.println("Jari-jari l3: " + l3.getJarijari());
//        l1 = null;
//        l2 = null;
//        l3 = null;

        Lingkaran l1 = new Lingkaran(5.0);
        Persistence p = new Persistence();
        p.save(l1);

//        lingkaran l1 = new lingkaran(5.0);
//        lingkaran l2 = l1;
//        System.out.println("Jari-jari l1: " + l1.getJarijari());
//        System.out.println("Jari-jari l2: " + l2.getJarijari());
//        ubahJarijari(l2);
//        System.out.println("Jari-jari l1: " + l1.getJarijari());
//        System.out.println("Jari-jari l2: " + l2.getJarijari());
    }

    public static void ubahJarijari(Lingkaran obj){
        obj.setJarijari(10.0);
    }
}