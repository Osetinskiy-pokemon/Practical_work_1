package services;
import DAO.ScheduleDAO;
import models.Schedule;

public class ScheduleService {
    private ScheduleDAO scheduleDao = new ScheduleDAO();

    public ScheduleService(){}

    public void saveSchedule(Schedule Schedule){
        scheduleDao.save(Schedule);
    }

    public Schedule findSchedule(int id){
        return scheduleDao.findById(id);
    }
}
