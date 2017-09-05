package controllers;

import java.util.ArrayList;
import java.util.List;

import com.google.inject.Inject;

import models.UserInfo;
import play.data.DynamicForm;
import play.data.Form;
import play.data.FormFactory;
import play.data.validation.ValidationError;
import play.mvc.*;

public class Signin extends Controller {
	
	public String errorMessage = new String();
	
	public Result index() {
		String userSession = session("connected");
		if(userSession != null) {
			UserInfo userInfo = UserInfo.get(userSession);
			return ok(views.html.account.render(userInfo));
		}
		
		else {
			return ok(views.html.signin.render(null));
		}
	}
	
	public Result index(List<ValidationError> errors) {
		return ok(views.html.signin.render(errors));
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
