/*
 * Ferdouz Allie 214038033
 * New updated version of last github upload
 * POJO class for create account
 * incomplete, toString still needs to be added
 */
package createaccountscene;

public class AccountInformation {
    private String FirstName;
    private String LastName;
    private String Email;
    private String Password;
    private String StudNum;
    
    public AccountInformation(){
        this.FirstName = "";
        this.LastName = "";
        this.Email = "";
        this.Password = "";
        this.StudNum = "";
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
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
