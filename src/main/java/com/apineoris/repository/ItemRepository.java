package com.apineoris.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.apineoris.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

      @Query("SELECT i FROM Item i WHERE i.category = :category")
      List<Item> findByCategoryName(@Param("category") String category);
   
    
}

