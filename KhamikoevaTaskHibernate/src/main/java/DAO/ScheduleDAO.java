package DAO;

import models.Schedule;
import utils.HibernateSessionFactoryUtil;

import java.util.List;

public class ScheduleDAO extends GeneralDAO<Schedule>{
    public Schedule findById(int id){
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Schedule.class, id);
    }

    public List<Schedule> findAll(){
        return (List<Schedule>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From Schedule").list();
    }
}