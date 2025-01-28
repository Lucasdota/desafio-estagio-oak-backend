package com.oak.backend.dtos;

import java.math.BigDecimal;

public record ProductDTO(String name, String description, BigDecimal price) {
}
