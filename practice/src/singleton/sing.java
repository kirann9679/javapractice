package singleton;

public class sing {
	
		public static void main(String[]args) {
		abc ins=abc.instance;
		ins.i=10;
		ins.show();
		abc ins1=abc.instance;
		ins1.i=9;
		ins.show();
		}
		
	

}
