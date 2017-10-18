/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.List;
import modelo.pojo.Login;
import modelo.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author yorch
 */
public class LoginDAO {
    public static List<Login> usuarios(){
        List<Login> users = null;
        
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            
            String hql = "from login";
            Query query = session.createQuery(hql);
            users = query.list();
            
            session.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        return users;
    }
}
