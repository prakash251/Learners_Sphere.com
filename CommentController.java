package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Comments;
import com.example.demo.service.CommentsService;

@Controller
public class CommentController 
{
   @Autowired
   CommentsService cs;
	@PostMapping("/addComent")
	public String getComments(@RequestParam("commentText") String comment, Model m)
	{
		
		Comments cms=new Comments();
		cms.setComment(comment);
		String msg=cs.addComments(cms);
		System.out.println(msg);
		
		
		List<Comments> comentsList=cs.getComments();
		System.out.println(comentsList);
		
		m.addAttribute("comments", comentsList);
		

		return "redirect:/	";
		
		
	}
	
}
