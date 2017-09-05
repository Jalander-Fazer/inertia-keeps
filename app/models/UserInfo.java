package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.DynamicForm;
import play.data.format.*;
import play.data.validation.*;
import play.data.validation.Constraints.Validatable;
import play.data.validation.Constraints.Validate;

@Entity
@Validate
public class UserInfo extends Model implements Validatable<List<ValidationError>>{
	
    @Constraints.Min(10)
    public Long id;

    @Constraints.Required
    public String username;
    
    @Constraints.Required
    public int amount;
    
    @Constraints.Required
    public String password;
    
    @Id
    @Constraints.Required
    public String phonenumber;

    @Formats.DateTime(pattern="dd/MM/yyyy")
    public Date date = new Date();

    public static final Finder<String, UserInfo> find = new Finder<>(UserInfo.class);
    
    
    //TODO: Implement setters and getters
    
    public static UserInfo get(DynamicForm requestData) {
		String phoneNumber = requestData.get("phoneNumber");
		return find.byId(phoneNumber);
    }
    
    public static UserInfo get(String phoneNumber) {
    	return find.byId(phoneNumber);
    }


	@Override
	public List<ValidationError> validate() {
		final List<ValidationError> errors = new ArrayList<>();
		if(authenticate(this.phonenumber, this.password) == null) {
			errors.add(new ValidationError("phonenumber", "Access Denied"));
			errors.add(new ValidationError("", "Data could not be processed"));
		}
		return errors;
	}
	
	
	private String authenticate(String phonenumber, String password) {
		if(phonenumber == null) return null;
		if(password == null) return null;
		return "";
	}
    
}