// dto/UserResponse.java
package com.chess4everyone.backend.dto.user;

public record UserResponse(Long id, String name, String email, String phone, String provider) {}
