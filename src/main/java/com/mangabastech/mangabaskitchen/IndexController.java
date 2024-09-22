package com.mangabastech.mangabaskitchen;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Arrays;

import java.util.List;

@Controller
public class IndexController {

        private final List<Funcionarios> funcionarios;

        public IndexController() {
                this.funcionarios = Arrays.asList(
                                new Funcionarios("Glauco Rocha", "28593847213", "glaucorocha@gmail.com",
                                                "Londrina, Rua Serra dos Mangabeiros, 104", "cozinheiro", "C174NC4C"),
                                new Funcionarios("Paula Mendes", "23572457244", "paulamendes@gmail.com",
                                                "Londrina, Rua Serra dos Mangabeiros, 154", "garçom", "CN1573FC"),
                                new Funcionarios("Carlos Moura", "13461361536", "carlosmoura@gmail.com",
                                                "Londrina, Rua Serra dos Mangabeiros, 224", "garçom", "MV628053"),
                                new Funcionarios("Rafaela Cruz", "38543571416", "rafaelacruz@gmail.com",
                                                "Londrina, Rua Serra dos Mangabeiros, 285", "cozinheiro", "26lki353"),
                                new Funcionarios("Fernando Silva", "28394738215", "fernandosilva@gmail.com",
                                                "Londrina, Rua Das Flores, 105", "garçom", "HF923LF2"),
                                new Funcionarios("Camila Almeida", "37294738516", "camilaalmeida@gmail.com",
                                                "Londrina, Rua Das Flores, 210", "cozinheiro", "LA924DG4"),
                                new Funcionarios("Pedro Farias", "56473829101", "pedrofarias@gmail.com",
                                                "Londrina, Av. Brasil, 145",
                                                "cozinheiro", "9JKU4738"),
                                new Funcionarios("Ana Beatriz Souza", "23984758216", "anabeatriz@gmail.com",
                                                "Londrina, Av. Paraná, 210", "garçom", "NC3584D9"),
                                new Funcionarios("João Marcos", "39584729164", "joaomarcos@gmail.com",
                                                "Londrina, Rua Tiradentes, 312",
                                                "garçom", "SD0295PL"),
                                new Funcionarios("Mariana Lopes", "47829371584", "marianalopes@gmail.com",
                                                "Londrina, Rua Alvorada, 87",
                                                "cozinheiro", "AS7261QR"),
                                new Funcionarios("Lucas Pereira", "58472639215", "lucaspereira@gmail.com",
                                                "Londrina, Av. JK, 115",
                                                "garçom", "QW5412JK"),
                                new Funcionarios("Bruna Santos", "92738472653", "brunasantos@gmail.com",
                                                "Londrina, Rua dos Jacarandás, 452", "garçom", "AK4739MS"),
                                new Funcionarios("Henrique Costa", "62739475826", "henriquecosta@gmail.com",
                                                "Londrina, Rua das Palmeiras, 512", "cozinheiro", "ZX4785TR"),
                                new Funcionarios("Renata Oliveira", "92837465192", "renataoliveira@gmail.com",
                                                "Londrina, Rua dos Cedros, 98", "garçom", "UI9203KL"),
                                new Funcionarios("Daniel Gomes", "38472639104", "danielgomes@gmail.com",
                                                "Londrina, Rua das Acácias, 172", "cozinheiro", "PL9372UJ"),
                                new Funcionarios("Juliana Lima", "17482937456", "julianalima@gmail.com",
                                                "Londrina, Rua dos Ipês, 76",
                                                "garçom", "HY8263FT"));
        }

        @GetMapping("/dynamic")
        public String dynamic(Model model) {
                model.addAttribute("funcionarios", this.funcionarios);
                return "dynamic";
        }

        @GetMapping("/")
        public String index() {
                return "index";
        }
}
