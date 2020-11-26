package lk.easycarrental.service;

import lk.easycarrental.dto.MaintananceDTO;

import java.util.List;

public interface MaintananceService {

    public boolean addMaintanance(MaintananceDTO dto);

    public List getAllMaintanance();

    public List searchMaintanance(String regno);


}
