package controllers;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.google.inject.Inject;

import io.ebean.Model;
import models.UserInfo;
import play.data.DynamicForm;
import play.data.Form;
import play.data.FormFactory;
import play.data.validation.Constraints;
import play.data.validation.ValidationError;
import play.mvc.*;

public class Signup extends Controller {
	
	public String errorMessage = new String();
	
	public Result index() {
		
		if(session("connected") != null) {
			return redirect("/");
		}
		
		else {
			return ok(views.html.signup.render(null));
		}
	}
	
	public Result index(DynamicForm errors) {
		return ok(views.html.signup.render(errors));
	}
	
	@Inject FormFactory formFactory;
	public Result authentication() {
		DynamicForm requestData = formFactory.form().bindFromRequest();
		UserInfo userInfo = UserInfo.get(requestData);
		
		List<ValidationError> errors = userInfo.validate();
		
		if(errors.size() > 0) {
			return index(errors);
		}
		
		session.connect("connected", userInfo.phonenumber);
		return redirect("/");
	}
}
