import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class BackEnd {
	
	private HashMap<String, List<String>> users;
	
	public BackEnd(){
		users = new HashMap<String,List<String>>();
	}
	
	public List<String> getMessages(String username){
		return users.get(username);
	}
	
	public void addMessage(String username, String msg){
		if(users.containsKey(username)){
			users.get(username).add(msg);
		}else{
			List<String> mess = new ArrayList<String>();
			mess.add(msg);
			users.put(username, mess);
		}
		Encoder encoder = new Encoder("Data.txt");
		encoder.write(username + "," + msg);
	}
	
	public List<String> getUsers(){
		List<String> names = new ArrayList<String>();
		
		for(String s: users.keySet()){
			names.add(s);
		}

		return names;
	}
	
}
