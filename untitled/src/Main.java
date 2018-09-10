public class Main {
    public static class Student{
        String name;
        int id;
        int year;

        public Student(String name2,int id2){
            name=name2;
            id=id2;
            year=1;
        }

        public String get_name(){
            return name;
        }

        public int get_id(){
            return id;
        }

        public void increment_year(){
            year++;
        }
    }
    public static void main(String[] args) {
	// write your code here
        Student s1=new Student("Dana",110508);
        s1.increment_year();
        System.out.println(s1.get_name());
        System.out.println(s1.get_id());
        System.out.print(s1.year);
    }
}
