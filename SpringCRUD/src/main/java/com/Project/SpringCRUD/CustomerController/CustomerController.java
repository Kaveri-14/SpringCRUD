package com.Project.SpringCRUD.CustomerController;


import com.Project.SpringCRUD.DTO.CustomerDTO;
import com.Project.SpringCRUD.DTO.CustomerSaveDTO;
import com.Project.SpringCRUD.DTO.CustomerUpdateDTO;
import com.Project.SpringCRUD.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //To call and work on RESTFUL API
@CrossOrigin // To use 3rd Party service (like front end)
@RequestMapping("api/v1/customer") //To make the API Path work

public class CustomerController {

    @Autowired
    private CustomerService customerService;

  @PostMapping(path="/save")
    public String saveCustomer(@RequestBody CustomerSaveDTO customerSaveDTO)
    {
    String id= customerService.addCustomer(customerSaveDTO);
    return id;
    }
    @GetMapping(path="/getAllCustomer")
    public List<CustomerDTO> getAllCustomer()
    {
        List<CustomerDTO> allCustomers=customerService.getAllCustomer();
        return allCustomers;
    }
    @PostMapping(path="/update")
    public String updateCustomer(@RequestBody CustomerUpdateDTO customerUpdateDTO)
    {
        String id= customerService.updateCustomer(customerUpdateDTO);
        return id;
    }
    @DeleteMapping(path="/delete/{id}")
    public String deleteCustomer(@PathVariable(value="id") int id)
    {
        boolean deleteCustomer= customerService.deleteCustomer(id);
        return "Deleted";
    }


    //to add/post values
}
