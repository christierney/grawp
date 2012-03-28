import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Grawp {
    private final String name;
    private final int age;
    private Set<Grawp> siblings;

    public Grawp(String name, int age) {
        this.name = name;
        this.age = age;
        this.siblings = new HashSet<Grawp>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Set<Grawp> getSiblings() {
        return Collections.unmodifiableSet(siblings);
    }
    
    public void addSibling(Grawp sibling) {
        siblings.add(sibling);
    }
}
