/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PacotePrincipal.Model.DAO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author pedro
 */



public class GenericDAO {
    

 
public class ConnectionFactory {
 
 private EntityManagerFactory factory = Persistence.createEntityManagerFactory("dao-generico");
 
 public static EntityManager getEntityManager(){
 return factory.createEntityManager();
 }
 
}
}
