package com.workintech.s18d1.dao;

import com.workintech.s18d1.entity.BreadType;
import com.workintech.s18d1.entity.Burger;

import java.util.List;

public interface BurgerDao {
    //Buradaki methodlar sorguların kullanacakları metodlar olarak düşünülebilir
    //İsimlendirmeler genelde standarttır, hangi metodun hangi sorguyu çalıştırdığını biliriz

    Burger save(Burger burger);

    List<Burger> findAll();

    Burger findById(Long id);

    Burger update(Burger burger);

    Burger remove(long id);

    List<Burger> findByPrice(Integer price);

    List<Burger> findByBreadType(BreadType breadType);

    List<Burger> findByContent(String content);
}
