package test;

public class ActionFactory {
	Action getAction(String command) {
		Action result = null;
		switch(command) {
		case "login":
			result = new LoginAction();
			break;
		case "Login_check":
			result = new LoginCheckAction();
			break;
		case "admin":
			result = new LoginAdmin();
		}
		return result;
	}
}
