package org.example.backend.store;

import org.example.backend.service.OrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {

    @Autowired
    private StoreDao storeDao;

    //상점등록 서비스
    public  int storeInsert(StoreRegistrationVo storeRegistrationVo){
        return storeDao.storeInsert(storeRegistrationVo);
    }

    //승인 확인 서비스
    public int count(int id){
        return storeDao.approveR(id);
    }

    //메뉴 등록 서비스
    public int menuRs(StoreInformationVo storeInformationVo){
        return storeDao.menuRs(storeInformationVo);
    }

    //메뉴 목록 조회 서비스
    public List<StoreInformationVo> menuList(int id){
        return storeDao.menuList(id);
    }

    //메뉴 수정 서비스
    public int menuedit(StoreInformationVo storeInformationVo){

        if (storeInformationVo.getMenuImage()==null){
            // 이미지가 null  일경우에는 원래값 그래도 사용
            return storeDao.menuedit2(storeInformationVo);
        }
        else{
            return storeDao.menuedit(storeInformationVo);
        }

    }

    //메뉴 삭제
    public int menudel(int id, String name){
           return storeDao.menudel(id,name);
    }

    //주문알람
    public List<OrderVo> order(int id){
        return storeDao.order(id);
    }

    //라이더배정

    public int rider(int id){
        return storeDao.rider(id);
    }

    //주문거절
    public int refuse(int id){
        return storeDao.refuse(id);
    }





}
