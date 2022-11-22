/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nicolle.Bus.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author nicolle
 */
public class Iniciorecorrido {
  @RequestMapping("/inicio")
   public String showHello(Model model){
    model.addAttribute("por favor ingrese sus datos");
    return "inicio";   
}
}
