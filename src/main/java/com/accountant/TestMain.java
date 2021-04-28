package com.accountant;
/*
Попробую передать создание классов спринг контейнеру, и как понимаю самым верным вариантом будет-
при помощи джава конфигов ( так как мне нада прописывать имена и тд)

 */

import com.accountant.entities.Wallet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.accountant.configs.SpringConfig;
import com.accountant.entities.UserAccount;
import com.accountant.entities.Wallet;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class); //or "com.accountant"

        Wallet wallet1 = context.getBean("walletBean",Wallet.class);
        wallet1.setName("myWallet");
        wallet1.setBalance(777);
        wallet1.info();
        //я пока что хз как сразу создавать с нужными значениями сразу :(

        AnnotationConfigApplicationContext context2 =
                new AnnotationConfigApplicationContext(SpringConfig.class); //or "com.accountant"
        UserAccount user1 = context2.getBean("userAccountBean",UserAccount.class);
        user1.setName("Ivan");
        user1.setSurname("Ivanov");
        user1.setWallet(wallet1);
        user1.info();

        //hibernate
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Wallet.class).buildSessionFactory();

        try {
            //записали в таблицу кошелек
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            session.save(wallet1);
            session.getTransaction().commit();

            //получаем данные кошелька
            int myId = wallet1.getId();
            session = factory.getCurrentSession();
            session.beginTransaction();
            wallet1 = session.get(Wallet.class, myId); //(Wallet.class, myId); or (Wallet.class, 4);
            //Wallet wallet = session.get(Wallet.class, myId); //разобраться потом, как получить норм по myId
            session.getTransaction().commit();
            //System.out.println(" wallet id - " + myId);
            System.out.println(wallet1);
        }
        finally {
            factory.close();
        }



    }
}


/*
SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Wallet.class).buildSessionFactory();

        Session session = factory.getCurrentSession();
 ==========================
  //записали в таблицу кошелек
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Wallet.class).buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            session.save(wallet1);
            session.getTransaction().commit();
        }
        finally {
            factory.close();
        }
        ===================================
        try {
            //записали в таблицу кошелек
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            session.save(wallet1);
            session.getTransaction().commit();

            //получаем данные кошелька
            int myId = wallet1.getId();
            session = factory.getCurrentSession();
            session.beginTransaction();
            //wallet1 = session.get(Wallet.class, myId); //(Wallet.class, myId); or (Wallet.class, 4);
            Wallet wallet = session.get(Wallet.class, myId);
            session.getTransaction().commit();
            System.out.println(wallet);
        }
        finally {
            factory.close();
        }
 */