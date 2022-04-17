package behavioral.command;

public class Database {

   public void insert(){
        print("insert");
    }
   public void update(){
       print("update");

   }
   public void select(){
       print("select");

   }
   public void delete(){
       print("delete");

   }


   private void print(String action){
       System.out.println(action);
   }
}
