package models;
import javax.persistence.*;

@Entity
@Table(name = "student_answer")
public class StudentAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int row_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "test_id")
    private TestList test;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "answer_id")
    private Answer answer;

    public StudentAnswer(){}

    public TestList getTest() {
        return test;
    }

    public int getRow_id() {
        return row_id;
    }

    public Answer getAnswer() {
        return answer;
    }

    public User getUser() {
        return user;
    }

    public void setTest(TestList test) {
        this.test = test;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Student_answer{" +
                "row_id=" + row_id +
                ", test=" + test +
                ", user=" + user +
                ", answer=" + answer +
                '}';
    }
}