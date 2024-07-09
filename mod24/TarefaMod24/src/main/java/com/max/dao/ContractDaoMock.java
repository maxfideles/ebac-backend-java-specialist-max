package com.max.dao;

public class ContractDaoMock implements IContractDao{
    @Override
    public String salvar() {
        throw new UnsupportedOperationException("Failed");
    }

    @Override
    public String search(Integer id) {
        throw new UnsupportedOperationException("Failed");
    }

    @Override
    public String update(Integer id) {
        throw new UnsupportedOperationException("Failed");
    }

    @Override
    public String delete(Integer id) {
        throw new UnsupportedOperationException("Failed");
    }
}
