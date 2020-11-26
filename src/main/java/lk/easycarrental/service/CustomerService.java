package lk.easycarrental.service;



import lk.easycarrental.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {

    public boolean saveCustomer(CustomerDTO customer);

    public List getAllCustomers();

    public List searchCustomer(String data);

    public boolean updateCustomer(CustomerDTO customer);

    public boolean deleteCustomer(CustomerDTO customer);
}
