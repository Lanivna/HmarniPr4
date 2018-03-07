package com.google.training.helloworld;


public class Age {
    private String message = "Hello, world!";

	public Age (String name, String age) {
    	this.message  =  age + " " + name + "!";
    }

    public String getMessage() {
        return message;
    }
}