package za.ac.cput.Factory;
/*L
    @Description: Login Factory ->
    @Author: Asiphiwe Hanjiwe
    @Student Number: 218336675
    @Date: 04 June 2021
 */
import za.ac.cput.Entity.ClientAccount;
import za.ac.cput.Entity.Login;
import za.ac.cput.Util.GenericHelper;

public class LoginFactory {
    public static Login createLogin(String userType,String username)
    {
        String password = GenericHelper.generatePassword();
        Login login = new Login.Builder()
                .setUserType(userType)
                .setUsername(username)
                .setPassword(password)
                .build();
        return login;
    }
}