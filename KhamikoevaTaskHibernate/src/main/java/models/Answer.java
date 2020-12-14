package models;
import javax.management.relation.Role;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "answer")
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int row_id;

    private String text;
    private boolean correct;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id")
    private Role question;

    @OneToMany(mappedBy = "student_answer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<StudentAnswer>  student_answers;
    public Answer() {
    }
    public Answer(String text, boolean correct) {

        this.text = text;
        this.correct = correct;
        this.student_answers = new ArrayList<StudentAnswer>();
    }

    public int getRow_id() {
        return row_id;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "row_id=" + row_id +
                ", text='" + text + '\'' +
                ", correct=" + correct +
                ", question=" + question +
                ", student_answers=" + student_answers +
                '}';
    }
}
