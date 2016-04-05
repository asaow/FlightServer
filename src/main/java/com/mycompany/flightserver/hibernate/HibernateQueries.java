/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.flightserver.hibernate;

import com.mycompany.flightserver.model.Airport;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author asa
 */
public class HibernateQueries {

    SessionFactory sessionFactory = MyHibernateUtil.getSessionFactory();

    /**
     * Metoden getAirport hämtar en flygplats, dvs ett objekt av Airport, med id
     * = airportId
     *
     * @param airportId
     * @return
     */
    
    
    public Airport getAirport(int airportId) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Airport a = (Airport) session.get(Airport.class, airportId);

        session.getTransaction().commit();
        session.close();

        return a;
    }

    /*
    public Question getQuestion(int questionId) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Question q = (Question) session.get(Question.class, questionId);
        Collection<Answer> answers = q.getAnswers();
        for (Answer a : answers) {
            System.out.println(a.getId() + ", " + a.getCorrect());
        }
        session.getTransaction().commit();
        session.close();

        return q;

    }

    
    public List<Question> getQuestions() {
        Session session = sessionFactory.openSession();
        System.out.println("Början av session");

        session.beginTransaction();
        List<Question> questions = session.createCriteria(Question.class).list();
        for (Question q : questions){
            q.getAnswers();
        }
        System.out.println("size: " + questions.size());
        System.out.println("after get session");
        session.getTransaction().commit();
        //session.close();
        return questions;

    }

    public Question createQuestion(Question q) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(q);

        session.getTransaction().commit();
        session.close();

        return q;

    }

    public void deleteQuestion(int questionId) {
        SessionFactory sessionFactory = MyHibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Question q = (Question) session.get(Question.class, questionId);
        session.delete(q);

        session.getTransaction().commit();
        session.close();
    }*/
}
