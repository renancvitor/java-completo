package Application;

import Domain.People;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {

    public static void main(String[] args) {

        //Bellow, datas to be created in the DB:
    //        People p1 = new People(null, "Carl Red", "carl@gmail.com");
    //        People p2 = new People(null, "Joe White", "joe@gmail.com");
    //        People p3 = new People(null, "Anna Orange", "anna@gmail.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        //Bellow exemples of codes to create datas in the DB:
//        em.getTransaction().begin();
//        em.persist(p1);
//        em.persist(p2);
//        em.persist(p3);
//        em.getTransaction().commit();

        //Bellow exemple to find/print IDs from DB:
//        People p = em.find(People.class, 2);
//        System.out.println(p);

        //Bellow how to delete/remove IDs from DB:
        People p = em.find(People.class, 2);
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();

        System.out.println("Done!");
        em.close();
        emf.close();
    }
}
