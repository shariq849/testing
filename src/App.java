import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Students implements Comparable<Students> {
    private int id;
    private String name;

    public Students(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }

    @Override
    public int compareTo(Students that) {
        return Integer.compare(this.id, that.id);
    }
}

class DescendingStudentComparator implements Comparator<Students> {
    @Override

    public int compare(Students student1, Students student2) {
        return Integer.compare(student2.getId(), student1.getId());
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        List<Students> student = List.of(
                new Students(100, "Shariq"),
                new Students(2000, "Ahmad"),
                new Students(200, "Siddiqui"));

        ArrayList<Students> studentAl = new ArrayList<>(student);
        System.out.println(studentAl);
        Collections.sort(studentAl);
        System.out.println("Ascending" + studentAl);
        Collections.sort(studentAl, new DescendingStudentComparator());
        System.out.println("Descending" + studentAl);
        Set<String> newset = Set.of("Apple", "banan");
        System.out.println(newset);
        // convert into hashset
        Set<String> hashset = new HashSet<>(newset);
        System.out.println("Hashset" + hashset);
        List<String> li = List.of("new", "old");
        ArrayList<String> newarr = new ArrayList<>(li);
        System.out.println(newarr);
        Collections.sort(newarr);
        System.out.println(newarr);
        Set<Integer> hashnumbers = new HashSet<>();
        hashnumbers.add(765432);
        hashnumbers.add(76543);
        hashnumbers.add(765);
        hashnumbers.add(76);
        System.out.println(hashnumbers);

        Set<Integer> treenumbers = new TreeSet<>();
        treenumbers.add(765432);
        treenumbers.add(76543);
        treenumbers.add(765);
        treenumbers.add(76);
        System.out.println(treenumbers);

        Set<Integer> linkedhashnumbers = new LinkedHashSet<>();
        linkedhashnumbers.add(765432);
        linkedhashnumbers.add(76543);
        linkedhashnumbers.add(765);
        linkedhashnumbers.add(76);
        System.out.println(linkedhashnumbers);
        System.out.println("Helo world");
        System.out.println("Helo world");
        System.out.println("Helo world");
        System.out.println("Helo world");

    }
}
