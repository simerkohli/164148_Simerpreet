package com.simer.spring2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {

	private int questionId;
	private String question;
	private List<String> answers;
	private Set<String> answer;
	private Map<Integer,String> ans;
	
	public Question(int questionId, String question, List<String> answers,Set<String> answer,Map<Integer,String> ans) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
		this.answer=answer;
		this.ans=ans;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getAnswers() {
		return answers;
	}
	public Set<String> getAnswer() {
		return answer;
	}
	
	public Map<Integer,String> getAns() {
		return ans;
	}
	
	public void setAns(Map<Integer,String> ans) {
		this.ans = ans;
	}
	
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	public void getAnswer(Set<String> answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question
				+ ", answers=" + answers + ", answer=" + answer + ", ans="
				+ ans + "]";
	}
	
	
	}
	
	

