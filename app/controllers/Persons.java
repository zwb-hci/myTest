package controllers;

import models.PersonInfo;
import play.mvc.Controller;

public class Persons extends Controller{
	
	public static void index(){
		PersonInfo person = new PersonInfo();
		person.name = "KeithChen";
		person.age = 11;
		render(person);
	}

}
