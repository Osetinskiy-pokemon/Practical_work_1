package services;
import DAO.GroupDAO;
import models.Group;

public class GroupService {
    private GroupDAO groupDao = new GroupDAO();

    public GroupService(){}

    public void saveGroup(Group group){
        groupDao.save(group);
    }

    public Group findGroup(int id){
        return groupDao.findById(id);
    }
}