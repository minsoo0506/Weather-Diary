package zerobase.weather.config;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR) // 500번대 서버 에러 코드
    @ExceptionHandler(Exception.class)
    public Exception handleAllException(){
        System.out.println("error from GlobalExceptionHandler");
        return new Exception();
    }
}
