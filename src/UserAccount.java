
public class UserAccount{
        private String first;
        private String last;
        private String email;
        private String password;
        private int idNumber

        /**
         * Creates a new account
         * @param first
         * @param last
         * @param email
         * @param password
         */
     public UserAccount(String first, String last, String email, String password,int idNumber) {
         this.first = first;
         this.last = last;
         this.email = email;
         this.password = password;
         this.idNumber = idNumber;
     }
     


     public String getEmail(){
        return email;
     }

     public String getPassword(){
        return password;
     }

     public int getidNumber(){
        return idNumber;
     }

     /**
      * Edits account
      * @param user the user
      */
     public void editAccount(UserAccount user){

     }

     /**
      * Deletes account
      * @param user the user
      */
     public void deleteAccount(UserAccount user){

     }
    }