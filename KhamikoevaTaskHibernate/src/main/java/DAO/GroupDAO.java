package DAO;
import models.Group;
import utils.HibernateSessionFactoryUtil;

import java.util.List;

public class GroupDAO extends GeneralDAO<Group> {
    public Group findById(int id){
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Group.class, id);
    }

    public List<Group> findAll(){
        return (List<Group>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From Group").list();
    }
}