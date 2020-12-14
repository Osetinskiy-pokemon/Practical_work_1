package services;
import DAO.TestListDAO;
import models.TestList;

public class TestListService {
    private TestListDAO test_listDao = new TestListDAO();

    public TestListService(){}

    public void saveTestList(TestList test_list){
        test_listDao.save(test_list);
    }

    public TestList findTest_list(int id){
        return test_listDao.findById(id);
    }
}