package doctor_online_booking;
public class Email_validation {
    boolean isvalid(String mail){
        String symbols="@gmail.com";
        boolean Email=false;
        if(mail.matches(symbols)){
            Email= false;
        }else if(mail.contains(symbols)){
            Email= true;
        }
        return Email;
    }
}
