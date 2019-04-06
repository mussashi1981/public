package fitness;

public class GymHall {
	private String hallName;
	private int hallId;
	/**
	 * @return the hallNname
	 */
	public String getHallNname() {
		return hallName;
	}
	/**
	 * @param hallNname the hallNname to set
	 */
	public void setHallNname(String hallNname) {
		this.hallName = hallNname;
	}
	/**
	 * @return the hallId
	 */
	public int getHallId() {
		return hallId;
	}
	/**
	 * @param hallId the hallId to set
	 */
	public void setHalldId(int hallId) {
		this.hallId = hallId;
	}
	public GymHall (String hallName, int hallId) {
		this.hallName = hallName;
		this.hallId = hallId;
	
	}
}
