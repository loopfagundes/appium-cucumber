package dev.codex.factory.dataFactory;

import com.github.javafaker.Faker;

import dev.codex.dto.dataDTO.DataDTO;

import java.util.Locale;

public class DataFactory {

    public static DataDTO dataDto() {
        return new DataDTO(
                Faker.instance().name().firstName(),
                Faker.instance().name().lastName(),
                Faker.instance(Locale.forLanguageTag("pt-BR")).address().zipCode()
        );
    }
}