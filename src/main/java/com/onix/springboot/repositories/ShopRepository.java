package com.onix.springboot.repositories;

import com.onix.springboot.models.ShopModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface ShopRepository extends JpaRepository<ShopModel, UUID> {
}
