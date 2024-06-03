package com.blogs.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.blogs.custom_exceptions.ApiException;
import com.blogs.custom_exceptions.ResourceNotFoundException;
import com.blogs.dto.ApiResponse;
import com.blogs.dto.CommentDto;
import com.blogs.entities.BlogPost;
import com.blogs.entities.Comment;
import com.blogs.entities.User;
import com.blogs.repository.BlogPostRepository;
import com.blogs.repository.CommentRepository;
import com.blogs.repository.UserRepository;

public class CommentServiceImpl implements CommentService {

		@Autowired
		private  CommentRepository commentRepository;
		@Autowired
		private  ModelMapper modelMapper;
		@Autowired
		private  UserRepository userRepository;
		@Autowired
		private BlogPostRepository blogPostRepository;
		
		@Override
		public ApiResponse addNewComment(CommentDto dto) {
			// TODO Auto-generated method stub
			User commenter = userRepository.findById(dto.getCommenterId())
					.orElseThrow(()-> new ResourceNotFoundException("invalid user id"));
			BlogPost post = blogPostRepository.findById(dto.getPostId())
					.orElseThrow(()->new ResourceNotFoundException("invalid id of post"));
			if(commenter.getId()==post.getAuthor().getId())
				throw new ApiException("bloggers cant comment on their own");
			Comment comment = modelMapper.map(dto, Comment.class);
			comment.setPost(post);
			Comment savedComment = commentRepository.save(comment);
			return new ApiResponse("new comment added to the id = "+ savedComment);
		}
		
		
		
	}


