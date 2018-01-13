
public class Doctor {

	private int arMitrwou;
	private String lastname;
	private String firstname;
	private int telephone;
	private String speciality;
	private String department;
	private DbConnector connector;
	
	public Doctor(int arMitrwou, String lastname, String firstname,
			int telephone, String speciality, String department) {
		
		this.arMitrwou = arMitrwou;
		this.lastname = lastname;
		this.firstname = firstname;
		this.telephone = telephone;
		this.speciality = speciality;
		this.department = department;
		
	}
	public int getArMitrwou() {
		return arMitrwou;
	}
	public void setArMitrwou(int arMitrwou) {
		this.arMitrwou = arMitrwou;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
//	public void save(){
//		connector = new Connector(this);
//		this.connector.save();
//	}
//	public void delete(){
//		this.connector.delete();
//	}
//	public Doctor search(int arMitrwou){
//		return (this.connector.search(arMitrwou));
//	}

}
