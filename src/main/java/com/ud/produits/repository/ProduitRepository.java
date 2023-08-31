package com.ud.produits.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ud.produits.model.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
