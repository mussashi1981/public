package fitness;

public class Equipments {
	private int equipmentId;
	private String equipmentName;
	

	public Equipments(int equipmentId, String equipmentName) {
		this.setEquipmentId(equipmentId);
		this.setEquipmentName(equipmentName);
		
	}
	@Override
	public String toString() {
		return "Echipamentele salii de gimnastica sunt: " + equipmentName ;
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
	 * @return the equipmentName
	 */
	public String getEquipmentName() {
		return equipmentName;
	}
	/**
	 * @param equipmentName the equipmentName to set
	 */
	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}

}