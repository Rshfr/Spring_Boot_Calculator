package ru.neoflex.practice.controller;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "", produces = "application/json")
@OpenAPIDefinition(
        info = @Info(
                title = "Описание контроллера",
                description = "Математические операции над числами",
                contact = @Contact(
                        name = "Лесняк Давыд",
                        email = "16021995cd@gmail.com",
                        url = "https://github.com/Rshfr"
                )
        )
)

@Tag(name = "Калькулятор", description = "Позволяет складывать, вычитать, умножать и делить числа")
public class CalcController {
    @GetMapping("/plus/{a}/{b}")
    @Operation(
            summary = "Сложение"
    )
    public double plus(@PathVariable double a, @PathVariable double b) { return a+b; }

    @GetMapping("/minus/{a}/{b}")
    @Operation(
            summary = "Вычитание"
    )
    public double minus (@PathVariable double a, @PathVariable double b) {
        return a-b;
    }

    @GetMapping("/multiply/{a}/{b}")
    @Operation(
            summary = "Умножение"
    )
    public double multiply(@PathVariable double a, @PathVariable double b) { return a*b;
    }

    @GetMapping("/divide/{a}/{b}")
    @Operation(
            summary = "Деление"
    )
    public double divide(@PathVariable double a, @PathVariable double b)
    {
        if(b==0) { return 0; }

        return a/b;
    }
}