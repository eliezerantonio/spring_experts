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
public enum Origem {

    NACIONAL("Nacional"),
    INTERNACIONAL("Internacional");

    private String descricao;

    Origem(String descricao) {
        this.descricao = descricao;

    }

    public String getDescricao() {
        return descricao;
    }

}
