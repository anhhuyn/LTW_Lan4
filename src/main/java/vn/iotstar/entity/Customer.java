package vn.iotstar.entity;

import groovy.transform.ToString;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Customer {
	
	private String id;
	private String name;
	private String phoneNumber;
	private String email;
	
	 public Customer() {
	    }

	   
	    public Customer(String id, String name, String phoneNumber, String email) {
	        this.id = id;
	        this.name = name;
	        this.phoneNumber = phoneNumber;
	        this.email = email;
	    }

	   
	    public String getId() {
	        return id;
	    }

	    public void setId(String id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getPhoneNumber() {
	        return phoneNumber;
	    }

	    public void setPhoneNumber(String phoneNumber) {
	        this.phoneNumber = phoneNumber;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	  
	    @Override
	    public String toString() {
	        return "Customer{" +
	                "id='" + id + '\'' +
	                ", name='" + name + '\'' +
	                ", phoneNumber='" + phoneNumber + '\'' +
	                ", email='" + email + '\'' +
	                '}';
	    }

	   
	    public static class Builder {
	        private String id;
	        private String name;
	        private String phoneNumber;
	        private String email;

	        public Builder id(String id) {
	            this.id = id;
	            return this;
	        }

	        public Builder name(String name) {
	            this.name = name;
	            return this;
	        }

	        public Builder phoneNumber(String phoneNumber) {
	            this.phoneNumber = phoneNumber;
	            return this;
	        }

	        public Builder email(String email) {
	            this.email = email;
	            return this;
	        }

	        public Customer build() {
	            return new Customer(id, name, phoneNumber, email);
	        }
	    }

	    public static Builder builder() {
	        return new Builder();
	    }
}