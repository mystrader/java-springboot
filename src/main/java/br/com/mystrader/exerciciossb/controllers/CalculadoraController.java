package br.com.mystrader.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

//	http://localhost:8080/calculadora/somar/10/8
	@GetMapping("/somar/{a}/{b}")
	public int somar(@PathVariable int a, @PathVariable int b) {
		return a + b;
	}

//	http://localhost:8080/calculadora/subtrair?a=10&b=5
	@GetMapping("/subtrair")
	public int subtrair(@RequestParam (name = "a") int a, @RequestParam (name = "b") int b) {
		return a - b;
	}

}