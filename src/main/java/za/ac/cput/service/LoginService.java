package za.ac.cput.service;

import za.ac.cput.entity.Login;
import za.ac.cput.repository.login.LoginRepository;
import za.ac.cput.service.login.ILoginService;
import java.util.Set;
/*
    @Description: Login Service ->
    @Author: Asiphiwe Hanjiwe
    @Student Number: 218336675
    @Date: 30 July 2021
 */
public class LoginService implements ILoginService {
    private static LoginService service = null;
      private LoginRepository repo = null;

      private LoginService() {
        this.repo = LoginRepository.getRepository();
      }

    public static LoginService getService() {
        if (service == null) {
            service = new LoginService();
        }
        return service;
    }

    @Override
    public Login create(Login userType) {
        return this.repo.create(userType);
    }

    @Override
    public Login read(String username) {
        return this.repo.read(username);
    }

    @Override
    public Login update(Login userType) {
        return this.repo.update(userType);
    }

    @Override
    public boolean delete(String username) {
        return this.repo.delete(username);
    }

    @Override
    public Set<Login> getAll() {
        return this.repo.getAll();
    }
}
