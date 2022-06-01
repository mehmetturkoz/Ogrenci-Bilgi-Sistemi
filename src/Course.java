public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int snote;

    Course(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
        this.snote=0;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(prefix)) {
            this.teacher = teacher;
        }else{
            System.out.println("Hoca ve bolum uyusmuyor!");
        }
    }

    void printTeacher(){
        this.teacher.print();
    }
}
