package ht.git.first;

public class GitTest {

	private String name=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Git is test view");
		 
		 for (int i = 0; i < args.length; i++) {
			System.out.println("[i]:"+i);
		}
		 
		GitTest gt=new GitTest();
		System.out.println(gt.getName());
	}
	
	public String getName(){
		name="Admin";
		return name;
	}

}
