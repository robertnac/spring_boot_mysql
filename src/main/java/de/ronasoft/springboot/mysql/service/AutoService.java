package de.ronasoft.springboot.mysql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.ronasoft.springboot.mysql.domain.Auto;
import de.ronasoft.springboot.mysql.domain.AutoRepository;
 
@Service
@Transactional
public class AutoService {
 
    @Autowired
    private AutoRepository repo;
     
    public List<Auto> listAll() {
        return repo.findAll();
    }
     
    public void save(Auto product) {
        repo.save(product);
    }
     
    public Auto get(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }
}
