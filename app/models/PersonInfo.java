package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import play.db.jpa.GenericModel;
import play.libs.Codec;

@Entity
@Table(name = "person_info")
public class PersonInfo extends GenericModel{

	@Id
	public String id;
	
	@Column(name = "name")
	public String name;
	
	@Column(name = "age")
	public Integer age;
	
	public PersonInfo(){
		id = Codec.UUID().replace("-", "").toUpperCase();
	}
	
}
