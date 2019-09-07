package inheritance;
interface parent{
     void department();
     void role();
}
interface teacher extends parent{
    void subjects();
}
interface Math_teacher extends parent, teacher{
    void division();
}
public class Interface1 implements Math_teacher{
    public static void main(String[] args) {
        Interface1 n =new Interface1();
        n.division();
        n.department();
        n.role();
        n.subjects();
    }

   public void department(){
       System.out.println("department:humanities");
   }
   public void role(){
       System.out.println("math teacher");
   }
   public void subjects(){
       System.out.println("math");
   }
   public void division(){
       System.out.println("IT");
   }
}
