
public class UserAccount{
        private String first;
        private String last;
        private String email;
        private String password;

        /**
         * Creates a new account
         * @param first
         * @param last
         * @param email
         * @param password
         */
     public UserAccount(String first, String last, String email, String password) {
         this.first = first;
         this.last = last;
         this.email = email;
         this.password = password;
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