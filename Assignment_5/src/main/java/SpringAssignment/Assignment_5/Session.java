package SpringAssignment.Assignment_5;

public class Session {
	private int sessionId;
	private String sessionName;
	private int sessionDuration;
	private int trainerId;
	public int getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}
	public int getSessionId() {
		return sessionId;
	}
	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}
	public String getSessionName() {
		return sessionName;
	}
	public void setSessionName(String sessionName) {
		this.sessionName = sessionName;
	}
	public int getSessionDuration() {
		return sessionDuration;
	}
	public void setSessionDuration(int sessionDuration) {
		this.sessionDuration = sessionDuration;
	}
	@Override
	public String toString() {
		return "Session [sessionId=" + sessionId + ", sessionName=" + sessionName + ", sessionDuration="
				+ sessionDuration + "]";
	}
}
