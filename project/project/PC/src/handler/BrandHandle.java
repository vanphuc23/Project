package handler;

import GUI.Log_In;
import connect.ISocketClient;
import model.*;

import java.util.List;

public class BrandHandle implements IBrandHandle{
    private ISocketClient soc = new Log_In();
    @Override
    public List<Brand> findAll() {
        return soc.findAll().getListBrand();
    }

    @Override
    public void editPhone(ListTransfer editPhone) {


    }

    @Override
    public void addPhone(ListTransfer addList) {


    }

    @Override
    public void deletePhone(ListTransfer deteleList) {


    }

    @Override
    public boolean checkUp(String name) {
        return false;
    }

    @Override
    public String[] transListToArr() {
        List<Brand> list= soc.findAll().getListBrand();
        String [] arr= new String[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i).getName();

        }
        return  arr;
    }

    @Override
    public Brand findById(int id) {
        Brand b= new Brand();
        for(Brand br : soc.findAll().getListBrand()){
            if(br.getId()==id){
                b= br;
            }
        }
        return b;
    }
}
