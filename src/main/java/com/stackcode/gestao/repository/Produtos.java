/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stackcode.gestao.repository;

import com.stackcode.gestao.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author eliezer
 */
@Repository
public interface Produtos extends JpaRepository<Produto, Long> {

}
