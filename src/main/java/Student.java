import javax.persistence.*;
@Entity
@Table(name="STUDENT_BATCH")
public class Student {
	@Id
	@GeneratedValue
	@Column(name="STUDENT_ID")
	private long id;
	@Column(name="STUDENT_FIRST_NAME")
	private String firstname;
	@Column(name="STUDENT_LAST_NAME")
	private String lastname;
	@Column(name="COURSE")
	private String section ;
	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Address address;
	
	public Student(String firstName, String lastName, String section) {
		this.firstname=firstName;
		this.lastname=lastName;
		this.section=section;
		
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", section=" + section
				+ "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
}
