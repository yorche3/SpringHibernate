/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.dao.LoginDAO;
import modelo.pojo.Login;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author yorch
 */
public class LoginController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        ModelAndView mv = new ModelAndView("login");
        
        try {
            List<Login> users = LoginDAO.usuarios();
            
            mv.addObject(users);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
        return mv;
    }
    
}
