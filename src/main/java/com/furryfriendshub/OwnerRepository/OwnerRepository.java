package com.furryfriendshub.OwnerRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.furryfriendshub.OwnerEntity.OwnerEntity;
    
@Repository
public interface OwnerRepository extends JpaRepository<OwnerEntity, Integer> {
	public List<OwnerEntity> findByLname(String lname);
}
