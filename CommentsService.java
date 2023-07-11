package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Comments;

public interface CommentsService 
{

	public List<Comments> getComments();
	public String addComments(Comments comments);
}
