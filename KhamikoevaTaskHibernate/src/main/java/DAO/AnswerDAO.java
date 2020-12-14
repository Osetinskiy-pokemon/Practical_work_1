package DAO;
import models.Answer;
import utils.HibernateSessionFactoryUtil;

import java.util.List;

public class AnswerDAO extends GeneralDAO<Answer> {
    public Answer findById(int id){
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Answer.class, id);
    }

    public List<Answer> findAll(){
        return (List<Answer>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From Answer").list();
    }
}