package fitness;

public class Trainers {
	private int trainerId;
	private String trainerName;
	

	public Trainers(int trainerId, String trainerName) {
		this.setTrainerId(trainerId);
		this.setTrainerName(trainerName);
		
	}
	@Override
	public String toString() {
		return "Antrenorii salii de gimnastica sunt: [ID=" + trainerId + ", nume=" + trainerName+"]";
	}
	/**
	 * @return the trainerName
	 */
	public String getTrainerName() {
		return trainerName;
	}
	/**
	 * @param trainerName the trainerName to set
	 */
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
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

}