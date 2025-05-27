package dev.codex.factory.dataFactory;

import dev.codex.dto.dataDTO.DataDTO;

public class DataFactory {
    public static DataDTO dataDto() {
        return new DataDTO(
                "Ricardo",
                "Costa",
                "91110000"
        );
    }
}