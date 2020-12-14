package services;
import DAO.TestDAO;
import models.Test;

public class TestService {
    private TestDAO testDao = new TestDAO();

    public TestService(){}

    public void saveTest(Test test){
        testDao.save(test);
    }

    public Test findTest(int id){
        return testDao.findById(id);
    }

}