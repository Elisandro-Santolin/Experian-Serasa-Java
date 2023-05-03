package com.t3.useraddresscomments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.t3.useraddresscomments.entity.Address;
import com.t3.useraddresscomments.entity.User;
import com.t3.useraddresscomments.repository.UserRepository;

import jakarta.transaction.Transactional;

@Component
@Transactional
public class DataLoader implements CommandLineRunner{

    @Autowired
    private UserRepository userRep;


    @Override
    public void run(String... args) throws Exception {
        User newUser = new User("vini", "Vinicius Caxias", "vini@gmail.com", "1985642155", 29);
        Address newAddress = new Address("15426-845", "Bobos", 0, "Brasil", "SP", "São Paulo");

        createUser(newUser, newAddress);

        User user1 = retrieveUser(1L);
        System.out.println("Print user witch id 1");
        System.out.println(user1.toString());

        Address address1 = user1.getAddress();
        System.out.println("Print addresss of user witch id 1");
        System.out.println(address1.toString());
    }

    public User retrieveUser(Long id){
        User user = userRep.findById(id).get();
        return user;
    }

    public void createUser(User user, Address address){
        user.setAddress(address);
        address.setUserId(user);

        userRep.save(user);
    }
}
