package com.example.employeeapp1.DTO;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString

public class ResponseDTO {

    private String message;
    private Object data;

//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
//
//    public Object getData() {
//        return data;
//    }
//
//    public void setData(Object data) {
//        this.data = data;
//    }
//
    public ResponseDTO(String message, Object data) {
        this.message = message;
        this.data = data;
    }



//    @Override
//    public String toString() {
//        return "ResponseDTO{" +
//                "message='" + message + '\'' +
//                ", data=" + data +
//                '}';
//    }
}

