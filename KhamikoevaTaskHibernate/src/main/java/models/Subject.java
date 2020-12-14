package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "subject")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int row_id;
    private String name;
    @OneToMany(mappedBy = "test_list", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TestList> test_lists;
    public Subject() {
    }

    public Subject(String name) {
        this.name = name;
        this.test_lists = new ArrayList<TestList>();
    }

    public int getRow_id() {
        return row_id;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "row_id=" + row_id +
                ", name='" + name + '\'' +
                ", test_lists=" + test_lists +
                '}';
    }
}