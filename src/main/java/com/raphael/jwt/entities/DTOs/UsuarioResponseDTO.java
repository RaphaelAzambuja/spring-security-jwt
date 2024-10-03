package com.raphael.jwt.entities.DTOs;

import com.raphael.jwt.entities.enums.Role;

public record UsuarioResponseDTO(String login, Role role) {}
