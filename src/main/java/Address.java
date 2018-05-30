import javax.persistence.*;


@Entity
@Table(name="ADDRESS_BATCH37")
public class Address {
	
public Address( String street, String city, String country) {
		
		this.street = street;
		this.city = city;
		this.country = country;
	}
@Id
@Column(name="ADDRESS_ID")
private long id;

@Column(name="STREET")
private String street;
@Column(name="CITY")
private String city;

@Column(name="COUNTRY")
private String country;

public Address() {}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
}


