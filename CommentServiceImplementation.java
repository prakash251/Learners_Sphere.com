package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Comments;
import com.example.demo.repository.CommentRepository;

@Service
public class CommentServiceImplementation implements CommentsService
{
	@Autowired
    CommentRepository cr;
	@Override
	public List<Comments> getComments()
	{
		List<Comments> cmts=cr.findAll();
		
		return cmts;
	}
	@Override
	public String addComments(Comments comments)
	{
		cr.save(comments);
		
		return "comment added successfully";
	}
	

}
