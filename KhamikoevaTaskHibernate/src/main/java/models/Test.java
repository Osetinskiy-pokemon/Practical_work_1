package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "test")
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int row_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "test_id")
    private TestList test;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id")
    private Question question;
    @OneToMany(mappedBy = "student_answer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<StudentAnswer> student_answers;

    public Test(){
        this.student_answers = new ArrayList<StudentAnswer>();
    }

    public int getRow_id() {
        return row_id;
    }

    public List<StudentAnswer> getStudent_answers() {
        return student_answers;
    }

    public Question getQuestion() {
        return question;
    }

    public TestList getTest() {
        return test;
    }

    public void setTest(TestList test) {
        this.test = test;
    }

    public void setStudent_answers(List<StudentAnswer> student_answers) {
        this.student_answers = student_answers;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Test{" +
                "row_id=" + row_id +
                ", test=" + test +
                ", question=" + question +
                ", student_answers=" + student_answers +
                '}';
    }
}