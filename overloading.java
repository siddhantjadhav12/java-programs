

    class Student{
        String name;
        int age;
        
        public void printInfo(String name) {
            System.out.println(name);

        }
        public void printInfo(int age) {          //polymorphisema oveloading compile time
            System.out.println(age);
        }
        public void printInfo(String name,int age){
            System.out.println(name + " " + age);
        } 
    }

    public class overloading{
        public static void main(String Args[])
        {
            Student s1 = new Student();
            s1.name = "siddhant";
            s1.age = 23;

            s1.printInfo(s1.name,s1.age);

        }
    }
