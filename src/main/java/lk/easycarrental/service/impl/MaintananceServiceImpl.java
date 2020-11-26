package lk.easycarrental.service.impl;

import lk.easycarrental.dto.MaintananceDTO;
import lk.easycarrental.entity.Maintanance;
import lk.easycarrental.repo.MaintananceRepo;
import lk.easycarrental.service.MaintananceService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class MaintananceServiceImpl implements MaintananceService {

    @Autowired
    MaintananceRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public boolean addMaintanance(MaintananceDTO dto) {

        Maintanance m = mapper.map(dto, Maintanance.class);
        repo.save(m);
        return true;
    }

    @Override
    public List getAllMaintanance() {
        List<Maintanance> list = repo.findAll();
        return list;
    }

    @Override
    public List searchMaintanance(String mid) {
        System.out.println(mid);
        List<Maintanance> list = repo.findByMid(mid);
        return list;
    }
}
