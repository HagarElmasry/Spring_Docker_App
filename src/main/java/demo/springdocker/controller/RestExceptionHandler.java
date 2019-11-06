package demo.springdocker.controller;

import java.net.ConnectException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<CountryErrorResponse> handleRestException(Exception exc) {

		CountryErrorResponse error = new CountryErrorResponse();

		if (exc instanceof ConnectException) {
			error.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
			error.setMessage("INTERNAL_ERROR");
			return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);

		} else if (exc instanceof CodeNotFoundException) {
			error.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
			error.setMessage(exc.getMessage());
			return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
			
		} else {
			return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
		}
	}

}