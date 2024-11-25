package vn.iotstar.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LoginResponse {
	private String token;
	
	private long expiresIn;
	
	public String getToken() {
		return token;
	}

	public void setToken(String jwtToken) {
		// TODO Auto-generated method stub
		
	}

	public void setExpiresIn(long expirationTime) {
		// TODO Auto-generated method stub
		
	}
}
