package services;
import DAO.RoleDAO;
import models.Role;

public class RoleService {
    private RoleDAO roleDao = new RoleDAO();

    public RoleService(){}

    public void saveRole(Role Role){
        roleDao.save(Role);
    }

    public Role findRole(int id){
        return roleDao.findById(id);
    }
}