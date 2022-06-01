public class Teacher {
   String name;
   String phone;
   String branch;

   Teacher(String name,String branch,String phone) {
       this.name = name;
       this.branch = branch;
       this.phone = phone;
   }

       void print(){
           System.out.println("Adi :"+this.name);
           System.out.println("Telefon :"+this.phone);
           System.out.println("Bolum :"+this.branch);

   }
}
