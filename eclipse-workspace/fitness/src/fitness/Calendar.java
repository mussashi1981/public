package fitness;

public class Calendar {
	private String calendarId;
	private int trainerId;
	private int equipmentId;
	private int memberId;


	public Calendar(String calendarId, int memberId, int trainerId, int equipmentId) {
		this.calendarId = calendarId;
		this.memberId = memberId;
		this.trainerId = trainerId;
		this.equipmentId = equipmentId;
	}
		
	@Override
	public String toString() {
		return "Calendarul are urmatoarele inregistrari [ID=" + calendarId + ", nume=" + memberId + ", trainer=" + trainerId + ", equipment="+ equipmentId +"]";
	}

	/**

	 */
	public String getCalendarId() {
		return calendarId;
	}
	/**
	 * @param calendarId the calendarId to set
	 */
	public void setCalendarId(String calendarId) {
		this.calendarId = calendarId;
	}
	/**
	 * @return the trainerId
	 */
	public int getTrainerId() {
		return trainerId;
	}
	/**
	 * @param trainerId the trainerId to set
	 */
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}
	/**
	 * @return the equipmentId
	 */
	public int getEquipmentId() {
		return equipmentId;
	}
	/**
	 * @param equipmentId the equipmentId to set
	 */
	public void setEquipmentId(int equipmentId) {
		this.equipmentId = equipmentId;
	}
	/**
	 * @return the memberId
	 */
	public int getMemberId() {
		return memberId;
	}
	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

}