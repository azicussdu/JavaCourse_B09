package week8.day4;

public class FbAccount {
    private String login;
    private String password;
    private boolean married;
    private int kidsAmount;

    public FbAccount(String login, String password, boolean married, int kidsAmount){
        this.login = login;
        setPassword(password);
        this.married = married;
        setKidsAmount(kidsAmount);
    }

    public void setLogin(String login){
        this.login = login;
    }

    public boolean isValidPassword(String pass){
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        for(int i=0; i<pass.length(); i++){
            if(pass.charAt(i) >= 65 && pass.charAt(i) <= 90){
                hasUppercase = true;
            }
            else
            if(pass.charAt(i) >= 97 && pass.charAt(i) <= 122){
                hasLowercase = true;
            }
            else
            if(pass.charAt(i) >= 48 && pass.charAt(i) <= 57){
                hasDigit = true;
            }
        }

        if(hasLowercase && hasUppercase && hasDigit && pass.length() >= 6)
            return true;
        else
            return false;
    }

    public void setPassword(String password){
        if(isValidPassword(password))
            this.password = password;
        else
            this.password = "Qwerty123"; //default password
    }

    public boolean changePassword(String oldPass, String newPass){
        if(isValidPassword(oldPass) && isValidPassword(newPass) && password.equals(oldPass)){
            password = newPass;
            return true;
        }
        else
            return false;
    }

    public void setMarried(boolean married){
        this.married = married;
    }

    public void setKidsAmount(int kidsAmount){
        if(kidsAmount < 0)
            this.kidsAmount = 0;
        else
            this.kidsAmount = kidsAmount;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public boolean isMarried() {
        return married;
    }

    public int getKidsAmount() {
        return kidsAmount;
    }

    public String toString(){
        String info = "login: " + login + "\n";

        if(married)
            info = info + "you are married\n";
        else
            info = info + "you are single\n";

        info = info + "you have " + kidsAmount + " kids\n";

        return info;
    }
}
