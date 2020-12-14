package services;
import DAO.QuestionDAO;
import models.Question;

public class QuestionService {
    private QuestionDAO questionDao = new QuestionDAO();

    public QuestionService(){}

    public void saveQuestion(Question Question){
        questionDao.save(Question);
    }

    public Question findQuestion(int id){
        return questionDao.findById(id);
    }
}