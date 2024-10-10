package com.sainath.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sainath.demo.model.Question;
import com.sainath.demo.service.QuestionService;

@RestController
@RequestMapping("question")
public class QuestionController {
	@Autowired
	QuestionService questionService;
	@GetMapping("allQuestions")
	public ResponseEntity<List<Question>> getAllQuestions() {
		return  questionService.getAllQuestions();

	}
	@GetMapping("category/{cat}")
	public List<Question> getQuestionByCategory(@PathVariable("cat") String category){
		return questionService.getQuestionsByCategory(category);
	}
	@PostMapping("add")
	public String addQuestion(@RequestBody Question question) {
		return questionService.addQuestion(question);
	}
//	@DeleteMapping("delete")
//	public String deleteQuestion(@RequestBody Question question) {
//		return questionService.deleteQuestion(question);
//	}

}
