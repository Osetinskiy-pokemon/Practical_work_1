package services;
import DAO.SubjectDAO;
import models.Subject;

public class SubjectService {
    private SubjectDAO subjectDao = new SubjectDAO();

    public SubjectService(){}

    public void saveSubject(Subject subject){
        subjectDao.save(subject);
    }

    public Subject findSubject(int id){
        return subjectDao.findById(id);
    }
}