package com.sainath.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sainath.demo.dao.QuestionDao;
import com.sainath.demo.model.Question;

@Service
public class QuestionService {
	@Autowired
	QuestionDao questionDao;
	public ResponseEntity<List<Question>> getAllQuestions() {
		try {
			return new ResponseEntity<>(questionDao.findAll(),HttpStatus.OK);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
	}
	public List<Question> getQuestionsByCategory(String category) {

		return questionDao.findByCategory(category);
	}
	public String addQuestion(Question question) {
		questionDao.save(question);
		return "success";
	}
	public String deleteQuestion(Question question) {
		questionDao.delete(question);
		return "Deleted successfully";
	}


}
