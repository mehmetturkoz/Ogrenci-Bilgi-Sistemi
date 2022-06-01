public class Main {
    public static void main(String[] args){

        Teacher t1=new Teacher("Mahmut Hoca","TRH","05555");
        Teacher t2=new Teacher("Ahmet Hoca","FZK","04444");
        Teacher t3=new Teacher("Kul Yutmaz","BIO","03333");

        Course tarih=new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Course fizik=new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);

        Course biyo=new Course("Biyoloji","103","BIO");
        biyo.addTeacher(t3);

        Student s1=new Student("inek saban","001","4",tarih,fizik,biyo);
        s1.addBulkExamNote(90,90,90,90,90,90);
        s1.isPass();

        Student s2=new Student("ahmet ogrenci","002","5",tarih,fizik,biyo);
        s1.addBulkExamNote(80,80,80,80,80,80);
        s1.isPass();


    }
}
