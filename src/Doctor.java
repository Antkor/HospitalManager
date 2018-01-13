
public class Doctor {

	private int arMitrwou;
	private String lastname;
	private String firstname;
	private String telephone;
	private String speciality;
	private int department;
	private DbConnector connector;
	
	public Doctor(int arMitrwou, String lastname, String firstname,
			String telephone, String speciality, int department) {
		
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
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public int getDepartment() {
		return department;
	}
	public void setDepartment(int department) {
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
