package com.develop.Course.Management.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response {
    private int statusCode;
    private String message;
    private String token;
    private String role;
    private String expirationTime;
    private UserDto userDto;
    private List<UserDto> userDtoList;
}
