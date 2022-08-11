package week4day3;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println(id);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println(id+"  "+name);
	}
	
	public void getStudentInfo( String email,int phoneNum) {
		System.out.println(email+"  "+phoneNum);
	}
public static void main(String args[]) {
	Students stud=new Students();
	stud.getStudentInfo(33) ;
	stud.getStudentInfo(89,"raja") ;
	stud.getStudentInfo("raja@gmail.com",99463819) ;
}



}
