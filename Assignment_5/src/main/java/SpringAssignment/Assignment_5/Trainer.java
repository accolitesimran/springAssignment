package SpringAssignment.Assignment_5;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Trainer {
	
	private int trainerId;
	private String trainerName;
	private List<Session> sessions;
	public int getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public List<Session> getSessions() {
		return sessions;
	}
	public void setSessions(List<Session> list) {
		this.sessions = list;
	}
	
	
	public static List<Trainer> getAllTrainersWithSessions(Connection con) throws SQLException{
		List<Trainer> trainers=new ArrayList<>();
		String query="SELECT Trainer.*,Session.*"+"FROM Trainer "+"LEFT JOIN Session  ON Trainer.trainerId=Session.trainerId";
		try (
			Statement stmt=con.createStatement();
			ResultSet resultSet=stmt.executeQuery(query);
		){
			Map<Integer,Trainer> trainerMap=new HashMap<>();
			while(resultSet.next()) {
				int trainerId=resultSet.getInt("trainerId");
				Trainer trainer=trainerMap.getOrDefault(trainerId, new Trainer());
				//if the entry is not present in the map
				if(trainer.getTrainerId()==0) {
					trainer.setTrainerId(trainerId);
					trainer.setTrainerName(resultSet.getString("trainerName"));
				    trainer.setSessions(new ArrayList<Session>());
				    trainerMap.put(trainerId, trainer);
				}
				int sessionId=resultSet.getInt("sessionId");
				if(sessionId!=0) {
					Session session=new Session();
					session.setSessionId(sessionId);
					session.setSessionName(resultSet.getString("sessionName"));
					session.setSessionDuration(resultSet.getInt("sessionDuration"));
					trainer.getSessions().add(session);
				}
			}
			trainers.addAll(trainerMap.values());
		}
		return trainers;
	}
	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", trainerName=" + trainerName + ", sessions=" + sessions + "]";
	}
}
