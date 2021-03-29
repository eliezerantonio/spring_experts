/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stackcode.gestao.model;

/**
 *
 * @author eliezer
 */
public enum Sabor {
    ADOCICADA("Adocicada"),
    AMARGA("Amarga"),
    FORTE("Forte"),
    FRUTADA("Frutada"),
    SUAVE("Suave");
    
   private String descricao;
   
   Sabor(String descricao){
       this.descricao=descricao;
   }
   
   public String getSabor(){
       return descricao;
   }
    
    
}
