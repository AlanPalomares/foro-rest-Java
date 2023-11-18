/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mx.tecnm.cdhidalgo.fororest.domain;

import mx.tecnm.cdhidalgo.fororest.persistence.Questions;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author lupdo
 */
public interface QuestionsRepository extends JpaRepository<Questions, Integer> {
    
}
