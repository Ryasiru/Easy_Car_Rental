package lk.easycarrental.service.impl;



import lk.easycarrental.dto.CustomerDTO;
import lk.easycarrental.entity.Customer;
import lk.easycarrental.repo.CustomerRepo;
import lk.easycarrental.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public boolean saveCustomer(CustomerDTO customer) {

            Customer c = mapper.map(customer, Customer.class);
            repo.save(c);
            return true;
    }

    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> list = repo.findAll();

        return list;
    }

    @Override
    public List searchCustomer(String data) {
        List<Customer> list = repo.findByNic(data);
        System.out.println(list.get(0).getNic());
        return list;
    }

    @Override
    public boolean updateCustomer(CustomerDTO customer) {
        Customer c = mapper.map(customer, Customer.class);
        repo.save(c);
        return true;
    }

    @Override
    public boolean deleteCustomer(CustomerDTO customer) {
        Customer c = mapper.map(customer, Customer.class);
        repo.delete(c);
        return true;
    }
}
