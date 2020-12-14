package DAO;
import models.TestList;
import utils.HibernateSessionFactoryUtil;

import java.util.List;

public class TestListDAO extends GeneralDAO<TestList>{
    public TestList findById(int id){
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(TestList.class, id);
    }

    public List<TestList> findAll(){
        return (List<TestList>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From TestList").list();
    }
}