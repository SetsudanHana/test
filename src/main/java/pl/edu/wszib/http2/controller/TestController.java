package pl.edu.wszib.http2.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Date;

@Controller
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public String test(Model model) {
        model.addAttribute("imie", "Mateusz");
        model.addAttribute("pokaz", false);
        model.addAttribute("kolory",
                Arrays.asList("Niebieski", "Zolty", "Czerwony"));
        model.addAttribute("teraz", new Date());
        return "test";
    }

}
