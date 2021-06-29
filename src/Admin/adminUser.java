package Admin;

/**
 *
 * @jakareya
 */
public class adminUser {
        private final String id;
        private final String contact;
        private final String email;
        private final String others;
    
     public adminUser(String id,String contact, String email, String others){
            this.id = id;
            this.contact = contact;
            this.email = email;
            this.others = others;
            
     }
    public String getID(){
        return id;
    }
 
    public String getContact(){
        return contact;
    }
    public String getEmail(){
        return email;
    }
    public String getOther(){
        return others;
    }
}
