package SpringAssignment.Assignment_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;


public class DbConnect {
	
	//creating a connection with database and then fetching the list of trainers along with sessions and printing them
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/University","root","Password@02");
			List<Trainer> trainers=Trainer.getAllTrainersWithSessions(con);
			for(Trainer trainer: trainers) {
				System.out.println("Trainer Name: "+trainer.getTrainerName());
				System.out.println("Sessions: ");
				if(trainer.getSessions().size()==0) {
					System.out.println("There are no sessions assigned to this trainer");
				}
				else {
					for(Session session:trainer.getSessions()) {
						System.out.println("Session Name: "+session.getSessionName());
						System.out.println("Session Duration: "+ session.getSessionDuration() + " hours");
					}
					System.out.println();
				}
			}
			con.close();
			
		}
		catch(SQLException e){
			System.out.println(e);
		}
			catch(ClassNotFoundException e) {
			e.printStackTrace();
			}
		}
	}
