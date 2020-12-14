package DAO;
import models.Test;
import utils.HibernateSessionFactoryUtil;

import java.util.List;

public class TestDAO extends GeneralDAO<Test> {
    public Test findById(int id){
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Test.class, id);
    }

    public List<Test> findAll(){
        return (List<Test>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From Test").list();
    }

}