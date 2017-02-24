package controlador;

import java.util.ArrayList;
import java.util.List;

import javax.management.NotificationBroadcasterSupport;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import controlador.HibernateUtil;
import modelo.Alumnos;
import modelo.Notas;
import modelo.Asignaturas;


public class controloNotas {
	
	public List<Alumnos> getAlumnos() {
		List<Alumnos> alumnos = new ArrayList<Alumnos>();
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			trns = session.beginTransaction();
			alumnos = session
					.createQuery(
							"SELECT A.APELLIDO_NOMBRE,S.NOMBRE,S.DEPARTAMENTO ,N.nota FROM bbdd_escuela.alumnos A,bbdd_escuela.asignaturas S ,bbdd_escuela.notas N WHERE N.asignatura=S.CODIGO  ;")
					.list();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return alumnos;
	}
	
	public void Insertar(Notas nota) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.save(nota);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
    }
	 public void delete(int idAU) {
	        Transaction trns = null;
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        try {
	            trns = session.beginTransaction();
	            Alumnos alumno = (Alumnos) session.load(Alumnos.class, new Integer(idAU));
	            session.delete(idAU);
	            session.getTransaction().commit();
	        } catch (RuntimeException e) {
	            if (trns != null) {
	                trns.rollback();
	            }
	            e.printStackTrace();
	        } finally {
	            session.flush();
	            session.close();
	        }
	    }
	 public void update(Notas nota) {
	        Transaction trns = null;
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        try {
	            trns = session.beginTransaction();
	            session.update(nota);
	            session.getTransaction().commit();
	        } catch (RuntimeException e) {
	            if (trns != null) {
	                trns.rollback();
	            }
	            e.printStackTrace();
	        } finally {
	            session.flush();
	            session.close();
	        }
	    }
}
