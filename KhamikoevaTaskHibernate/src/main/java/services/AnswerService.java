package services;
import DAO.AnswerDAO;
import models.Answer;

public class AnswerService {
    private AnswerDAO answerDao = new AnswerDAO();

    public AnswerService(){}

    public void saveAnswer(Answer answer){
        answerDao.save(answer);
    }

    public Answer findAnswer(int id){
        return answerDao.findById(id);
    }
}
