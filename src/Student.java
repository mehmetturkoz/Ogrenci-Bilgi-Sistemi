public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name,String stuNo,String classes,Course c1,Course c2,Course c3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.avarage=0.0;
        this.isPass=false;
    }

    void addBulkExamNote(int note1,int note2,int note3,int snote1,int snote2,int snote3){
        if((note1>=0 && note1<=100) && (snote1>=0 && snote1<=100)) {
            this.c1.note = note1;
            this.c1.snote=snote1;
        }
        if((note2>=0 && note2<=100) && (snote2>=0 && snote2<=100)) {
            this.c2.note = note2;
            this.c2.snote=snote2;
        }
        if((note3>=0 && note3<=100) && (snote3>=0 && snote3<=100)) {
            this.c3.note = note3;
            this.c3.snote=snote3;
        }

    }

    void avarageCal(){
        double n1 = (this.c1.note*0.8 + this.c1.snote*0.2);
        double n2 = (this.c2.note*0.7 + this.c2.snote*0.3);
        double n3 = (this.c3.note*0.6 + this.c3.snote*0.4);

        this.avarage=(n1+n2+n3)/3.0;
    }

    void isPass(){
        avarageCal();
        if(this.avarage<55){
            System.out.println("Sinifta Kaldiniz.");
        }else{
            System.out.println("Sinifi Gectiniz");
        }
        printNote();
    }

    void printNote(){
        System.out.println(this.c1.name+" Notu\t:"+this.c1.note);
        System.out.println(this.c2.name+" Notu\t:"+this.c2.note);
        System.out.println(this.c3.name+" Notu\t:"+this.c3.note);
        System.out.println("Ortalamaniz:"+this.avarage);
    }

}
