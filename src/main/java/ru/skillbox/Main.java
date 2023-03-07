package ru.skillbox;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import ru.skillbox.dto.Car;
import ru.skillbox.dto.Person;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        //читаем файл из папки resources
        String json = Files.readString(Paths.get("person.json"));

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());

        //преобразуем json строку в объект
        Person person = objectMapper.readValue(json, Person.class);
        System.out.println(person.getName());

        //изменение объекта
        person.setChildren(List.of("Olga", "Petr"));

        Car car = new Car();
        car.setLicensePlate("A111BB777");
        person.setCar(car);

        //запись объекта в json строку
        String newJson = objectMapper.writeValueAsString(person);

        //запись файла в корень проекта
        FileWriter fileWriter = new FileWriter("personModified.json");
        fileWriter.write(newJson);
        fileWriter.close();
    }
}
