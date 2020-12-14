package services;
import DAO.StudentAnswerDAO;
import models.StudentAnswer;
import models.TestList;

import java.util.List;

public class StudentAnswerService {
    private StudentAnswerDAO student_answerDao = new StudentAnswerDAO();

    public StudentAnswerService(){}

    public void saveStudent_answer(StudentAnswer student_answer){
        student_answerDao.save(student_answer);
    }

    public StudentAnswer findStudent_answer(int id){
        return student_answerDao.findById(id);
    }

    public List<TestList> getTestsByStudentId(int id) {
        return student_answerDao.getTestsByStudentId(id);
    }
}