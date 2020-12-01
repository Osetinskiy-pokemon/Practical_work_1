package com.example.demo.controllers;

import com.example.demo.exceptions.ResourceNotFoundException;
import com.example.demo.model.Answer;
import com.example.demo.repository.AnswerRepository;
import com.example.demo.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class AnswerController {
    @Autowired
    private AnswerRepository answerRepository;

    @Autowired
    private QuestionRepository questionRepository;

    @GetMapping("/questions/{questionId}/answers")
    public List<Answer> getAnswersByQuestionId(@PathVariable Long questionId){
        return answerRepository.findByQuestionId(questionId);
    }

    @PostMapping("/questions/{questionId}/answers")
    public Answer createAnswer(@Valid Long questionId, @Valid Answer answer){
        return answerRepository.findById(questionId)
                .map(question -> {
                    answer.setQuestion(question);
                    return  answerRepository.save(answer);
                }).orElseThrow(() -> new ResourceNotFoundException("Question not found with id " + questionId));
    }

    @PutMapping("/questions/{questionId}/answers/{answerId}")
    public Answer updateQuestion(@PathVariable Long answerId,
                                 @PathVariable Long questionId,
                                   @Valid @RequestBody Answer answerRequest) {
        if (!questionRepository.existsById(questionId)) {
            throw new ResourceNotFoundException("Question not found with id " + questionId)
        }
        return answer

    @DeleteMapping("/answers/{answerId}")
    public ResponseEntity<?> deleteAnswer(@PathVariable Long answerId){
        return answerRepository.findById(answerId)
                .map(answer -> {
                    answerRepository.delete(answer);
                    return ResponseEntity.ok().build();
                }).orElseThrow(() -> new ResourceNotFoundException("Answer not found with id " + answerId));
    }

}
