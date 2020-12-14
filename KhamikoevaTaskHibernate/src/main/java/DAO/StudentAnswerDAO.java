package DAO;
import models.StudentAnswer;
import models.TestList;
import utils.HibernateSessionFactoryUtil;

import java.util.ArrayList;
import java.util.List;

public class StudentAnswerDAO extends GeneralDAO<StudentAnswer> {
    public StudentAnswer findById(int id){
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(StudentAnswer.class, id);
    }

    public List<StudentAnswer> findAll(){
        return (List<StudentAnswer>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From StudentAnswer").list();
    }
    public List<TestList> getTestsByStudentId(int id){
        List<StudentAnswer> studentAnswers = findAll();
        ArrayList<TestList> tests = new ArrayList<>();
        for (StudentAnswer s: studentAnswers) {
            if(s.getUser().getRow_id() == id) {
                tests.add(s.getTest());
            }
        }
        return tests;
    }
}