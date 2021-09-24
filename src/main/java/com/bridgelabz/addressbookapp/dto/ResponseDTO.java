package com.bridgelabz.addressbookapp.dto;


import lombok.*;

import javax.validation.constraints.NotEmpty;

@Data
@ToString
@Getter
@Setter
@NoArgsConstructor
public class ResponseDTO {
    private String message;
    private Object data;

    public ResponseDTO(String message, Object data) {
        this.message = message;
        this.data = data;
    }


}
