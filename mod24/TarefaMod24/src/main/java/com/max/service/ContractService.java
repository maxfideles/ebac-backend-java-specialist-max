package com.max.service;

import com.max.dao.ContractDao;
import com.max.dao.IContractDao;

public class ContractService implements IContractService {

    private IContractDao contractDao;


    public ContractService(IContractDao contractDao){
        this.contractDao = contractDao;
    }

    @Override
    public String salvar() {

    return contractDao.salvar();

    }

    @Override
    public String search(Integer id) {
        return "Success";
    }

    @Override
    public String update(Integer id) {
        return "Success";
    }

    @Override
    public String delete(Integer id) {
        return "Success";
    }
}
