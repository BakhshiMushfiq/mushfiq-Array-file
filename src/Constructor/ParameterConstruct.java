package Constructor;

import NewPrectice.Main;

public class ParameterConstruct {
	int x;
	ParameterConstruct (int i){
		x = i;
	}
	public static void main(String[] args) {
		ParameterConstruct t1 = new ParameterConstruct (10);
		ParameterConstruct t2 = new ParameterConstruct (88);
		System.out.println(t1.x + "  " + t2.x);
	}
	}

