package com.blogs.custom_exceptions;

public class InvalidCredentialAndException  extends RuntimeException{
   public InvalidCredentialAndException(String msg) {
	   super(msg);
   }
}
