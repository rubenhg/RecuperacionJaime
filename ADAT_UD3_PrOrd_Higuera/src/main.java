import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import controlador.controloNotas;
import modelo.Notas;

public class main {

	public static void main(String[] args) {
		EntityManager em = null;
		EntityManagerFactory ent;
		controloNotas control = new controloNotas();
		Scanner sc = new Scanner(System.in);
		Notas notaa = new Notas();

		System.out.println("Bienvenido - elija una opción:\n1.Mostrar Datos\n2.Insert\n3.Update\n4.Delete\n0.Exit App");
		int op = sc.nextInt();
		switch (op) {
		case 1:
			control.getAlumnos();
			break;
			// insert notas
		case 2:
			
			System.out.println("inserte nota");
			
			int not = sc.nextInt();
			notaa.setNota(not);
			control.Insertar(notaa);

			break;
		case 3:
			// update notas

			System.out.println("Agrega el ID de la nota:");
			int id = sc.nextInt();

			em.getTransaction().begin();
			notaa = em.find(Notas.class, id);

			System.out.println("Cambie la nota");
			int nota21 = sc.nextInt();
			notaa.setNota(nota21);

			control.update(notaa);

			break;

		case 4:
			//delete notas
			System.out.println("Agrega el id de la nota a eliminar:");
			int idAu = sc.nextInt();
			em.getTransaction().begin();
			notaa = em.find(Notas.class, idAu);
			em.remove(notaa);
			try {
				em.getTransaction().commit();
			} catch (Exception e) {
				System.err.println("Fail");
				e.printStackTrace();
			}
			System.out.println("funciona el delete");

			break;
		default:
			break;
		}

	}
}