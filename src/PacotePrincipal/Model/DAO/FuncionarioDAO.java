/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacotePrincipal.Model.DAO;

import PacotePrincipal.Model.Funcionario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.spi.PersistenceProvider;
import org.hibernate.jpa.HibernatePersistenceProvider;


/**
 *
 * @author pedro
 */
public class FuncionarioDAO {
//   public EntityManager getEntityManager(){
//   //EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoSorveteriaPU");
//   EntityManagerFactory factory = Persistence.createEntityManagerFactory("ProjetoSorveteriaPU");
//   return factory.createEntityManager();
//   
//   //PersistenceProvider provider = new HibernatePersistenceProvider();
//  // EntityManagerFactory emf = provider.createEntityManagerFactory(emName, map);
//   
//   }
   
   public Funcionario salvar(Funcionario funcionario){
   
       System.out.println("CHECAGEM SALVAR" + funcionario + "Valore são esses");    
   EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoSorveteriaPU");
   EntityManager em = emf.createEntityManager();
   
   em.getTransaction().begin();
   em.persist(funcionario);                                     //executa um insert
   em.getTransaction().commit();
   em.close();
   emf.close();
   
   
   return funcionario;
   }
   
   
   
   
   
   
}
