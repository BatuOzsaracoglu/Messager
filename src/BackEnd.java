import java.util.ArrayList;
import java.util.List;


public class BackEnd {

	public List<String> getMessage(String username){
		List<String> messages = new ArrayList<String>();
		messages.add("Hello");
		return messages;
	}
	
	public void addMessage(String username, String msg){
		
	}
	
	public List<String> getUsers(){
		List<String> users = new ArrayList<String>();
		users.add("Bob");
		return users;
	}
	
}
