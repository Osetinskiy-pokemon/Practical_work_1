package DAO;

import models.Question;
import utils.HibernateSessionFactoryUtil;

import java.util.List;


public class QuestionDAO extends GeneralDAO<Question>{
    public Question findById(int id){
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Question.class, id);
    }

    public List<Question> findAll(){
        return (List<Question>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From Question").list();
    }
}