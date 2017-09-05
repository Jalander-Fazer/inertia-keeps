package controllers;

import models.UserInfo;
import play.mvc.*;

public class HomePage {
	
	public Result index(UserInfo userInfo) {
		if(session("connected") != null) {
			
		}
		
		else {
			return redirect("/signup");
		}
	}
	
	
	public Result logout() {
		session().remove("connected");
		return redirect("/");
	}
}
