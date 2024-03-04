package mx.edu.utez.sa.ProyectoEncriptacion.Demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/davidprueba/")
@RequiredArgsConstructor
public class DemoController {
    
    @PostMapping(value = "david")
    public String welcome()
    {
        return "Hola JosaPug";
    }
}
