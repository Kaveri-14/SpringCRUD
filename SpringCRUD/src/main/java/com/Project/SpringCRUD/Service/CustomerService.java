package com.Project.SpringCRUD.Service;

import com.Project.SpringCRUD.DTO.CustomerDTO;
import com.Project.SpringCRUD.DTO.CustomerSaveDTO;
import com.Project.SpringCRUD.DTO.CustomerUpdateDTO;

import java.util.List;

public interface CustomerService {
      String addCustomer(CustomerSaveDTO customerSaveDTO);

      List<CustomerDTO> getAllCustomer();

      String updateCustomer(CustomerUpdateDTO customerUpdateDTO);

      boolean deleteCustomer(int id);
}
