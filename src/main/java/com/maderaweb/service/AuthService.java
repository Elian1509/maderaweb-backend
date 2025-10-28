package com.maderaweb.service;

import com.maderaweb.dto.AuthRequest;
import com.maderaweb.dto.AuthResponse;
import com.maderaweb.dto.RegisterRequest;

public interface AuthService {

    AuthResponse register(RegisterRequest request);

    AuthResponse login(AuthRequest request);

}
