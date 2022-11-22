/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nicolle.Bus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author nicolle
 */
@Controller
public class HomeController {
    
    @RequestMapping("/hello")
   public String showHello(Model model){
    model.addAttribute("saludo", "Vamos a empezar");
    return "hello";
    }
   @RequestMapping("/tiemporecorrido")
   public String showtiempo(Model model){
    model.addAttribute("tiempo", "Usted ya inicio el reocrrido de A a B, al finalizar diigte su cedula y presione el boton");
    return "tiemporecorrido";
   }
   @RequestMapping("/descansoconductor")
   public String showDescanso(Model model){
    model.addAttribute("descanso", "Gracias por haber coronado su ruta :), Haga caso y tome su descanso de 15 minutos, sea consiente. ");
    return "descansoconductor";
   }
}

