package com.furryfriendshub.OwnerService;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.furryfriendshub.OwnerEntity.OwnerEntity;
import com.furryfriendshub.OwnerRepository.OwnerRepository;

@Service
public class OwnerService {
    @Autowired
    OwnerRepository orepo;

    public OwnerService() {
        super();
    }

    public OwnerEntity postOwnerAccounts(OwnerEntity owner) {
        return orepo.save(owner);
    }

    public List<OwnerEntity> getAllOwners() {
        return orepo.findAll();
    }

    public OwnerEntity putOwnerDetails(int id, OwnerEntity newOwnerDetails) {
        OwnerEntity owner = orepo.findById(id).orElseThrow(() -> new NoSuchElementException("User not found"));
        owner.setFName(newOwnerDetails.getFName());
        owner.setLName(newOwnerDetails.getLName());
        owner.setEmail(newOwnerDetails.getEmail());
        owner.setPhoneNumber(newOwnerDetails.getPhoneNumber());
        owner.setAddress(newOwnerDetails.getAddress());
        owner.setPaymentType(newOwnerDetails.getPaymentType());

        return orepo.save(owner);
    }

    public String deleteOwner(int id) {
        if (orepo.findById(id).isPresent()) {
            orepo.deleteById(id);
            return "User record successfully deleted";
        } else {
            return id + " Not Found";
        }
    }
}
