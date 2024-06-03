package com.blogs.service;

import com.blogs.dto.ApiResponse;
import com.blogs.dto.CommentDto;

public interface CommentService {
	ApiResponse addNewComment(CommentDto comment);
}
