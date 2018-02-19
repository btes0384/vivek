
public class Student {
	 int id;//data member (also instance variable) 
     String name;//data member(also instance variable) 
     final static String course="java";
     public static void main(String args[]){ 
 
      Student s1=new Student();//creating an object of Student 
      s1.id=1;
      s1.name="sny";
    
      System.out.println(s1.id); 
      System.out.println(s1.name);
      System.out.println(Student.course);
      Student s2=new Student();
      s2.id=2;
      s2.name="vvk";
      System.out.println(s2.id); 
      System.out.println(s2.name);
      System.out.println(Student.course);
     }

	}


