package com.vou.user_be.adapter.in.web.exception;

import com.vou.user_be.adapter.in.web.exception.authenticate.MissingDataException;
import com.vou.user_be.adapter.in.web.exception.authenticate.UserDataExists;
import com.vou.user_be.adapter.in.web.exception.authenticate.UserUnverified;
import com.vou.user_be.adapter.in.web.exception.authenticate.WrongPassword;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

    // Xử lý lỗi chung khi không tìm thấy dữ liệu
    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<Object> handleResourceNotFoundException(ResourceNotFoundException ex) {
        ErrorResponse errorResponse = new ErrorResponse("Resource not found", ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    // Xử lý lỗi khi có lỗi xác thực người dùng
    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<Object> handleInvalidUserException(UserNotFoundException ex) {
        ErrorResponse errorResponse = new ErrorResponse("Invalid user", ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    // Xử lý lỗi chung không xác định
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleGeneralException(Exception ex) {
        ErrorResponse errorResponse = new ErrorResponse("Internal server error", ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(UserDataExists.class)
    public ResponseEntity<Object> handleUserDataExists(UserDataExists ex) {
        ErrorResponse errorResponse = new ErrorResponse("User data exists", ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(MissingDataException.class)
    public ResponseEntity<Object> handleMissingDataException(MissingDataException ex) {
        ErrorResponse errorResponse = new ErrorResponse("Missing data", ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UserUnverified.class)
    public ResponseEntity<Object> handleUserUnverified(UserUnverified ex) {
        ErrorResponse errorResponse = new ErrorResponse("User unverified", ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(WrongPassword.class)
    public ResponseEntity<Object> handleWrongPassword(WrongPassword ex) {
        ErrorResponse errorResponse = new ErrorResponse("Wrong password", ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    // Định nghĩa đối tượng ErrorResponse để trả về thông tin lỗi chi tiết
    public static class ErrorResponse {
        private String error;
        private String message;

        public ErrorResponse(String error, String message) {
            this.error = error;
            this.message = message;
        }

        // Getter and Setter
        public String getError() {
            return error;
        }

        public void setError(String error) {
            this.error = error;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}