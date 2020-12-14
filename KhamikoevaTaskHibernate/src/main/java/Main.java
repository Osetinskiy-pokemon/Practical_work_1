import models.*;
import services.*;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserService();
        TestService testService = new TestService();
        TestListService testListService = new TestListService();
        StudentAnswer studentAnswer = new StudentAnswer();
        RoleService roleService = new RoleService();
        GroupService groupService = new GroupService();
        QuestionService questionService = new QuestionService();
        AnswerService answerService = new AnswerService();

        TestList test1 = new TestList("Анализ данных");
        TestList test2 = new TestList("Дискретная математика");

        testListService.saveTestList(test1);
        testListService.saveTestList(test2);

        Question question1 = new Question("Задание 1", 2, true);
        Question question2 = new Question("Задание 2", 2, true);
        Question question3 = new Question("Задание 3", 2, true);

        questionService.saveQuestion(question1);
        questionService.saveQuestion(question2);
        questionService.saveQuestion(question3);

        Answer answer1 = new Answer("Ответ 1", true);
        Answer answer2 = new Answer("Ответ 2", false);
        Answer answer3 = new Answer("Ответ 3", true);

        answerService.saveAnswer(answer1);
        answerService.saveAnswer(answer2);
        answerService.saveAnswer(answer3);

        Role student = new Role("Student");
        Role teacher = new Role("Teacher");
        User user1 = new User("Хамикоева", "Ольга", "Руслановна", "ohamikoeva", "123");
        user1.setRole(student);
        User user2 = new User("Гасанова", "Рукижат", "Гасановна", "rukizhka", "123");
        user2.setRole(student);
        User teacher1 = new User("Петров", "Алексей", "Андреевич", "ptrv", "123");
        teacher1.setRole(teacher);
        userService.saveUser(user1);
        userService.saveUser(user2);
        userService.saveUser(teacher1);
        System.out.println(userService.getTeachers());
        System.out.println(userService.getStudents());
    }
}