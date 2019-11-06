package demo.springdocker.controller;

public class CountryErrorResponse {

	private int status;
	private String message;

	public CountryErrorResponse() {
		
	}

	public CountryErrorResponse(int status, String message, long timeStamp) {
		this.status = status;
		this.message = message;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
