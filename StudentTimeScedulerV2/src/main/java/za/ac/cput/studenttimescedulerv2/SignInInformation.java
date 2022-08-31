/*
* Ferdouz Allie 214038033
 * New updated version of last github upload
 * POJO class for sign in
 * incomplete, toString still needs to be added
 */
package createaccountscene;

public class SignInInformation {
    private String FirstName;
    private String Password;
    private String StudNum;
    
    public SignInInformation(){
        
        this.FirstName = "";
        this.Password = "";
        this.StudNum = "";
        
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getStudNum() {
        return StudNum;
    }

    public void setStudNum(String StudNum) {
        this.StudNum = StudNum;
    }


}
