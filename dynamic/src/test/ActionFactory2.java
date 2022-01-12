package test;

public class ActionFactory2 {
	Action getAction(String command) {
		Action result = null;
		switch(command) {
		case "signUp":
			result = new SignUpAction();
			break;
		case "signUp_check":
			result = new SignUpCheckAction();
			break;
		}
		return result;
	}
}
