import java.util.LinkedList;

public class tugas2_linkedlist {
    public static void main(String[] args) {

        //create title of task
        System.out.println("\n");
        System.out.println("\t\t\t..................TUGAS 2 SDA [LINKED LIST]..................");
        System.out.println("\t\t\t-------------------------------------------------------------");
        System.out.println("\n");
        
        //create linked list with my full name including space as the elements
        System.out.println("Create Linked List First");
        LinkedList <String> nama1 = new LinkedList<String>();
        nama1.add("H");
        nama1.add("A");
        nama1.add("S");
        nama1.add("Y");
        nama1.add("A");
        nama1.add(" ");
        nama1.add("Z");
        nama1.add("I");
        nama1.add("K");
        nama1.add("R");
        nama1.add("A");
        nama1.add(" ");
        nama1.add("A");
        nama1.add("L");
        nama1.add("F");
        nama1.add("R");
        nama1.add("E");
        nama1.add("N");
        nama1.add("A");

        System.out.println("My Full Name : " + nama1);
        System.out.println("Size :" +nama1.size());
        System.out.println("\n");

        //soal 1
        //add karakter lain yang anda inginkan
        System.out.println("soal 1 : add characters you want");
        System.out.println("-------------------------------------------------");

        nama1.addFirst("d");
        nama1.add(1,"r");
        nama1.add(2,"");
        nama1.add(22,"");
        nama1.add(23,"P");
        nama1.add(24,"h");
        nama1.add(25,".");
        nama1.addLast("D");

        System.out.println("characters added : " + nama1.get(0) + ", " + nama1.get(1) + ", " + nama1.get(2) + ", " + nama1.get(8) +
        ", " + nama1.get(22) + ", " + nama1.get(23) + ", " + nama1.get(24) + ", " + nama1.get(25) + ", " + nama1.get(26) );
        System.out.println("My Full Name After Some Characters Added : " + nama1);
        System.out.println("Size After Changes 1 : " +nama1.size());
        System.out.println("\n");

        //soal 2
        //sisipkan karakter lain yang anda inginkan
        System.out.println("soal 2 : set other characters you want");
        System.out.println("-------------------------------------------------");

        nama1.set(23,"M");
        nama1.set(24,"B");
        nama1.set(25,"A");
        nama1.set(26,"");

        System.out.println("other characters set : " + nama1.get(23) + ", " + nama1.get(24) + ", " + nama1.get(25) + ", " + nama1.get(26));
        System.out.println("My Full Name After Other Characters Set : " + nama1);
        System.out.println("Size After Changes 2 : " +nama1.size());
        System.out.println("\n");

        //soal 3
        //hapus beberapa karaker yang ingin anda hapus
        System.out.println("soal 3 : remove some characters");
        System.out.println("-------------------------------------------------");

        nama1.removeFirst();
        nama1.remove(0);
        nama1.remove(0);
        nama1.remove(4);
        nama1.remove(8);
        nama1.remove(12);
        nama1.remove(12);
        nama1.removeLast();

        System.out.println("characters removed : d, r,  , A, R, F, R, ");
        System.out.println("My Full Name After Changes 3 : " + nama1);
        System.out.println("Size After Changes 3 : " +nama1.size());
        System.out.println("\n");

        //soal 4
        //buat fungsi POP dan PUSH pada project anda
        System.out.println("soal 4 : make POP and PUSH function on your project");
        System.out.println("-------------------------------------------------");

        //pop
        System.out.println("POP");
        System.out.println("Elemen yang dikeluarkan (pop) = " + nama1.get(0) + " dan " + nama1.get(1));
        nama1.pop();
        nama1.pop();
        System.out.println("My Full Name After Changes 4 : " + nama1);
        System.out.println("Size After Changes 4 : " +nama1.size());
        System.out.println("\n");

        //push
        System.out.println("PUSH");
        nama1.push("A");
        nama1.push("Z");
        nama1.push("15");
        nama1.push("June");
        nama1.push("Hello");
        System.out.println("Elemen yang dimasukkan (push) = " + nama1.get(0) + "," + " " + nama1.get(1) + "," + nama1.get(2) + "," + nama1.get(3) 
        + "," + nama1.get(4));
        System.out.println("My Full Name After Changes 5 : " + nama1);
        System.out.println("Size After Changes 5 : " +nama1.size());
        System.out.println("\n");

        //create ending
        System.out.println("\t\t\t............................THE END.............................");
        System.out.println("\t\t\t...........................THANK YOU............................");
        System.out.println("\n");
    }
}