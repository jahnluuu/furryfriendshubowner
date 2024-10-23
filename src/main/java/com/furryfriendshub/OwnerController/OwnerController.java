package com.furryfriendshub.OwnerController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.furryfriendshub.OwnerEntity.OwnerEntity;
import com.furryfriendshub.OwnerService.OwnerService;

@RestController
@RequestMapping("/api/furryfriendshubowner")
public class OwnerController {

    @Autowired
    OwnerService oserv;

    @GetMapping("/print")
    public String print() {
        return "Hello, Welcome to FurryFriends Hub";
    }

    @PostMapping("/postowneraccount")
    public OwnerEntity postOwnerAccount(@RequestBody OwnerEntity user) {
        return oserv.postOwnerAccounts(user);
    }

    @GetMapping("/getAllOwners")
    public List<OwnerEntity> getAllOwner() {
        return oserv.getAllOwners();
    }

    @PutMapping("/putOwnerDetails")
    public OwnerEntity putUserDetails(@RequestParam int id, @RequestBody OwnerEntity newUserDetails) {
        return oserv.putOwnerDetails(id, newUserDetails);
    }

    @DeleteMapping("/deleteOwnerDetails/{id}")
    public String deleteOwners(@PathVariable int id) {
        return oserv.deleteOwner(id);
    }
}
