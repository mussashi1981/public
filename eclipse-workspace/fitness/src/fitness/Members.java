package fitness;

public class Members {
	private int membersId;
	private String membersName;
	private String membersAddress;
	private String membersPhone;


	
	public Members(int membersId, String membersName, String membersAddress, String membersPhone) {
		this.setMembersId (membersId);
		this.setMembersName(membersName);
		this.setMembersAddress(membersAddress);
		this.setMembersPhone(membersPhone);
	}
	private void setMembersId(int membersId2) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "Membrul salii de gimastica [ID=" + membersId + ", nume=" + membersName + ", Adresa=" + membersAddress + ", Telefon="+ membersPhone +"]";
	}
	/**
	 * @return the membersPhone
	 */
	public String getMembersPhone() {
		return membersPhone;
	}
	/**
	 * @param membersPhone the membersPhone to set
	 */
	public void setMembersPhone(String membersPhone) {
		this.membersPhone = membersPhone;
	}
	/**
	 * @return the membersAddress
	 */
	public String getMembersAddress() {
		return membersAddress;
	}
	/**
	 * @param membersAddress the membersAddress to set
	 */
	public void setMembersAddress(String membersAddress) {
		this.membersAddress = membersAddress;
	}
	/**
	 * @return the membersName
	 */
	public String getMembersName() {
		return membersName;
	}
	/**
	 * @param membersName the membersName to set
	 */
	public void setMembersName(String membersName) {
		this.membersName = membersName;
	}

}