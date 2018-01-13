import java.sql.Time;
import java.util.Date;

public class Appointment {
	
	private Date day;
	private Time time;
	private int amkaPatient;
	private int arMitrwoyDoctor;
	private String info;
	private DbConnector connector;
	
	public Appointment(Date day, Time time, int amkaPatient, int arMitrwoyDoctor, String info) {
		this.day = day;
		this.time = time;
		this.amkaPatient = amkaPatient;
		this.arMitrwoyDoctor = arMitrwoyDoctor;
		this.info = info;
	}
	public Date getDay() {
		return day;
	}
	public void setDay(Date day) {
		this.day = day;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public int getAmkaPatient() {
		return amkaPatient;
	}
	public void setAmkaPatient(int amkaPatient) {
		this.amkaPatient = amkaPatient;
	}
	public int getArMitrwoyDoctor() {
		return arMitrwoyDoctor;
	}
	public void setArMitrwoyDoctor(int arMitrwoyDoctor) {
		this.arMitrwoyDoctor = arMitrwoyDoctor;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
}
